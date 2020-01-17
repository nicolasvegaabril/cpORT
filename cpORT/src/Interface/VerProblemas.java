package Interface;

import Dominio.*;
import java.io.File;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerProblemas extends javax.swing.JFrame implements Observer {

    Sistema modelo;
    String link = null;
    DefaultTableModel model;

    public VerProblemas(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
        model = (DefaultTableModel) tablaProblemas.getModel();
        Object rowData[] = new Object[4];
        for (int i = 0; i < modelo.listaProblemas.size(); i++) {
            rowData[0] = modelo.listaProblemas.get(i).getTitulo();
            rowData[1] = modelo.listaProblemas.get(i).getDescripcion();
            rowData[2] = modelo.listaProblemas.get(i).getLink();
            rowData[3] = modelo.listaProblemas.get(i).getDocente();
            model.addRow(rowData);
        }
    }

   
    private void initComponents() {

        btnAgregarProblema = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProblemas = new javax.swing.JTable();
        txtTitulo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboDocente = new javax.swing.JComboBox<>();
        btnSeleccionLink = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Problemas registrados");
        setResizable(false);

        btnAgregarProblema.setText("Registrar Problema");
        btnAgregarProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProblemaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel1.setText("Problemas registrados");

        tablaProblemas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Descripcion", "Link", "Docente responsable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProblemas);

        jLabel2.setText("Titulo:");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Link:");

        jLabel5.setText("Docente responsable:");

        for (Docente item : modelo.listaDocentes) {
            comboDocente.addItem(item.toString());
        }
        comboDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDocenteActionPerformed(evt);
            }
        });

        btnSeleccionLink.setText("Seleccionar archivo");
        btnSeleccionLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionLinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btnSeleccionLink, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE))
                            .addComponent(comboDocente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(btnAgregarProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionLink))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnAgregarProblemaActionPerformed(java.awt.event.ActionEvent evt) {
        model = (DefaultTableModel) tablaProblemas.getModel();
        boolean existe = false;
        if (!modelo.listaDocentes.isEmpty()) {
            try {
                if (txtTitulo.getText().length() == 0 || txtDescripcion.getText().length() == 0 || link == null) {
                    JOptionPane.showMessageDialog(this, "Al menos un campo esta vacio", "Error", 0);// Error
                } else {
                    int indice = modelo.listaProblemas.size();
                    String titulo = txtTitulo.getText();
                    String descripcion = txtDescripcion.getText();
                    Docente docente = modelo.listaDocentes.get(comboDocente.getSelectedIndex());
                    Problema problema = new Problema(titulo, descripcion, link, docente, indice);
                    for (Problema problemaVerificar : modelo.listaProblemas) {
                        if (problemaVerificar.getTitulo().equals(problema.getTitulo()) && !existe) {
                            existe = true;
                        }
                    }
                    if (existe) {
                        JOptionPane.showMessageDialog(this, "Problema ya registrado", "Error", 0);// Error
                    } else {
                        for (int i = 0; i < modelo.listaEquipos.size(); i++) {
                            modelo.listaEquipos.get(i).agregarProblemaAEquipo();
                        }
                        modelo.registrarProblema(problema);
                        txtTitulo.setText("");    // Todo este bloque de set text resetea los TextField cuando se agrega una row
                        txtDescripcion.setText("");
                    }
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Seleccione un link", "Error", 0);// Error   
            }
        } else {
            JOptionPane.showMessageDialog(this, "Aun no ha ingresado ningun docente", "Error", 0);// Error
        }
    }

    private void comboDocenteActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnSeleccionLinkActionPerformed(java.awt.event.ActionEvent evt) {

        String filename = File.separator + "tmp";
        JFileChooser fileChooser = new JFileChooser(new File(filename)); //Crea un Filechooser para el link en un pop-up
        link = null;
        fileChooser.showOpenDialog(jScrollPane1);
        if (!(fileChooser.getSelectedFile() == null)) {
            link = fileChooser.getSelectedFile().getPath();
        }


    }
    private javax.swing.JButton btnAgregarProblema;
    private javax.swing.JButton btnSeleccionLink;
    private javax.swing.JComboBox<String> comboDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProblemas;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtTitulo;

    @Override
    public void update(Observable o, Object arg) {
        comboDocente.removeAllItems();
        for (Docente item : modelo.listaDocentes) {
            comboDocente.addItem(item.toString());
        }
        model.setRowCount(0);
        Object rowData[] = new Object[4];
        for (int i = 0; i < modelo.listaProblemas.size(); i++) {
            rowData[0] = modelo.listaProblemas.get(i).getTitulo();
            rowData[1] = modelo.listaProblemas.get(i).getDescripcion();
            rowData[2] = modelo.listaProblemas.get(i).getLink();
            rowData[3] = modelo.listaProblemas.get(i).getDocente().toString();
            model.addRow(rowData);
        }

    }

}
