package Interface;

import Dominio.Equipo;
import Dominio.Sistema;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Grilla extends javax.swing.JFrame implements Observer {

    Sistema modelo;
    boolean ordenadoPorPuntos = false;
    ArrayList<Equipo> listaEquiposOrdenadaPuntos = new ArrayList();

    public Grilla(Sistema unSistema) {
        modelo = unSistema;
        initComponents();
        ordenar(modelo.listaEquipos);
        
    }
   
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panelEquipos = new javax.swing.JPanel();
        panelMatriz = new javax.swing.JPanel();
        panelProblemas = new javax.swing.JPanel();
        panelPuntos = new javax.swing.JPanel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Ordenar por Puntos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Ordenar por Equipo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelEquiposLayout = new javax.swing.GroupLayout(panelEquipos);
        panelEquipos.setLayout(panelEquiposLayout);
        panelEquiposLayout.setHorizontalGroup(
            panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelEquiposLayout.setVerticalGroup(
            panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelMatriz.setLayout(null);

        javax.swing.GroupLayout panelProblemasLayout = new javax.swing.GroupLayout(panelProblemas);
        panelProblemas.setLayout(panelProblemasLayout);
        panelProblemasLayout.setHorizontalGroup(
            panelProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelProblemasLayout.setVerticalGroup(
            panelProblemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPuntosLayout = new javax.swing.GroupLayout(panelPuntos);
        panelPuntos.setLayout(panelPuntosLayout);
        panelPuntosLayout.setHorizontalGroup(
            panelPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        panelPuntosLayout.setVerticalGroup(
            panelPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addComponent(panelProblemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelProblemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        ordenar(ordenarPorPuntos());
        ordenadoPorPuntos = true;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        ordenar(modelo.listaEquipos);
        ordenadoPorPuntos = false;
    }
    private JButton[][] botones;

    public ArrayList<Equipo> ordenarPorPuntos() {
        listaEquiposOrdenadaPuntos = (ArrayList) modelo.listaEquipos.clone();
        Collections.sort(listaEquiposOrdenadaPuntos);
        return listaEquiposOrdenadaPuntos;
    }

    public void ordenar(ArrayList<Equipo> unaListaEqupos) {
        panelMatriz.removeAll();
        panelMatriz.setLayout(new GridLayout(unaListaEqupos.size(), modelo.listaProblemas.size()));
        botones = new JButton[unaListaEqupos.size()][modelo.listaProblemas.size()];
        for (int i = 0; i < unaListaEqupos.size(); i++) {
            for (int j = 0; j < modelo.listaProblemas.size(); j++) {
                JButton jButton = new JButton();
                jButton.setContentAreaFilled(false);
                jButton.setOpaque(true);
                LineBorder border = new LineBorder(Color.WHITE, 2);
                jButton.setBorder(border);
                jButton.addActionListener(new ListenerBoton(i, j));
                int[] datosDeEnvio = unaListaEqupos.get(i).datosEnvios.get(modelo.listaProblemas.get(j).getIndice());
                if (datosDeEnvio[2] == 0) {
                    jButton.setBackground(Color.red);
                    String texto = String.valueOf(datosDeEnvio[0]);
                    jButton.setText(texto);
                } else {
                    if (datosDeEnvio[2] == 1) {
                        jButton.setBackground(Color.green);
                        String texto = String.valueOf(((datosDeEnvio[0] - 1) * 20) + datosDeEnvio[1]) + "/" + datosDeEnvio[0];
                        jButton.setText(texto);
                    } else {
                        jButton.setBackground(Color.white);
                    }
                }
                panelMatriz.add(jButton);
                botones[i][j] = jButton;
            }
        }

        panelEquipos.removeAll();
        panelEquipos.setLayout(new GridLayout(unaListaEqupos.size(), 1));
        for (int i = 0; i < unaListaEqupos.size(); i++) {
            JLabel label = new JLabel(unaListaEqupos.get(i).getNombre());
            label.setOpaque(true);
            label.setBorder(new EmptyBorder(0, 20, 0, 20));
            if (i % 2 == 0) {
                label.setBackground(Color.gray);
            } else {
                label.setBackground(Color.lightGray);
            }
            panelEquipos.add(label);
        }

        panelPuntos.removeAll();
        panelPuntos.setLayout(new GridLayout(unaListaEqupos.size(), 1));
        for (int i = 0; i < unaListaEqupos.size(); i++) {
            String tiempo = "Tiempo: " + String.valueOf(unaListaEqupos.get(i).getTiempo());
            String puntos = "Puntos: " + String.valueOf(unaListaEqupos.get(i).getCorrecto());
            JLabel label = new JLabel(tiempo + " " + puntos);
            label.setOpaque(true);
            label.setBorder(new EmptyBorder(0, 20, 0, 20));
            if (i % 2 == 0) {
                label.setBackground(Color.gray);
            } else {
                label.setBackground(Color.lightGray);
            }
            panelPuntos.add(label);
        }
        panelProblemas.removeAll();
        panelProblemas.setLayout(new GridLayout(1, modelo.listaProblemas.size()));
        for (int i = 0; i < modelo.listaProblemas.size(); i++) {
            JLabel label = new JLabel(modelo.listaProblemas.get(i).getTitulo());
            label.setOpaque(true);
            label.setBorder(new EmptyBorder(20, 0, 20, 0));
            label.setHorizontalAlignment(JLabel.CENTER);
            if (i % 2 == 0) {
                label.setBackground(Color.gray);
            } else {
                label.setBackground(Color.lightGray);
            }
            panelProblemas.add(label);
        }
        revalidate();
        repaint();
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelEquipos;
    private javax.swing.JPanel panelMatriz;
    private javax.swing.JPanel panelProblemas;
    private javax.swing.JPanel panelPuntos;

    private class ListenerBoton implements ActionListener {

        private int x;
        private int y;

        public ListenerBoton(int i, int j) {
            x = i;
            y = j;
        }

        public void actionPerformed(ActionEvent e) {
            clickBoton(x, y);
        }
    }

    private void clickBoton(int fila, int columna) {
        if (ordenadoPorPuntos) {
            fila = listaEquiposOrdenadaPuntos.get(fila).getNumero() - 1;
        }
        VentanaEnviosMatriz ventanaEnvioMatriz = new VentanaEnviosMatriz(modelo, fila, columna);
        ventanaEnvioMatriz.setLocationRelativeTo(null);
        ventanaEnvioMatriz.setVisible(true);
        modelo.addObserver(ventanaEnvioMatriz);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (ordenadoPorPuntos) {
            ordenar(ordenarPorPuntos());
        } else {
            ordenar(modelo.listaEquipos);
        }
    }
}
