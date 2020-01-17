package Dominio;

public class Envio implements java.io.Serializable, Comparable {

    boolean correcto;
    String lenguaje;
    int tiempo;
    Equipo equipo;
    Problema problema;

    public Envio(boolean esCorrecto, String unLenguaje, int unTiempo, Equipo unEquipo, Problema unProblema) {
        this.setCorrecto(esCorrecto);
        this.setLenguaje(unLenguaje);
        this.setTiempo(unTiempo);
        this.setEquipo(unEquipo);
        this.setProblema(unProblema);
    }

    public void setCorrecto(boolean esCorrecto) {
        correcto = esCorrecto;
    }

    public boolean getCorrecto() {
        return correcto;
    }

    public void setLenguaje(String unLenguaje) {
        lenguaje = unLenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setTiempo(int unTiempo) {
        tiempo = unTiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setEquipo(Equipo unEquipo) {
        equipo = unEquipo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setProblema(Problema unProblema) {
        problema = unProblema;
    }

    public Problema getProblema() {
        return problema;
    }

    public String getTituloProblema() {
        return problema.getTitulo();
    }

    public int getEquipoNumero() {
        return equipo.getNumero();
    }

    public String resultadoEnvio() { //Devuelve el resultado para la lista en la grilla
        String resultado;
        if (correcto) {
            resultado = "Ok";
        } else {
            resultado = "Incorrecto";
        }
        return "Tiempo: " + this.getTiempo() + ", Lenguaje: " + this.getLenguaje() + ", Resultado: " + resultado;
    }

    @Override
    public String toString() {
        return this.getLenguaje() + " " + this.getTituloProblema() + " " + this.getEquipoNumero() + " " + this.getTiempo();
    }

    @Override
    public int compareTo(Object unEnvio) {
        int compareTiempo = ((Envio) unEnvio).getTiempo();
        return this.getTiempo() - compareTiempo;
    }
}
