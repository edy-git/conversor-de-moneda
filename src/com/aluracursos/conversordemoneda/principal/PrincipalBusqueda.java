package com.aluracursos.conversordemoneda.principal;
import com.aluracursos.conversordemoneda.modelos.Historial;
import com.aluracursos.conversordemoneda.modelos.Menu;

import java.util.Scanner;

public class PrincipalBusqueda
{
    private static final Scanner lectura = new Scanner(System.in);

    public static void main(String[] args)
    {
        Historial historial = new Historial();
        Menu menu = new Menu(historial);
        boolean continuar = true;

        while (continuar)
        {
            menu.mostrarMenu();
            continuar = preguntarContinuar();
        }
        //Muestra el historial de las conversiones realizadas al finalizar el programa
        System.out.println("\n-------------------- Historial de las conversiones realizadas: -------------------\n");
        historial.mostrarHistorial();
        System.out.println("-----------------------------------------------------------------------------------\n");
        fin();

    }
    private static boolean preguntarContinuar() {
        System.out.println("¿Desea realizar otra conversión? (s/n): ");
        String respuesta = lectura.nextLine();
        return respuesta.equalsIgnoreCase("s");
   }
    private static void fin() {
        System.out.println("""
                *******************************************************************************
                * Gracias por usar nuestro servicio de conversión de monedas. ¡Vuelva pronto! *
                *******************************************************************************""");
    }
}
