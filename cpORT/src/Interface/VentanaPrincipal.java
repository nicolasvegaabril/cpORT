
package Interface;

import Dominio.*;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    Sistema modelo;

    public VentanaPrincipal(Sistema unSistema) {
        initComponents();
        if (Serializacion.cargarDatos() != null) {
            unSistema = Serializacion.cargarDatos();
        }
        modelo = unSistema;
    }

    
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarEstudiantes = new javax.swing.JButton();
        btnRegistrarDocentes = new javax.swing.JButton();
        btnRegistrarEquipos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEstadisticas = new javax.swing.JButton();
        btnVisualizarResultados = new javax.swing.JButton();
        btnRegistrarProblemas = new javax.swing.JButton();
        btnCargaIndividual = new javax.swing.JButton();
        btnCargaGlobal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Concurso de Programacion");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/logoConcurso.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/ort_logo.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnRegistrarEstudiantes.setText("Ver y registrar estudiantes");
        btnRegistrarEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarEstudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEstudiantesActionPerformed(evt);
            }
        });

        btnRegistrarDocentes.setText("Ver y registrar docentes");
        btnRegistrarDocentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDocentesActionPerformed(evt);
            }
        });

        btnRegistrarEquipos.setText("Ver y registrar equipos");
        btnRegistrarEquipos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEquiposActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Nicolas Vega & Guillermo Ramirez");

        btnEstadisticas.setText("Estadisicas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        btnVisualizarResultados.setText("Visualizar resultados");
        btnVisualizarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarResultadosActionPerformed(evt);
            }
        });

        btnRegistrarProblemas.setText("Ver y registrar problemas");
        btnRegistrarProblemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProblemasActionPerformed(evt);
            }
        });

        btnCargaIndividual.setText("Carga individual de solucion por equipo");
        btnCargaIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaIndividualActionPerformed(evt);
            }
        });

        btnCargaGlobal.setText("Carga global de resultados de envio");
        btnCargaGlobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaGlobalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCargaIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCargaGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRegistrarEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(btnRegistrarEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistrarDocentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistrarProblemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVisualizarResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logo)
                .addGap(18, 18, 18)
                .addComponent(btnCargaIndividual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCargaGlobal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarEstudiantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarEquipos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarDocentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarProblemas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEstadisticas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisualizarResultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    private void btnRegistrarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {

        VerEstudiantes verEstudiantes = new VerEstudiantes(modelo);
        verEstudiantes.setLocationRelativeTo(null);
        verEstudiantes.setVisible(true);
        modelo.addObserver(verEstudiantes);


    }

    private void btnRegistrarDocentesActionPerformed(java.awt.event.ActionEvent evt) {
        VerDocentes verDocentes = new VerDocentes(modelo);
        verDocentes.setLocationRelativeTo(null);
        verDocentes.setVisible(true);
    }

    private void btnRegistrarEquiposActionPerformed(java.awt.event.ActionEvent evt) {
        VerEquipos verEquipos = new VerEquipos(modelo);
        verEquipos.setLocationRelativeTo(null);
        verEquipos.setVisible(true);
        modelo.addObserver(verEquipos);
    }

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {
        Estadisticas estadisticas = new Estadisticas(modelo);
        estadisticas.setLocationRelativeTo(null);
        estadisticas.setVisible(true);
        modelo.addObserver(estadisticas);
    }

    private void btnRegistrarProblemasActionPerformed(java.awt.event.ActionEvent evt) {
        VerProblemas verProblemas = new VerProblemas(modelo);
        verProblemas.setLocationRelativeTo(null);
        verProblemas.setVisible(true);
        modelo.addObserver(verProblemas);
    }

    private void btnCargaIndividualActionPerformed(java.awt.event.ActionEvent evt) {
        VentanaCargaSolucion ventanaCargaSolucion = new VentanaCargaSolucion(modelo);
        ventanaCargaSolucion.setLocationRelativeTo(null);
        ventanaCargaSolucion.setVisible(true);
        modelo.addObserver(ventanaCargaSolucion);
    }

    private void btnVisualizarResultadosActionPerformed(java.awt.event.ActionEvent evt) {
        if (modelo.listaEquipos.isEmpty() || modelo.listaProblemas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, asegurese de haber ingresado al menos un equipo y un problema");
        } else {
            Grilla grilla = new Grilla(modelo);
            grilla.setLocationRelativeTo(null);
            grilla.setVisible(true);
            modelo.addObserver(grilla);

        }
    }

    private void btnCargaGlobalActionPerformed(java.awt.event.ActionEvent evt) {
        VentanaCargaGlobal cargaGlobal = new VentanaCargaGlobal(modelo);
        cargaGlobal.setLocationRelativeTo(null);
        cargaGlobal.setVisible(true);
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
        Serializacion.guardarDatos(modelo);
    }

    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnCargaGlobal;
    private javax.swing.JButton btnCargaIndividual;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnRegistrarDocentes;
    private javax.swing.JButton btnRegistrarEquipos;
    private javax.swing.JButton btnRegistrarEstudiantes;
    private javax.swing.JButton btnRegistrarProblemas;
    private javax.swing.JButton btnVisualizarResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

}
