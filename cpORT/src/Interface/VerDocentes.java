package Interface;

import Dominio.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDocentes extends javax.swing.JFrame {

    Sistema sistema;

    public VerDocentes(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tablaDocentes.getModel();
        Object rowData[] = new Object[4];
        for (int i = 0; i < sistema.listaDocentes.size(); i++) {
            rowData[0] = sistema.listaDocentes.get(i).getNombre();
            rowData[1] = sistema.listaDocentes.get(i).getCedula();
            rowData[2] = sistema.listaDocentes.get(i).getMail();
            rowData[3] = sistema.listaDocentes.get(i).getAnoDeIngreso();
            model.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDocentes = new javax.swing.JTable();
        btnAgregarDocente = new javax.swing.JButton();
        txtNombreDocente = new javax.swing.JTextField();
        txtCIDocente = new javax.swing.JTextField();
        txtMailDocente = new javax.swing.JTextField();
        txtAnoIngreso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Docentes registrados");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Docentes registrados");

        tablaDocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nombre", "C.I.", "Mail", "Año de ingreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(tablaDocentes);
        if (tablaDocentes.getColumnModel().getColumnCount() > 0) {
            tablaDocentes.getColumnModel().getColumn(0).setResizable(false);
            tablaDocentes.getColumnModel().getColumn(1).setResizable(false);
            tablaDocentes.getColumnModel().getColumn(2).setResizable(false);
            tablaDocentes.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAgregarDocente.setText("Registrar Docente");
        btnAgregarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDocenteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("C.I.:");

        jLabel4.setText("Mail:");

        jLabel5.setText("Año de ingreso:");

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
                            .addComponent(txtNombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCIDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMailDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE))
                            .addComponent(txtAnoIngreso))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(btnAgregarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCIDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMailDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnAgregarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    private void btnAgregarDocenteActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) tablaDocentes.getModel();
        String nombre = "";
        int CI = 0;
        String mail = "";
        int ano = 0;
        boolean esCorrecto = true;
        if (txtNombreDocente.getText().length() == 0 || txtCIDocente.getText().length() == 0 || txtMailDocente.getText().length() == 0 || txtAnoIngreso.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Al menos un campo esta vacio", "Error", 0);// Error
        } else {
            try {
                nombre = txtNombreDocente.getText();
                CI = Integer.parseInt(txtCIDocente.getText());
                mail = txtMailDocente.getText();
                ano = Integer.parseInt(txtAnoIngreso.getText());
            } catch (java.lang.NumberFormatException e) { //error cuando le da un string a ci o ano
                esCorrecto = false;
                JOptionPane.showMessageDialog(this, "Error al ingresar los datos", "Error", 0);// Error
            }
            if (esCorrecto) {
                Docente docente = new Docente(nombre, CI, mail, ano);
                if (sistema.listaDocentes.contains(docente)) {
                    JOptionPane.showMessageDialog(this, "Usuario ya registrado", "Error", 0);// Error
                } else {
                    sistema.registrarDocente(docente);
                    Object rowData[] = new Object[4];
                    int i = sistema.listaDocentes.size() - 1;
                    rowData[0] = sistema.listaDocentes.get(i).getNombre();
                    rowData[1] = sistema.listaDocentes.get(i).getCedula();
                    rowData[2] = sistema.listaDocentes.get(i).getMail();
                    rowData[3] = sistema.listaDocentes.get(i).getAnoDeIngreso();
                    model.addRow(rowData);
                    txtNombreDocente.setText("");    // Resetea los TextField cuando se agrega una row
                    txtCIDocente.setText("");
                    txtMailDocente.setText("");
                    txtAnoIngreso.setText("");
                }
            }
        }
    }
    
    private javax.swing.JButton btnAgregarDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDocentes;
    private javax.swing.JTextField txtAnoIngreso;
    private javax.swing.JTextField txtCIDocente;
    private javax.swing.JTextField txtMailDocente;
    private javax.swing.JTextField txtNombreDocente;
    
}
