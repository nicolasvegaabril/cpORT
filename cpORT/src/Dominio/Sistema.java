package Dominio;

import java.util.*;

public class Sistema extends Observable implements java.io.Serializable {

    public ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    public ArrayList<Docente> listaDocentes = new ArrayList<>();
    public ArrayList<Problema> listaProblemas = new ArrayList<>();
    public ArrayList<Equipo> listaEquipos = new ArrayList<>();
    public ArrayList<Envio> listaEnvios = new ArrayList<>();
    int contador = 0;

    public void notificar() {
        setChanged();
        notifyObservers();
    }

    public void agregarEnvio(Envio unEnvio) {
        listaEnvios.add(unEnvio);
        setChanged();
        notifyObservers();
    }

    public void registrarEstudiante(Estudiante unEstudiante) {
        listaEstudiantes.add(unEstudiante);
        setChanged();
        notifyObservers();
    }

    public void eliminarEstudiante(int i, ArrayList unaLista) {
        unaLista.remove(i);
        setChanged();
        notifyObservers();
    }

    public void registrarDocente(Docente unDocente) {
        listaDocentes.add(unDocente);
        setChanged();
        notifyObservers();
    }

    public Docente buscarDocente(String unNombreDocente) {
        Docente docente = null;
        for (int i = 0; i < listaDocentes.size(); i++) {
            if (listaDocentes.get(i).getNombre().equals(unNombreDocente)) {
                docente = listaDocentes.get(i);
            }
        }
        return docente;
    }

    public void registrarProblema(Problema unProblema) {
        listaProblemas.add(unProblema);
        setChanged();
        notifyObservers();
    }

    public void registrarEquipo(Equipo unEquipo) {
        listaEquipos.add(unEquipo);
        setChanged();
        notifyObservers();
    }

    public Estudiante buscarEstudiante(int unaCedula) {
        Estudiante e = null;
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getCedula() == unaCedula) {
                e = listaEstudiantes.get(i);

            }
        }
        return e;
    }

    public Envio crearEnvio(boolean correcto, String lenguaje, int tiempo, Equipo equipo, Problema problema) {
        Envio envio = new Envio(correcto, lenguaje, tiempo, equipo, problema);
        return envio;
    }

    public int saberIndiceProblema(String unTitulo) {
        int i = 0;
        int indice = -1;
        for (Problema problema : listaProblemas) {
            if (unTitulo.equalsIgnoreCase(problema.getTitulo())) {
                indice = i;
            }
            i++;
        }
        return indice;
    }

}
