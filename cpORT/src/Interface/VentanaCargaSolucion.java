 package Interface;

import Dominio.*;
import java.io.BufferedInputStream;
import java.io.InputStream;
import javax.swing.DefaultListModel;
import java.util.Observable;
import java.util.Observer;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;

public class VentanaCargaSolucion extends javax.swing.JFrame implements Observer {

    Sistema modelo;
    DefaultListModel listaProblemas = new DefaultListModel();
    DefaultListModel listaEquipos = new DefaultListModel();

    public VentanaCargaSolucion(Sistema unSistema) {
        modelo = unSistema;
        initComponents();

        for (int i = 0; i < modelo.listaProblemas.size(); i++) {
            listaProblemas.addElement(modelo.listaProblemas.get(i).getTitulo());
        }
        listProblemas.setModel(listaProblemas);
        for (int i = 0; i < modelo.listaEquipos.size(); i++) {
            listaEquipos.addElement(modelo.listaEquipos.get(i));
        }
        listEquipos.setModel(listaEquipos);

    }

    public void reproducirSonido(String unSonido) {
        InputStream is = getClass().getResourceAsStream("/Sonido/" + unSonido + ".wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
        }
    }

    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jFrame5 = new javax.swing.JFrame();
        jFrame6 = new javax.swing.JFrame();
        labelErrores = new javax.swing.JLabel();
        chooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listEquipos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DefaultListModel<String> model = new DefaultListModel<>();
        listResultado = new javax.swing.JList(model);
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tiempoBox = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        lengBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProblemas = new javax.swing.JList<>();
        labelResult = new javax.swing.JLabel();
        labelCorrecto = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jFrame4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jFrame4.setEnabled(false);

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
        jFrame5.getContentPane().setLayout(jFrame5Layout);
        jFrame5Layout.setHorizontalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame5Layout.setVerticalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame6Layout = new javax.swing.GroupLayout(jFrame6.getContentPane());
        jFrame6.getContentPane().setLayout(jFrame6Layout);
        jFrame6Layout.setHorizontalGroup(
            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame6Layout.setVerticalGroup(
            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carga solucion");
        setResizable(false);

        labelErrores.setFont(new java.awt.Font("Tahoma", 1, 14));
        labelErrores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel1.setText("Problema");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel2.setText("Equipo");

        String[] j = new String[modelo.listaEquipos.size()];
        for (int i = 0; i < modelo.listaEquipos.size(); i++) {
            j[i] = modelo.listaEquipos.get(i).toString();
        }
        listEquipos.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() {
                return j.length;
            }

            public String getElementAt(int i) {
                return j[i];
            }
        });
        listEquipos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listEquipos);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setText("Resultado");

        listResultado.setCellRenderer(new ColorCustom());
        jScrollPane3.setViewportView(listResultado);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel4.setText("Tiempo:");

        jScrollPane4.setViewportView(tiempoBox);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel5.setText("Lenguaje:");

        lengBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "C++", "Python" }));
        lengBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lengBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton3.setText("Verificar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        String[] p = new String[modelo.listaProblemas.size()];
        for (int i=0; i<modelo.listaProblemas.size(); i++){
            p[i] = modelo.listaProblemas.get(i).getTitulo();
        }
        listProblemas.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return p.length; }
            public String getElementAt(int i) { return p[i]; }
        });
        listProblemas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listProblemas.setToolTipText("");
        jScrollPane1.setViewportView(listProblemas);

        labelResult.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        labelResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelCorrecto.setFont(new java.awt.Font("Tahoma", 1, 14));
        labelCorrecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel5)
                                        .addGap(10, 10, 10)
                                        .addComponent(lengBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(133, 133, 133)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(14, 14, 14)
                                                        .addComponent(labelCorrecto))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addComponent(labelErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelCorrecto)))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel5))
                            .addComponent(lengBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    DefaultListModel model = new DefaultListModel();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            model.removeAllElements();
            String linkArchivoEquipo = chooser.getSelectedFile().getAbsolutePath();
            int tiempo = Integer.parseInt(tiempoBox.getText());
            int tiempoTotal = 0;
            String lenguaje = lengBox.getSelectedItem().toString();
            Problema problema = modelo.listaProblemas.get(listProblemas.getSelectedIndex());
            int indiceEquipo = listEquipos.getSelectedIndex();
            Equipo equipo = modelo.listaEquipos.get(indiceEquipo);
            ArchivoLectura archivoEquipo = new ArchivoLectura(linkArchivoEquipo);
            ArchivoLectura archivoCorreccion = new ArchivoLectura(problema.getLink());
            boolean correcto;
            int lineas = 0;
            int incorrectas = 0;
            boolean lineaCorrecta;
            boolean agregar = true;
            listResultado.setModel(model);
            while (archivoEquipo.hayMasLineas() && archivoCorreccion.hayMasLineas()) {
                lineas++;
                lineaCorrecta = true;
                if (lineas > 20) {
                    agregar = false;
                }
                if (archivoEquipo.linea().equals(archivoCorreccion.linea())) {
                    if (agregar) {
                        model.addElement("+Línea " + lineas + " Ok");
                    };
                } else {
                    String e[] = archivoEquipo.linea().split("\\s+");
                    String c[] = archivoCorreccion.linea().split("\\s+");
                    for (int i = 0; i < e.length && lineaCorrecta; i++) {
                        if (!e[i].equalsIgnoreCase(c[i])) {
                            lineaCorrecta = false;
                        }
                    }
                    if (lineaCorrecta) {
                        incorrectas++;
                        if (agregar) {
                            model.addElement("-Línea " + lineas + " Error de formato");
                        };
                    } else {
                        incorrectas++;
                        if (agregar) {
                            model.addElement("*Línea " + lineas + " Error de datos");
                        };
                    }
                }
            }
            while (archivoEquipo.hayMasLineas() || archivoCorreccion.hayMasLineas()) {
                if (lineas <= 20) {
                    model.addElement("*Línea " + lineas + " Error de datos");
                }
                incorrectas++;
                lineas++;
            }

            if (incorrectas > 0) {
                correcto = false;
                labelResult.setText("Incorrecto");
                reproducirSonido("incorrecto");
                labelErrores.setText(incorrectas + " errores en " + lineas + " lineas");
            } else {
                correcto = true;
                labelResult.setText("Correcto");
                reproducirSonido("correcto");
                labelErrores.setText("");
            }
            Envio envio = modelo.crearEnvio(correcto, lenguaje, tiempo, equipo, problema);
            int correctoBinario = correcto ? 1 : 0;
            int envioAnterior = equipo.datosEnvios.get(problema.getIndice())[2];
            int tiempoAnterior = equipo.datosEnvios.get(problema.getIndice())[1];
            equipo.agregarEnvioAEquipo(problema.getIndice(), correctoBinario, tiempo, envio);

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
                if (problema.getTiempoOK() > tiempo || problema.getTiempoOK() == 0) {
                    problema.setTiempoOK(tiempo);
                }
            }
            if (equipo.datosEnvios.get(problema.getIndice())[2] == 1 || envioAnterior == 1) {
                for (int[] cadaEnvio : equipo.datosEnvios) {
                    tiempoTotal += cadaEnvio[1];
                }
                equipo.setTiempo(tiempoTotal + (equipo.datosEnvios.get(problema.getIndice())[0] - 1) * 20);
                if (problema.getTiempoOK() > tiempo || problema.getTiempoOK() == 0) {
                    problema.setTiempoOK(tiempo);
                }
            }
            modelo.notificar();
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Al menos un campo esta vacio", "Error", 0);// Error
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero como tiempo", "error", 0);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Al menos un campo esta vacio", "Error", 0);// Error;

        }

    }

    private void lengBoxActionPerformed(java.awt.event.ActionEvent evt) {    
    }
    private javax.swing.JFileChooser chooser;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JFrame jFrame6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCorrecto;
    private javax.swing.JLabel labelErrores;
    private javax.swing.JLabel labelResult;
    private javax.swing.JComboBox<String> lengBox;
    private javax.swing.JList<String> listEquipos;
    private javax.swing.JList<String> listProblemas;
    private javax.swing.JList<String> listResultado;
    private javax.swing.JTextPane tiempoBox;

    @Override
    public void update(Observable o, Object arg) {
        listaProblemas.clear();
        listaEquipos.clear();

        for (int i = 0; i < modelo.listaProblemas.size(); i++) {
            listaProblemas.addElement(modelo.listaProblemas.get(i).getTitulo());
        }
        listProblemas.setModel(listaProblemas);

        for (int i = 0; i < modelo.listaEquipos.size(); i++) {
            listaEquipos.addElement(modelo.listaEquipos.get(i));
        }
        listEquipos.setModel(listaEquipos);

    }
}
