package Interface;

import Dominio.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class VerEstudiantes extends javax.swing.JFrame implements Observer {

    Sistema modelo;
    DefaultTableModel model;

    public VerEstudiantes(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
        model = (DefaultTableModel) tablaEstudiantes.getModel();
        Object rowData[] = new Object[5];
        for (int i = 0; i < modelo.listaEstudiantes.size(); i++) { //Muestra la lista actualizada cada vez que se abre
            rowData[0] = modelo.listaEstudiantes.get(i).getNombre();
            rowData[1] = modelo.listaEstudiantes.get(i).getCedula();
            rowData[2] = modelo.listaEstudiantes.get(i).getMail();
            rowData[3] = modelo.listaEstudiantes.get(i).getNumero();
            rowData[4] = modelo.listaEstudiantes.get(i).getSemestre();
            model.addRow(rowData);
        }
    }

    private void initComponents() {

        txtNombreEstudiante1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtCIEstudiante = new javax.swing.JTextField();
        txtMailEstudiante = new javax.swing.JTextField();
        txtNumeroEstudiante = new javax.swing.JTextField();
        txtSemestreEstudiante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estudiantes registrados");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Estudiantes registrados");

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "C.I.", "Mail", "Numero", "Semestre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEstudiantes);
        if (tablaEstudiantes.getColumnModel().getColumnCount() > 0) {
            tablaEstudiantes.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaEstudiantes.getColumnModel().getColumn(3).setPreferredWidth(40);
            tablaEstudiantes.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        btnAgregar.setText("Agregar Estudiante");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Estudiante");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtNombreEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEstudianteActionPerformed(evt);
            }
        });

        txtMailEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailEstudianteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("C.I.:");

        jLabel5.setText("Mail:");

        jLabel6.setText("Numero:");

        jLabel7.setText("Semestre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCIEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMailEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(228, 228, 228)
                                        .addComponent(jLabel3)
                                        .addGap(118, 118, 118)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtNumeroEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtSemestreEstudiante))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCIEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMailEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSemestreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private void txtNombreEstudianteActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) tablaEstudiantes.getModel();
        String nombre = "";
        int CI = 0;
        String mail = "";
        int numero = 0;
        int semestre = 0;
        boolean esCorrecto = true;
        if (txtNombreEstudiante.getText().length() == 0 || txtCIEstudiante.getText().length() == 0 || txtMailEstudiante.getText().length() == 0 || txtNumeroEstudiante.getText().length() == 0 || txtSemestreEstudiante.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Al menos un campo esta vacio", "Error", 0);// Error
        } else {
            try {
                nombre = txtNombreEstudiante.getText();
                CI = Integer.parseInt(txtCIEstudiante.getText());
                mail = txtMailEstudiante.getText();
                numero = Integer.parseInt(txtNumeroEstudiante.getText());
                semestre = Integer.parseInt(txtSemestreEstudiante.getText());

            } catch (java.lang.NumberFormatException e) {                                       //tira error si le paso un string a ci,numero o semestre
                esCorrecto = false;
                JOptionPane.showMessageDialog(this, "Error al ingresar los datos", "Error", 0);// Error
            }
            if (esCorrecto) {
                Estudiante estudiante = new Estudiante(nombre, CI, mail, numero, semestre);

                if (modelo.listaEstudiantes.contains(estudiante)) {
                    JOptionPane.showMessageDialog(this, "Estudiante ya registrado", "Error", 0);// Error
                } else {
                    modelo.registrarEstudiante(estudiante);
                    txtNombreEstudiante.setText("");    // Todo este bloque de set text resetea los TextField cuando se agrega una row
                    txtMailEstudiante.setText("");
                    txtCIEstudiante.setText("");
                    txtNumeroEstudiante.setText("");
                    txtSemestreEstudiante.setText("");
                }
            }
        }
    }

    private void txtMailEstudianteActionPerformed(java.awt.event.ActionEvent evt) {  
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {

        int[] rows = tablaEstudiantes.getSelectedRows();
        DefaultTableModel model = (DefaultTableModel) tablaEstudiantes.getModel();
        for (int i = 0; i < rows.length; i++) {
            if (modelo.listaEstudiantes.get(rows[i] - i).getTieneEquipo()) {
                JOptionPane.showMessageDialog(this, "El estudiante ya esta registrado en un equipo");
            } else {
                model.removeRow(rows[i] - i);
                modelo.eliminarEstudiante(rows[i] - i, modelo.listaEstudiantes);
            }
        }
    }

    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JTextField txtCIEstudiante;
    private javax.swing.JTextField txtMailEstudiante;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtNombreEstudiante1;
    private javax.swing.JTextField txtNumeroEstudiante;
    private javax.swing.JTextField txtSemestreEstudiante;

    @Override
    public void update(Observable o, Object arg) {
        DefaultTableModel model = (DefaultTableModel) tablaEstudiantes.getModel();
        model.setRowCount(0);
        Object rowData[] = new Object[5];
        for (int i = 0; i < modelo.listaEstudiantes.size(); i++) { //Muestra la lista actualizada cada vez que se abre
            rowData[0] = modelo.listaEstudiantes.get(i).getNombre();
            rowData[1] = modelo.listaEstudiantes.get(i).getCedula();
            rowData[2] = modelo.listaEstudiantes.get(i).getMail();
            rowData[3] = modelo.listaEstudiantes.get(i).getNumero();
            rowData[4] = modelo.listaEstudiantes.get(i).getSemestre();
            model.addRow(rowData);
        }
    }
}
