import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

    public void archivosdepelicula(Pelicula pelicula){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileWriter escritura = new FileWriter(pelicula.title()+".json");
            escritura.write(gson.toJson(pelicula));
            escritura.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
