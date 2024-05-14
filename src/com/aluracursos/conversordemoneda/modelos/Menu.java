package com.aluracursos.conversordemoneda.modelos;

import com.aluracursos.conversordemoneda.api.ConsultaConversorDeMoneda;
import com.aluracursos.conversordemoneda.api.MedidaDeConversion;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.exit;

public class Menu
{
    private static final ConsultaConversorDeMoneda consultaConversorDeMoneda = new ConsultaConversorDeMoneda();
    private static final Scanner lecturaDatos = new Scanner(System.in);
    private final Historial historial;

    int opcionMoneda = 0;
    double cantidad = 0.0;
    DecimalFormat formato = new DecimalFormat("#.00");
    String cantidadFormateada = "";
    String montoFormateado = "";

    public Menu(Historial historial)
    {
        this.historial = historial;
    }

    public void mostrarMenu()
    {
        System.out.println("""
        ****************************************************
        *****Bienvenido al Conversor de Monedas v1.0!!!*****
        
        1. Convertir de Dólar Americano ==> peso Boliviano
        2. Convertir de peso Boliviano ==> Dólar Americano
        ----------------------------------------------------
        3. Convertir de Dólar Americano ==> Peso Argentino
        4. Convertir de Peso Argentino ==>  Dólar Americano
        ----------------------------------------------------
        5. Convertir de Dólar Americano ==> Real Brasileño
        6. Convertir de Real Brasileño ==>  Dólar Americano
        ----------------------------------------------------
        7. Convertir de Dólar Americano ==> Peso Colombiano
        8. Convertir de Peso Colombiano ==>  Dólar Americano
        ----------------------------------------------------
        9. Convertir de Dólar Americano ==>  Peso Mexicano
        10. Convertir de Peso Mexicano ==> Dólar Americano
        ****************************************************
        
        Elija el número de la opción deseada:""");

        MedidaDeConversion medidaDeConversion;
        Conversor conversion;

        try {
            opcionMoneda = lecturaDatos.nextInt();
            switch (opcionMoneda)
            {
                case 1:
                    System.out.println("Ingrese el valor que desea convertir? Si va a ingresar decimales que sean con puntos, o numeros enteros");
                    cantidad = lecturaDatos.nextDouble();
                    medidaDeConversion = consultaConversorDeMoneda.buscaTipoMoneda("USD","BOB",cantidad);

                    cantidadFormateada = formato.format(cantidad);
                    montoFormateado = formato.format(medidaDeConversion.conversion_result());

                    //Muestra el resultado de la conversión al usuario
                    System.out.println("───────────────────────────────────────────────────────────────────");
                    System.out.println("El resultado de convertir " + cantidadFormateada + " " +
                            "[USD]" + " a " + "[BOB]" + " es: " + montoFormateado + " [BOB]");
                    System.out.println("───────────────────────────────────────────────────────────────────\n");

                    //Crea un objeto Conversion y lo agrega al historial
                    conversion = new Conversor("USD", "BOB", cantidad,
                            medidaDeConversion.conversion_result(),LocalDateTime.now());
                    this.historial.agregarConversion(conversion);
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desea convertir? Si va a ingresar decimales que sean con puntos, o numeros enteros");
                    cantidad = lecturaDatos.nextDouble();
                    medidaDeConversion = consultaConversorDeMoneda.buscaTipoMoneda("BOB","USD",cantidad);

                    formato = new DecimalFormat("#.00");
                    cantidadFormateada = formato.format(cantidad);
                    montoFormateado = formato.format(medidaDeConversion.conversion_result());

                    //Muestra el resultado de la conversión al usuario
                    System.out.println("───────────────────────────────────────────────────────────────────");
                    System.out.println("El resultado de convertir " + cantidadFormateada + " " +
                            "[BOB]" + " a " + "[USD]" + " es: " + montoFormateado + " [USD]");
                    System.out.println("───────────────────────────────────────────────────────────────────\n");

                    //Crea un objeto Conversion y lo agrega al historial
                    conversion = new Conversor("BOB", "USD", cantidad,
                            medidaDeConversion.conversion_result(),LocalDateTime.now());
                    this.historial.agregarConversion(conversion);
                    break;
                case 3:
                    System.out.println("Ingrese el valor que desea convertir? Si va a ingresar decimales que sean con puntos, o numeros enteros");
                    cantidad = lecturaDatos.nextDouble();
                    medidaDeConversion = consultaConversorDeMoneda.buscaTipoMoneda("USD","ARS",cantidad);

                    cantidadFormateada = formato.format(cantidad);
                    montoFormateado = formato.format(medidaDeConversion.conversion_result());

                    //Muestra el resultado de la conversión al usuario
                    System.out.println("───────────────────────────────────────────────────────────────────");
                    System.out.println("El resultado de convertir " + cantidadFormateada + " " +
                            "[USD]" + " a " + "[ARS]" + " es: " + montoFormateado + " [ARS]");
                    System.out.println("───────────────────────────────────────────────────────────────────\n");

                    //Crea un objeto Conversion y lo agrega al historial
                    conversion = new Conversor("USD", "ARS", cantidad,
                            medidaDeConversion.conversion_result(),LocalDateTime.now());
                    this.historial.agregarConversion(conversion);
                    break;
                case 4:
                    System.out.println("Ingrese el valor que desea convertir? Si va a ingresar decimales que sean con puntos, o numeros enteros");
                    cantidad = lecturaDatos.nextDouble();
                    medidaDeConversion = consultaConversorDeMoneda.buscaTipoMoneda("ARS","USD",cantidad);

                    cantidadFormateada = formato.format(cantidad);
                    montoFormateado = formato.format(medidaDeConversion.conversion_result());

                    //Muestra el resultado de la conversión al usuario
                    System.out.println("───────────────────────────────────────────────────────────────────");
                    System.out.println("El resultado de convertir " + cantidadFormateada + " " +
                            "[ARS]" + " a " + "[USD]" + " es: " + montoFormateado + " [USD]");
                    System.out.println("───────────────────────────────────────────────────────────────────\n");

                    //Crea un objeto Conversion y lo agrega al historial
                    conversion = new Conversor("ARS", "USD", cantidad,
                            medidaDeConversion.conversion_result(),LocalDateTime.now());
                    this.historial.agregarConversion(conversion);
                    break;
                case 5:
                    System.out.println("Ingrese el valor que desea convertir? Si va a ingresar decimales que sean con puntos, o numeros enteros");
                    cantidad = lecturaDatos.nextDouble();
                    medidaDeConversion = consultaConversorDeMoneda.buscaTipoMoneda("USD","BRL",cantidad);

                    cantidadFormateada = formato.format(cantidad);
                    montoFormateado = formato.format(medidaDeConversion.conversion_result());

                    //Muestra el resultado de la conversión al usuario
                    System.out.println("───────────────────────────────────────────────────────────────────");
                    System.out.println("El resultado de convertir " + cantidadFormateada + " " +
                            "[USD]" + " a " + "[BRL]" + " es: " + montoFormateado + " [BRL]");
                    System.out.println("───────────────────────────────────────────────────────────────────\n");

                    //Crea un objeto Conversion y lo agrega al historial
                    conversion = new Conversor("USD", "BRL", cantidad,
                            medidaDeConversion.conversion_result(),LocalDateTime.now());
                    this.historial.agregarConversion(conversion);
                    break;
                case 6:
                    System.out.println("Ingrese el valor que desea convertir? Si va a ingresar decimales que sean con puntos, o numeros enteros");
                    cantidad = lecturaDatos.nextDouble();
                    medidaDeConversion = consultaConversorDeMoneda.buscaTipoMoneda("BRL","USD",cantidad);

                    cantidadFormateada = formato.format(cantidad);
                    montoFormateado = formato.format(medidaDeConversion.conversion_result());

                    //Muestra el resultado de la conversión al usuario
                    System.out.println("───────────────────────────────────────────────────────────────────");
                    System.out.println("El resultado de convertir " + cantidadFormateada + " " +
                            "[BRL]" + " a " + "[USD]" + " es: " + montoFormateado + " [USD]");
                    System.out.println("───────────────────────────────────────────────────────────────────\n");

                    //Crea un objeto Conversion y lo agrega al historial
                    conversion = new Conversor("BRL", "USD", cantidad,
                            medidaDeConversion.conversion_result(),LocalDateTime.now());
                    this.historial.agregarConversion(conversion);
                    break;
                case 7:
                    System.out.println("Ingrese el valor que desea convertir? Si va a ingresar decimales que sean con puntos, o numeros enteros");
                    cantidad = lecturaDatos.nextDouble();
                    medidaDeConversion = consultaConversorDeMoneda.buscaTipoMoneda("USD","COP",cantidad);

                    cantidadFormateada = formato.format(cantidad);
                    montoFormateado = formato.format(medidaDeConversion.conversion_result());

                    //Muestra el resultado de la conversión al usuario
                    System.out.println("───────────────────────────────────────────────────────────────────");
                    System.out.println("El resultado de convertir " + cantidadFormateada + " " +
                            "[USD]" + " a " + "[COP]" + " es: " + montoFormateado + " [COP]");
                    System.out.println("───────────────────────────────────────────────────────────────────\n");

                    //Crea un objeto Conversion y lo agrega al historial
                    conversion = new Conversor("USD", "COP", cantidad,
                            medidaDeConversion.conversion_result(),LocalDateTime.now());
                    this.historial.agregarConversion(conversion);
                    break;
                case 8:
                    System.out.println("Ingrese el valor que desea convertir? Si va a ingresar decimales que sean con puntos, o numeros enteros");
                    cantidad = lecturaDatos.nextDouble();
                    medidaDeConversion = consultaConversorDeMoneda.buscaTipoMoneda("COP","USD",cantidad);

                    cantidadFormateada = formato.format(cantidad);
                    montoFormateado = formato.format(medidaDeConversion.conversion_result());

                    //Muestra el resultado de la conversión al usuario
                    System.out.println("───────────────────────────────────────────────────────────────────");
                    System.out.println("El resultado de convertir " + cantidadFormateada + " " +
                            "[COP]" + " a " + "[USD]" + " es: " + montoFormateado + " [USD]");
                    System.out.println("───────────────────────────────────────────────────────────────────\n");

                    //Crea un objeto Conversion y lo agrega al historial
                    conversion = new Conversor("COP", "USD", cantidad,
                            medidaDeConversion.conversion_result(),LocalDateTime.now());
                    this.historial.agregarConversion(conversion);
                    break;
                case 9:
                    System.out.println("Ingrese el valor que desea convertir? Si va a ingresar decimales que sean con puntos, o numeros enteros");
                    cantidad = lecturaDatos.nextDouble();
                    medidaDeConversion = consultaConversorDeMoneda.buscaTipoMoneda("USD","MXN",cantidad);

                    cantidadFormateada = formato.format(cantidad);
                    montoFormateado = formato.format(medidaDeConversion.conversion_result());

                    //Muestra el resultado de la conversión al usuario
                    System.out.println("───────────────────────────────────────────────────────────────────");
                    System.out.println("El resultado de convertir " + cantidadFormateada + " " +
                            "[USD]" + " a " + "[MXN]" + " es: " + montoFormateado + " [MXN]");
                    System.out.println("───────────────────────────────────────────────────────────────────\n");

                    //Crea un objeto Conversion y lo agrega al historial
                    conversion = new Conversor("USD", "MXN", cantidad,
                            medidaDeConversion.conversion_result(),LocalDateTime.now());
                    this.historial.agregarConversion(conversion);
                    break;
                case 10:
                    System.out.println("Ingrese el valor que desea convertir? Si va a ingresar decimales que sean con puntos, o numeros enteros");
                    cantidad = lecturaDatos.nextDouble();
                    medidaDeConversion = consultaConversorDeMoneda.buscaTipoMoneda("MXN","USD",cantidad);

                    cantidadFormateada = formato.format(cantidad);
                    montoFormateado = formato.format(medidaDeConversion.conversion_result());

                    //Muestra el resultado de la conversión al usuario
                    System.out.println("───────────────────────────────────────────────────────────────────");
                    System.out.println("El resultado de convertir " + cantidadFormateada + " " +
                            "[MXN]" + " a " + "[USD]" + " es: " + montoFormateado + " [USD]");
                    System.out.println("───────────────────────────────────────────────────────────────────\n");

                    //Crea un objeto Conversion y lo agrega al historial
                    conversion = new Conversor("MXN", "USD", cantidad,
                            medidaDeConversion.conversion_result(),LocalDateTime.now());
                    this.historial.agregarConversion(conversion);
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione un número del menú.\n");
            }

        }catch(NumberFormatException e){
            System.out.println("Los datos deben ser numeros: "+ e.getMessage());
            exit(0);

        }
        catch (InputMismatchException e)
        {
            System.out.println("No se permite letras, caracteres o decimales con coma, intentelo de nuevo: " + e.getMessage());
            exit(0);
        }

    }

}
