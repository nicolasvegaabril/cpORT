package Dominio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Serializacion {

    public static void guardarDatos(Sistema unSistema) {
        ArrayList<Object> data = new ArrayList<>();
        data.add(unSistema);
        try {
            ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get("datos.ser")));
            out.writeObject(unSistema);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Sistema cargarDatos() {
        Sistema datos = null;
        File file = new File("datos.ser");
        if (file.exists()) {
            try {
                FileInputStream fileIn = new FileInputStream("datos.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                datos = (Sistema) in.readObject();
                in.close();
                fileIn.close();

            } catch (IOException e) {
                e.printStackTrace();
                return null;
            } catch (ClassNotFoundException c) {
                c.printStackTrace();
                return null;

            }

        }
        return datos;

    }
}
