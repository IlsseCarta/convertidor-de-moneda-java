import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_YELLOW = "\u001B[33m";
        Integer monedaOriginal = null;
        Integer monedaDestino = null;
        String argumento1 = null;
        String argumento2 = null;
        double tasaDeCambio = 0;
        double cantidadAConvertir = 0;
        int resultado = 0;
        MenuPrincipal.lanzarMensaje();
        while (true) {
            System.out.println(ANSI_BLUE + "Escoge la moneda que deseas CAMBIAR:" + ANSI_RESET);
            Scanner teclado = new Scanner(System.in);
            try {
                monedaOriginal = (Integer) teclado.nextInt();
                if(monedaOriginal < 1 || monedaOriginal > 6) {
                    System.out.println(ANSI_RED +"Opción no valida" + ANSI_RESET);
                    System.out.println("""
                            **************************
                            *      Reiniciando       *
                            **************************
                            """);
                    continue;
                }
                switch (monedaOriginal) {
                    case 1:
                        argumento1 = "COP";
                        break;
                    case 2:
                        argumento1 = "ARS";
                        break;
                    case 3:
                        argumento1 = "MXN";
                        break;
                    case 4:
                        argumento1 = "USD";
                        break;
                    case 5:
                        argumento1 = "CAD";
                        break;
                    case 6:
                        argumento1 = "EUR";
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Entrada no valida" + ANSI_RESET);
                System.out.println("""
                            **************************
                            *      Reiniciando       *
                            **************************
                            """);
                continue;
            }
            System.out.println(ANSI_BLUE + "Escoge la moneda DESTINO:" + ANSI_RESET);
            Scanner teclado2 = new Scanner(System.in);
            try {
                monedaDestino = (Integer) teclado2.nextInt();
                if(monedaDestino < 1 || monedaDestino > 6) {
                    System.out.println(ANSI_RED +"Opción no valida" + ANSI_RESET);
                    System.out.println("""
                            **************************
                            *      Reiniciando       *
                            **************************
                            """);
                    continue;
                }
                switch (monedaDestino) {
                    case 1:
                        argumento2 = "COP";
                        break;
                    case 2:
                        argumento2 = "ARS";
                        break;
                    case 3:
                        argumento2 = "MXN";
                        break;
                    case 4:
                        argumento2 = "USD";
                        break;
                    case 5:
                        argumento2 = "CAD";
                        break;
                    case 6:
                        argumento2 = "EUR";
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Entrada no valida" + ANSI_RESET);
                System.out.println("""
                            **************************
                            *      Reiniciando       *
                            **************************
                            """);
                continue;
            }
            System.out.println((ANSI_BLUE + "Ingrese la cantidad de dinero a cambiar (" + argumento1 + "):" + ANSI_RESET));
            Scanner teclado3 = new Scanner(System.in);
            try {
                cantidadAConvertir = teclado3.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Entrada no valida" + ANSI_RESET);
                System.out.println("""
                            **************************
                            *      Reiniciando       *
                            **************************
                            """);
                continue;
            }
            tasaDeCambio = BuscarTasaDeCambio.generarTasa(argumento1, argumento2);
            resultado = (int) (tasaDeCambio * cantidadAConvertir);
            System.out.println(ANSI_YELLOW + (int) cantidadAConvertir + " " + argumento1 + " Equivalen a: " + resultado + " " + argumento2 + ANSI_RESET);
            Reinicio.lanzarReinicio();
            String rta = null;
            Scanner teclado4 = new Scanner(System.in);
                rta = teclado4.nextLine();
                if(rta.equals("y")) {
                    MenuPrincipal.lanzarMensaje();
                    continue;
                } else if (rta.equals("n")) {
                    break;
                } else {
                    System.out.println(ANSI_RED +"Opción no valida" + ANSI_RESET);
                    break;
                }
        }

    }
}
