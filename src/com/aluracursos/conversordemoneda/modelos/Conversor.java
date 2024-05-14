package com.aluracursos.conversordemoneda.modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Conversor
{
    private String divisaBase;
    private String divisaObjetivo;
    private double cantidad;
    private double tasaCambio;
    private LocalDateTime fecha;

    //Constructor de la clase Conversion
    public Conversor(String divisaBase, String divisaObjetivo, double cantidad, double tasaCambio, LocalDateTime fecha)
    {
        this.divisaBase = divisaBase;
        this.divisaObjetivo = divisaObjetivo;
        this.cantidad = cantidad;
        this.tasaCambio = tasaCambio;
        this.fecha = fecha;
    }

    //Devuelve una representación de cadena de la conversión, incluyendo todos los detalles
    @Override
    public String toString() {
        // Formatear la fecha en una representación legible para el usuario
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = fecha.format(formatter);

        // Construir la representación de cadena de la conversión
        return String.format("Conversion: De %s a %s =>\nLa cantidad a convertir es: %.2f =>\nLa Tasa de cambio es: %.2f =>\nFecha: %s\n",
                divisaBase, divisaObjetivo, cantidad, tasaCambio, fechaFormateada);

    }

}
