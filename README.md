# Convertidor de Moneda Java

Este proyecto hace parte de los desafíos planteados en el Programa One de Oracle Next Education y Alura Latam. Es un convertidor de moneda en Java que utiliza la API de ExchangeRate-API para obtener las tasas de cambio en tiempo real.

## Descripción

Este proyecto consta de cuatro clases principales:

- `Principal.java`: Contiene el método `main`, que es el punto de entrada del programa. Permite al usuario seleccionar la moneda original, la moneda de destino y la cantidad a convertir. Utiliza otras clases para realizar la conversión de moneda y manejar el flujo del programa.

- `MenuPrincipal.java`: Contiene un método para mostrar el menú principal del convertidor de moneda.

- `Reinicio.java`: Contiene un método para preguntar al usuario si desea realizar otra conversión después de cada conversión.

- `BuscarTasaDeCambio.java`: Contiene un método para obtener la tasa de cambio entre dos monedas utilizando la API de ExchangeRate-API.

## Uso

1. Ejecuta el programa.
2. Selecciona la moneda original y la moneda de destino.
3. Ingresa la cantidad de dinero a convertir.
4. Obtén el resultado de la conversión.

- [Video Demostrativo](https://youtu.be/JEuVO8nzzfk) 📽️

## Configuración

Antes de ejecutar el programa, asegúrate de tener instalado Java en tu sistema. Además, este proyecto utiliza la biblioteca Gson para el manejo de JSON, por lo que necesitarás agregarla a tu proyecto si aún no lo has hecho.

## Créditos

Este proyecto fue desarrollado por Paulo De los Reyes.
