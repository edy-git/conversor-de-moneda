package com.aluracursos.conversordemoneda.api;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversorDeMoneda
{
    private static final String API_KEY = "c58eeaf11c3cac0c5b8076bc";

    public MedidaDeConversion buscaTipoMoneda(String monedaBase, String monedaObjetivo, double monto)
    {
        // Construye la URL para la solicitud
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+
                API_KEY+ "/pair/"+monedaBase+"/"+monedaObjetivo+"/"+monto);

        try {
            //El cliente nos representarme y para ello se utiliza HttpClient
            HttpClient client = HttpClient.newHttpClient();
            //Para solicitar el pedido en una orden se usa HttpRequest
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            // El patron Builder me permite construir el pedido,
            // en este caso, solo es una URI, pero puede tener mas pedidos

            //Se utiliza .body() para referirnos especificamente al cuerpo del Json
            //xq el json tiene otros datos que se podrian añadir automaticamente
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), MedidaDeConversion.class);
        }
        catch (Exception e) {
            // Registrar si se produce un error
            System.err.println("Error al obtener la tasa de cambio: " + e.getMessage());
            throw new RuntimeException("Error - Finalizando la aplicacion.");
        }
    }

}
