package Dominio;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class ArchivoGrabacion {

    private Formatter out;

    public ArchivoGrabacion(String unNombre, boolean ext) {
        if (ext) {
            try {
                FileWriter arch = new FileWriter(unNombre, ext);
                out = new Formatter(arch);
            } catch (FileNotFoundException e) {
                System.out.println("No se encontro el archivo");
                System.exit(1);
            } catch (SecurityException e) {
                System.out.println("sin permisos");
                System.exit(1);
            } catch (IOException e) {
                System.out.println("no existe el archivo o no se puede extender");
                System.exit(1);
            }
        } else {
            try {
                out = new Formatter(unNombre);
            } catch (FileNotFoundException e) {
                System.out.println("no se puede crear");
                System.exit(1);
            } catch (SecurityException e) {
                System.out.println("sin permisos");
                System.exit(1);
            }
        }
    }

    public void grabarLinea(String linea) {
        out.format("%s%n", linea);
    }

    public void cerrar() {
        out.close();
    }
}
