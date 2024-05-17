public class MenuPrincipal {
    public static void lanzarMensaje() {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";
        System.out.println(ANSI_GREEN + "**************************");
        System.out.println("*  Conversor de monedas  *");
        System.out.println(ANSI_GREEN + "**************************" + ANSI_RESET);
        System.out.println("""
                1. Peso Colombiano
                2. Peso Argentino
                3. Peso Mexicano
                4. Dolar Estadounidense
                5. Dolar Canadiense
                6. Euro""");
    }
}
