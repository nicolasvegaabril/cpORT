package Interface;

import Dominio.Envio;
import Dominio.Sistema;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;

public class VentanaEnviosMatriz extends javax.swing.JFrame implements Observer {


    Sistema modelo;
    DefaultListModel listaMatriz = new DefaultListModel();
    int columna;
    int fila;
    public VentanaEnviosMatriz(Sistema unSistema,int unaFila, int unaColumna) {
        
        initComponents();
        modelo=unSistema;
        columna = unaColumna;
        fila = unaFila;
        boolean incorrecto = true;
        ArrayList<Envio> enviosOrdenados = new ArrayList();
        enviosOrdenados = (ArrayList)modelo.listaEnvios.clone();
        Collections.sort(enviosOrdenados);
        for (Envio envio : enviosOrdenados) {
            if ((envio.getEquipo().getNumero()- 1) == fila && envio.getProblema().getIndice() == columna && incorrecto){
                listaMatriz.addElement(envio.resultadoEnvio());
                incorrecto = !envio.getCorrecto();
            }
        }
        listaEnviosMatriz.setModel(listaMatriz);
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaEnviosMatriz = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(listaEnviosMatriz);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }
    
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaEnviosMatriz;
    

    @Override
    public void update(Observable o, Object arg) {
        listaMatriz.clear();
        boolean incorrecto = true;
        ArrayList<Envio> enviosOrdenados = new ArrayList();
        enviosOrdenados = (ArrayList)modelo.listaEnvios.clone();
        Collections.sort(enviosOrdenados);
        for (Envio envio : enviosOrdenados) {
            if ((envio.getEquipo().getNumero()- 1) == fila && envio.getProblema().getIndice() == columna && incorrecto){
                listaMatriz.addElement(envio.resultadoEnvio());
                incorrecto = !envio.getCorrecto();
            }
        }
        listaEnviosMatriz.setModel(listaMatriz);
    }
}
