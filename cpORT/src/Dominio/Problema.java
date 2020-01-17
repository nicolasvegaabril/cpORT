package Dominio;

public class Problema implements java.io.Serializable {

    private String titulo;
    private String descripcion;
    private Docente docente;
    private String link;
    private int tiempoOK = 0;
    private int cantidadOK = 0;
    private int indice = 0;

    public Problema(String unTitulo, String unaDescripcion, String unLink, Docente unDocente, int unIndice) {
        this.setTitulo(unTitulo);
        this.setDescripcion(unaDescripcion);
        this.setDocente(unDocente);
        this.setLink(unLink);
        this.setIndice(unIndice);
    }

    public void setIndice(int unIndice) {
        indice = unIndice;
    }

    public int getIndice() {
        return indice;
    }

    public void setCantidadOK(int unNumero) {
        cantidadOK = cantidadOK + unNumero;
    }

    public int getCantidadOK() {
        return cantidadOK;
    }

    public void setTiempoOK(int unNumero) {
        tiempoOK = unNumero;
    }

    public int getTiempoOK() {
        return tiempoOK;
    }

    public void setTitulo(String unTitulo) {
        this.titulo = unTitulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setDescripcion(String unaDescripccion) {
        this.descripcion = unaDescripccion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDocente(Docente unDocente) {
        this.docente = unDocente;
    }

    public Docente getDocente() {
        return this.docente;
    }

    public void setLink(String unLink) {
        this.link = unLink;
    }

    public String getLink() {
        return this.link;
    }

}
