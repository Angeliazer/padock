package br.com.alura.padock;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PesquisaCliente {

    public User pesqCliente(Login login) {

        Gson gson = new Gson();
        String json = gson.toJson(login);

        URI url = URI.create("http://38.210.209.107:3000/usuario/login");

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(url)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        try {

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Converte JSON para objeto Java
            String jsonUser = response.body();

            Gson gsonUser = new Gson();

            return gsonUser.fromJson(jsonUser, User.class);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
    }
}
