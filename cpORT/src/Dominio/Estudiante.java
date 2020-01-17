package Dominio;

public class Estudiante extends Persona {

    private int semestre;
    private int numero;
    private boolean tieneEquipo;

    public Estudiante(String unNombre, int unaCedula, String unMail, int unNumero, int unSemestre) {
        this.setNombre(unNombre);
        this.setCedula(unaCedula);
        this.setMail(unMail);
        this.setSemestre(unSemestre);
        this.setNumero(unNumero);
        this.setTieneEquipo(false);
    }

    public void setSemestre(int unSemestre) {
        semestre = unSemestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setNumero(int unNumero) {
        numero = unNumero;
    }

    public int getNumero() {
        return numero;
    }

    public void setTieneEquipo(boolean unEquipo) {
        tieneEquipo = unEquipo;
    }

    public boolean getTieneEquipo() {
        return tieneEquipo;
    }

    @Override
    public boolean equals(Object obj) {
        Boolean mismo = (this.getCedula() == ((Estudiante) obj).getCedula()) || (this.getMail().equalsIgnoreCase(((Estudiante) obj).getMail())) || this.getNumero() == ((Estudiante) obj).getNumero();
        return mismo;
    }
}
