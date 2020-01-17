package Dominio;

public class Docente extends Persona {

    private int anoDeIngreso;

    public Docente(String unNombre, int unaCedula, String unMail, int unAnoDeInreso) {
        this.setNombre(unNombre);
        this.setCedula(unaCedula);
        this.setMail(unMail);
        this.setAnoDeIngreso(unAnoDeInreso);
    }

    public void setAnoDeIngreso(int unaAnoDeIngreso) {
        this.anoDeIngreso = unaAnoDeIngreso;
    }

    public int getAnoDeIngreso() {
        return this.anoDeIngreso;
    }

    @Override
    public boolean equals(Object obj) {
        Boolean mismo = (this.getCedula() == ((Docente) obj).getCedula()) || (this.getMail().equalsIgnoreCase(((Docente) obj).getMail()));
        return mismo;
    }

    @Override
    public String toString() {
        return getNombre() + " (" + getCedula() + ')';
    }
}
