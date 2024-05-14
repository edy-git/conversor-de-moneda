<h1 align="center"> Conversor de moneda - Java</h1>

![java-Banner](https://github.com/edy-git/conversor-de-moneda/blob/main/img/javaBanner.png?raw=true)

## Descripcion
Este proyecto es un conversor de divisas que utiliza la API de ExchangeRate-API, permite al usuario realizar la conversión de monedas al tipo de cambio actualizado a la fecha, según las opciones propuestas en Menú. Así mismo el usuario podrá acceder al final de la consulta o consultas a un historial con los tipos de cambio solicitados.
## Estado del proyecto
- El proyecto se encuentra en su versión 1.0.0.

## Caracteristicas de la aplicacion
- Muestra un menú con opciones de conversión de monedas.
- Comprende una interfaz intuitiva para el usuario de facil selección, para la conversion y entrada de montos.
- Obtiene los valores actualizados del tipo de cambio de las monedas desde una API externa, garantizando asi la precisión de las conversiones.
- Realiza la conversión de monedas previamente seleccionada por el usuario.
- Mantiene un historial de las conversiones realizadas, el cual puede ser consultado por el usuario.

## Requisitos del sistema
>[!WARNING]
>- Windows 10 (8u51 y superiores).
>- Java 8 o superior.
>- Conexión a Internet.
>-  Crear una cuenta en [ExchangeRate-API][1] para la optencion de una API_KEY.

## Instalación
1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE de Java preferido.
3. Compila y ejecuta el archivo Principal.java para iniciar la aplicación.

>[!NOTE]
>No se te olvide descargar la libreria Gson y agregarlo a este proyecto de esa manera se podra serializar y deserializar los datos obtenidos mediante la API de ExchangeRate-API que estaran en formato Json.

## Uso de la aplicacion
- Al iniciar la aplicación, se te pedirá que selecciones la divisa base y la divisa objetivo para la conversión.
- Luego, introduce el monto que deseas convertir.
- La aplicación calculará automáticamente el monto convertido y lo mostrará.
- Puedes optar por realizar más conversiones o salir de la aplicación.

## Demostracion de la aplicacion
### Menu
#### 1.  Inicio al sistema.
![Menu](https://github.com/edy-git/conversor-de-moneda/blob/main/img/01-menu.png?raw=true)
#### 2. Selección del usuario de la moneda a convertir
![Opciones](https://github.com/edy-git/conversor-de-moneda/blob/main/img/02-opciones-consulta1.png?raw=true)
#### 3. Resultado de la conversión seleccionada
![ResultadoConverion1](https://github.com/edy-git/conversor-de-moneda/blob/main/img/03-resultado-consulta.png?raw=true)
#### 4. Segunda conversion del usuario
![opciones2](https://github.com/edy-git/conversor-de-moneda/blob/main/img/04-opciones-consulta2.png?raw=true)
#### 5. Resultado de la segunda conversión
![ResultadoConversion2](https://github.com/edy-git/conversor-de-moneda/blob/main/img/05-resultado-consulta2.png?raw=true)
#### 6. Histórial de consulta de conversiones
![Historial](https://github.com/edy-git/conversor-de-moneda/blob/main/img/06-historial-consultas-despedida.png?raw=true)
#### 7. Control de Errores
En este proyecto, se ha prestado especial atención al manejo de errores para garantizar un comportamiento robusto y una experiencia de usuario fluida. A continuación, se mostrara el manejo de errores que se han implementado.

>[!CAUTION]
>- Error al intentar ingresar un valor fuera del menú.
>- ![ErrorValor](https://github.com/edy-git/conversor-de-moneda/blob/main/img/07-manejo-exception.png?raw=true)
>- Error al intentar ingresar caracteres desconocidos al menu.
>- ![ErrorCaracter](https://github.com/edy-git/conversor-de-moneda/blob/main/img/08-manejo-exception1.png?raw=true)
>- Error al intentar ingresar caracteres desconocidos, o numeros con comas al valor que se desea convertir.
>- ![ErrorValor](https://github.com/edy-git/conversor-de-moneda/blob/main/img/09-manejo-exception2.png?raw=true)

##### 7.1 Captura de Excepciones
Se han implementado bloques try-catch para capturar excepciones y manejarlas adecuadamente.

## Tecnologías utilizadas
- Intellij IDEA.
- JDK de Java.
- Biblioteca Gson
- ExchangeRate-API

## Contribuir
¡Siéntete libre de contribuir al proyecto! Si tienes ideas para nuevas características, mejoras en el código o correcciones de errores, abre un pull request y estaré encantado de revisarlo.

## Autor
Este proyecto fue creado por: Eduardo Argana R.

>[!IMPORTANT]
¡Siéntete libre de contactarme si tienes alguna pregunta o sugerencia!
>- [LinkedIn][2]

## End
[1]: https://www.exchangerate-api.com/ "ExchangeRate-API"
[2]: https://www.linkedin.com/in/eduardo-argana-igs/ "LinkedIn"
