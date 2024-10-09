import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarPelicula {

    public Pelicula busquedaPelicula(int numeroPelicula){
        String direccion = "https://swapi.dev/api/films/"+numeroPelicula+"/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            //llamado response
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            return  new Gson().fromJson(json, Pelicula.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre la pelicula solicitada");
        }



    }
}
