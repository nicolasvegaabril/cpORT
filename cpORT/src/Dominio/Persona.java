package Dominio;

public class Persona implements java.io.Serializable {

    private String nombre;
    private int cedula;
    private String mail;

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCedula(int unaCedula) {
        this.cedula = unaCedula;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setMail(String unMail) {
        this.mail = unMail;
    }

    public String getMail() {
        return this.mail;
    }

}
