package Dominio;

import java.util.ArrayList;

public class Equipo implements java.io.Serializable, Comparable {

    public int numero;
    public int tiempo;
    public int correcto;
    public String nombre;
    public Estudiante[] estudiantesEnEquipo = new Estudiante[3];
    public ArrayList<int[]> datosEnvios = new ArrayList();

    public void agregarProblemaAEquipo() { //Agrega un espacio en el ArrayList para futuros datos del problema
        int[] arr = new int[3];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = -1;
        datosEnvios.add(arr);
    }

    public void agregarEnvioAEquipo(int numeroProblema, int correcto, int tiempo, Envio unEnvio) {
        if (correcto == 1 && datosEnvios.get(numeroProblema)[2] == 1) { //Le paso correcto y ya tenia un correcto
            if (tiempo < datosEnvios.get(numeroProblema)[1]) {
                datosEnvios.get(numeroProblema)[1] = tiempo;
                int erroresPrevios = 0;
                for (Envio envio : Main.sistema.listaEnvios) {
                    if (envio.getTiempo() < tiempo && envio.getEquipo().getNumero() == numero && envio.getProblema().getIndice() == numeroProblema) {
                        erroresPrevios++;
                    }
                }
                datosEnvios.get(numeroProblema)[0] = erroresPrevios + 1;
            }
        } else {
            if (datosEnvios.get(numeroProblema)[2] == 1 && correcto == 0) { //Ya tenia correcto y le paso incorrecto
                if (tiempo < datosEnvios.get(numeroProblema)[1]) {
                    datosEnvios.get(numeroProblema)[0] += 1;
                }
            } else {
                if (tiempo < datosEnvios.get(numeroProblema)[1]) {  //Tenia incorrecto y le paso correcto
                    datosEnvios.get(numeroProblema)[1] = tiempo;
                    int erroresPrevios = 0;
                    for (Envio envio : Main.sistema.listaEnvios) {
                        if (envio.getTiempo() < tiempo && envio.getEquipo().getNumero() == numero && envio.getProblema().getIndice() == numeroProblema) {
                            erroresPrevios++;
                        }
                    }
                    datosEnvios.get(numeroProblema)[0] = erroresPrevios + 1;
                } else {                        //Tenia incorrecto y le paso incorrecto
                    datosEnvios.get(numeroProblema)[0] += 1;
                    datosEnvios.get(numeroProblema)[1] = tiempo;
                    datosEnvios.get(numeroProblema)[2] = correcto;
                }
            }
        }

    }

    public void setEstudiante(int index, Estudiante unEstudiante) {
        estudiantesEnEquipo[index] = unEstudiante;
    }

    public void setNumero(int unNumero) {
        numero = unNumero;
        nombre = "Equipo " + unNumero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;

    }

    public void setCorrecto(int unNumero) {
        correcto = unNumero;
    }

    public int getCorrecto() {
        return correcto;
    }

    public void setTiempo(int unNumero) {
        tiempo = unNumero;
    }

    public int getTiempo() {
        return tiempo;
    }

    @Override
    public String toString() {
        return this.getNombre() + " ( " + this.estudiantesEnEquipo[0].getNombre() + " | " + this.estudiantesEnEquipo[1].getNombre() + " | " + this.estudiantesEnEquipo[2].getNombre() + " )";
    }

    @Override
    public int compareTo(Object unEquipo) {
        int comparePuntos = ((Equipo) unEquipo).getCorrecto();
        return comparePuntos - this.getCorrecto();
    }

}
