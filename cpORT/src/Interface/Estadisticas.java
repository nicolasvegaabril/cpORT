package Interface;

import Dominio.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.table.DefaultTableModel;

public class Estadisticas extends javax.swing.JFrame implements Observer {

    Sistema modelo;
    DefaultTableModel model;

    public Estadisticas(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
        model = (DefaultTableModel) tablaProblemas.getModel();
        Object rowData[] = new Object[3];
        for (int i = 0; i < modelo.listaProblemas.size(); i++) {
            rowData[0] = modelo.listaProblemas.get(i).getTitulo();
            rowData[1] = modelo.listaProblemas.get(i).getCantidadOK();
            rowData[2] = modelo.listaProblemas.get(i).getTiempoOK();
            model.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProblemas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadisticas");
        setResizable(false);

        tablaProblemas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ejercicio", "Cantidad OK", "Tiempo 1º  OK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaProblemas.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tablaProblemas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProblemas;

    @Override
    public void update(Observable o, Object arg) {
        model = (DefaultTableModel) tablaProblemas.getModel(); 
        model.setRowCount(0);
        Object rowData[] = new Object[3];
        for (int i = 0; i < modelo.listaProblemas.size(); i++) {
            rowData[0] = modelo.listaProblemas.get(i).getTitulo();
            rowData[1] = modelo.listaProblemas.get(i).getCantidadOK();
            rowData[2] = modelo.listaProblemas.get(i).getTiempoOK();
            model.addRow(rowData);
        }
    }
}
