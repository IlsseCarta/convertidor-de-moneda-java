public class Reinicio {
    public static void lanzarReinicio(){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLUE = "\u001B[34m";
        System.out.println(ANSI_BLUE + "Desea realizar otra conversion?:  y?" + ANSI_RESET);
    }
}
