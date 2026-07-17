import java.util.Scanner;
import java.util.Random;

public class CasinoJava {
    public static void main (String[]args) {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int monedas = 100;
        int partidas = 0;
        int victorias = 0;
        int derrotas = 0;
        int opcion = 0;
        
        while (opcion != 8) {
            System.out.println("================================");
            System.out.println("          CASINO JAVA");
            System.out.println("================================");
            System.out.println(" Monedas: " + monedas);
            
            System.out.println("  1. Lanzar Dado");
            System.out.println("  2. Lanzar Moneda");
            System.out.println("  3. Tragamonedas");
            System.out.println("  4. Ruleta");
            System.out.println("  5. Piedra, Papel o Tijera");
            System.out.println("  6. Carrera de Caballos");
            System.out.println("  7. Ver Estadísticas");
            System.out.println("  8. Salir");

            System.out.print(" Seleccione una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                
                case 1:
                System.out.println("Elegiste Lanzar Dado");
                break;
                case 2:
                System.out.println("Elegiste Lanzar Moneda");
                break;
                case 3:
                System.out.println("Elegiste Tragamonedas");
                break;
                case 4:
                System.out.println("Elegiste Ruleta");
                break;
                case 5:
                System.out.println("Elegiste Piedra, Papel o Tijera");
                break;
                case 6:
                System.out.println("Elegiste Carrera de Caballos");
                break;
                case 7:
                System.out.println("Elegiste Ver Estadísticas");
                break;
                case 8:
                System.out.println("¡Gracias por jugar!");
                break;
                
                default:
                System.out.println("Opción no válida.");
                break;
            }
            System.out.println();
        }
        
    }
}