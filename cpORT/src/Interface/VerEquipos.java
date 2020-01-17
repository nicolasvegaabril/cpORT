package Interface;

import Dominio.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerEquipos extends javax.swing.JFrame implements Observer {

    DefaultTableModel modeloTabla;
    Sistema modelo;
    DefaultTableModel modeloTablaEst;
    int contador = 0;

    public VerEquipos(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
        modeloTablaEst = (DefaultTableModel) tablaEstudiantesLibres.getModel();
        Object rowData[] = new Object[5];
        for (int i = 0; i < modelo.listaEstudiantes.size(); i++) { //Muestra la lista actualizada cada vez que se abre
            if (!modelo.listaEstudiantes.get(i).getTieneEquipo()) {
                rowData[0] = modelo.listaEstudiantes.get(i).getNombre();
                rowData[1] = modelo.listaEstudiantes.get(i).getCedula();
                rowData[2] = modelo.listaEstudiantes.get(i).getMail();
                rowData[3] = modelo.listaEstudiantes.get(i).getNumero();
                rowData[4] = modelo.listaEstudiantes.get(i).getSemestre();
                modeloTablaEst.addRow(rowData);
            }
        }
        modeloTabla = (DefaultTableModel) tablaEquipos.getModel();
        Object rowData2[] = new Object[2];
        for (int i = 0; i < modelo.listaEquipos.size(); i++) { //Muestra la lista actualizada cada vez que se abre
            rowData2[0] = "Equipo" + (i + 1);
            rowData2[1] = modelo.listaEquipos.get(i);
            modeloTabla.addRow(rowData2);
        }

        try {
            contador = modelo.listaEquipos.size() + 1;
        } catch (NullPointerException e) {
            contador = 1;
        }
    }

   
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEquipos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEstudiantesLibres = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("Eliminar Docente");

        jButton1.setText("Registrar Docente");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Equipos registrados");

        tablaEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de equipo", "Integrantes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEquipos);
        if (tablaEquipos.getColumnModel().getColumnCount() > 0) {
            tablaEquipos.getColumnModel().getColumn(0).setResizable(false);
            tablaEquipos.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Equipos registrados");

        tablaEstudiantesLibres.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaEstudiantesLibres);

        btnRegistrar.setText("Registrar Equipo");
        btnRegistrar.setMaximumSize(new java.awt.Dimension(117, 32));
        btnRegistrar.setMinimumSize(new java.awt.Dimension(117, 32));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(117, 32));
        btnRegistrar.setSelected(true);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Estudiantes disponibles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(416, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        
        
        DefaultTableModel modeloTablaEst = (DefaultTableModel) tablaEstudiantesLibres.getModel();
        int[] rows = tablaEstudiantesLibres.getSelectedRows();
        if (rows.length == 3) {
            Equipo unEquipo = new Equipo();
            for (int i = 0; i < rows.length; i++) {
                int cedula = (int) modeloTablaEst.getValueAt(rows[i] - i, 1);
                Estudiante unEstudiante = modelo.buscarEstudiante(cedula);
                unEquipo.estudiantesEnEquipo[i] = unEstudiante;
                unEstudiante.setTieneEquipo(true);
                modeloTablaEst.removeRow(rows[i] - i);
            }
            unEquipo.setNumero(contador);
            for (Problema problema : modelo.listaProblemas) {
                unEquipo.agregarProblemaAEquipo();
            }
            modelo.registrarEquipo(unEquipo);
            contador++;

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione 3 estudiantes", "Error", 0);// Error;
        }
       



    }
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaEquipos;
    private javax.swing.JTable tablaEstudiantesLibres;

    @Override
    public void update(Observable o, Object arg) {
        modeloTablaEst = (DefaultTableModel) tablaEstudiantesLibres.getModel();
        modeloTablaEst.setRowCount(0);
        Object rowData[] = new Object[5];
        for (int i = 0; i < modelo.listaEstudiantes.size(); i++) { //Muestra la lista actualizada cada vez que se updatea
            if (!modelo.listaEstudiantes.get(i).getTieneEquipo()) {
                rowData[0] = modelo.listaEstudiantes.get(i).getNombre();
                rowData[1] = modelo.listaEstudiantes.get(i).getCedula();
                rowData[2] = modelo.listaEstudiantes.get(i).getMail();
                rowData[3] = modelo.listaEstudiantes.get(i).getNumero();
                rowData[4] = modelo.listaEstudiantes.get(i).getSemestre();
                modeloTablaEst.addRow(rowData);
            }
        }
        modeloTabla = (DefaultTableModel) tablaEquipos.getModel();
        modeloTabla.setRowCount(0);
        Object rowData2[] = new Object[2];
        for (int i = 0; i < modelo.listaEquipos.size(); i++) { //Muestra la lista actualizada cada vez que se updatea
            rowData2[0] = modelo.listaEquipos.get(i).getNombre();
            rowData2[1] = modelo.listaEquipos.get(i);
            modeloTabla.addRow(rowData2);
        }
    }
}
