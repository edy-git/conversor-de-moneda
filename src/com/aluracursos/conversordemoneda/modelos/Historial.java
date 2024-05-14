package com.aluracursos.conversordemoneda.modelos;

import java.util.ArrayList;
import java.util.List;

public class Historial
{
    // Lista para almacenar las conversiones realizadas
    private List<Conversor> conversiones;

    //Constructor por defecto - Inicializa la lista de conversiones como una nueva lista vacía.
    public Historial() {
        this.conversiones = new ArrayList<>();
    }

    //Agrega una nueva conversión al historial
    public void agregarConversion(Conversor conversion) {
        this.conversiones.add(conversion);
    }

    //Obtiene el historial completo de conversiones
    public List<Conversor> obtenerHistorial() {
        return this.conversiones;
    }

    //Muestra el historial completo de conversiones por la consola
    public void mostrarHistorial() {
        List<Conversor> historial = obtenerHistorial();
        for (Conversor i : historial) {
            System.out.println(i);
        }
    }

}
