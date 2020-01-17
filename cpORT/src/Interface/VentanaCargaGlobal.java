package Interface;

import Dominio.ArchivoGrabacion;
import Dominio.ArchivoLectura;
import Dominio.Envio;
import Dominio.Equipo;
import Dominio.Problema;
import Dominio.Sistema;
import javax.swing.JOptionPane;

public class VentanaCargaGlobal extends javax.swing.JFrame {

    Sistema modelo;
    boolean yaExiste = true;

    public VentanaCargaGlobal(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
    }

   
    private void initComponents() {

        chooser = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carga global de resultados de envio");

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String linkArchivoLectura = chooser.getSelectedFile().getAbsolutePath();
        ArchivoLectura archivoLectura = new ArchivoLectura(linkArchivoLectura);
        int numeroLinea = 0;
        boolean error = false;
        while (archivoLectura.hayMasLineas() && !error) {
            boolean correcto;
            numeroLinea++;
            int tiempoTotal = 0;
            String[] linea = archivoLectura.linea().split("\\#+"); //Divide a la linea en un array
            int indiceEquipo = (Integer.parseInt(linea[0].split("\\s+")[1])) - 1;
            if (indiceEquipo <= modelo.listaEquipos.size()) { //Si existe el equipo del que se habla
                Equipo equipo = modelo.listaEquipos.get(indiceEquipo);
                try { //Si se ingresa un problema no registrado
                    int indiceProblema = modelo.saberIndiceProblema(linea[2]); //Si no esta registrado, devuelve -1 y por lo tanto es OutOfBounds
                    Problema problema = modelo.listaProblemas.get(indiceProblema);
                    if (linea[4].equals("ok")) {
                        correcto = true;
                    } else {
                        correcto = false;
                    }
                    int correctoBinario = correcto ? 1 : 0;
                    int tiempoAnterior = equipo.datosEnvios.get(problema.getIndice())[1];
                    int tiempo = Integer.parseInt(linea[3]);
                    Envio envio = modelo.crearEnvio(correcto, linea[1], Integer.parseInt(linea[3]), equipo, problema);
                    int envioAnterior = equipo.datosEnvios.get(indiceProblema)[2];
                    equipo.agregarEnvioAEquipo(problema.getIndice(), correctoBinario, Integer.parseInt(linea[3]), envio);
                    if (correctoBinario == 1 && envioAnterior == 1) { // le paso correcto y ya tenia correcto
                        if (tiempo < tiempoAnterior) {
                            modelo.agregarEnvio(envio);
                        }
                    } else {
                        if (equipo.datosEnvios.get(problema.getIndice())[2] == 1 && correctoBinario == 0) { // ya tenia correcto y le paso incorrecto
                            if (tiempo < equipo.datosEnvios.get(problema.getIndice())[1]) {
                                modelo.agregarEnvio(envio);
                            }
                        } else {
                            if (tiempo < equipo.datosEnvios.get(problema.getIndice())[1]) {  //tenia incorrecto y le paso correcto
                                modelo.agregarEnvio(envio);
                            } else {                        //tenia incorrecto y le paso incorrecto
                                modelo.agregarEnvio(envio);
                            }
                        }
                    }
                    if (correcto && (envioAnterior == 0 || envioAnterior == -1)) {
                        equipo.setCorrecto(equipo.getCorrecto() + 1);
                        problema.setCantidadOK(1);
                        if (problema.getTiempoOK() > Integer.parseInt(linea[3]) || problema.getTiempoOK() == 0) {
                            problema.setTiempoOK(Integer.parseInt(linea[3]));
                        }
                    }
                    if (equipo.datosEnvios.get(problema.getIndice())[2] == 1 || envioAnterior == 1) {
                        for (int[] cadaEnvio : equipo.datosEnvios) {
                            tiempoTotal += cadaEnvio[1];
                        }
                        equipo.setTiempo(tiempoTotal + (equipo.datosEnvios.get(indiceProblema)[0] - 1) * 20);
                        if (problema.getTiempoOK() > Integer.parseInt(linea[3]) || problema.getTiempoOK() == 0) {
                            problema.setTiempoOK(Integer.parseInt(linea[3]));
                        }
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    error = true;
                    JOptionPane.showMessageDialog(this, "El problema que intenta ingresar no esta registrado", "Error", 0);// Error
                }
            } else {
                ArchivoGrabacion inconsistencias = new ArchivoGrabacion("inconsistencias.txt", yaExiste); //Crea el archivo solo si no existe
                yaExiste = true;
                String grabacion = "Linea " + numeroLinea + " " + linea[0];
                inconsistencias.grabarLinea(grabacion);
                inconsistencias.cerrar();
            }
        }
        modelo.notificar();
    }

    private javax.swing.JFileChooser chooser;
    private javax.swing.JButton jButton1;
}
