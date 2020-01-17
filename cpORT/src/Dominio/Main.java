package Dominio;
import Interface.*;

public class Main {

static Sistema sistema = new Sistema();

    public static void main(String[] args) {
        
        try { //look and feel windows
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCargaSolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCargaSolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCargaSolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCargaSolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        VentanaPrincipal ventana = new VentanaPrincipal(sistema);
        ventana.setLocationRelativeTo(null); 
        ventana.setVisible(true);
    }

}
