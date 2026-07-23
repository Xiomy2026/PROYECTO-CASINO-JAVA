import java.util.Scanner;
import java.util.Random;

public class CasinoRoyal {

// Objetos
    static Scanner teclado = new Scanner(System.in);
    static Random random = new Random();  

// Variables generales
    static int monedas = 100;
    static int partidasJugadas = 0;
    static int victorias = 0;
    static int derrotas = 0;  
    
    public static void main(String[] args) {  
        menu();
    }  

// Método del menú principal
    public static void menu() {  
        
        int opcion;  
        
        do {
            System.out.println("\n================================");
            System.out.println("          CASINO ROYAL");
            System.out.println("================================");
            System.out.println("Monedas: " + monedas);
            System.out.println("1. Lanzar dado");
            System.out.println("2. Lanzar moneda");
            System.out.println("3. Tragamonedas");
            System.out.println("4. Ruleta");
            System.out.println("5. Piedra, Papel o Tijera");
            System.out.println("6. Carrera de Caballos");
            System.out.println("7. Ver estadísticas");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");  
            
            opcion = teclado.nextInt();  
            
            switch (opcion) {  
                
                case 1:
                lanzarDado();  
                break;  
                
                case 2:  
                lanzarMoneda();  
                break;  
                
                case 3:  
                tragamonedas();  
                break;  
                
                case 4:  
                ruleta();  
                break;  
                
                case 5:  
                piedraPapelTijera();  
                break;  
                
                case 6:  
                carreraCaballos();  
                break;  
                
                case 7:  
                verEstadisticas();  
                break;  
                
                case 8:  
                resumenFinal();  
                break;  
                
                default:
                System.out.println("Opción no válida.");
            }  
            
        } while (opcion != 8);
        
        teclado.close();
        
    }  

    
    public static void lanzarDado() {  
        
        if (monedas < 10) {
            System.out.println("No tienes suficientes monedas para jugar.");
            return;
        }  
        monedas -= 10;
        partidasJugadas++;  
        
        int dado = random.nextInt(6) + 1;  
        
        System.out.println("\nLanzando dado...");
        System.out.println("Resultado: " + dado);  
        
        if (dado == 6) {
            System.out.println("¡Ganaste 30 monedas!");
            monedas += 30;
            victorias++;  
            
        } else if (dado == 5) {
            System.out.println("¡Ganaste 20 monedas!");
            monedas += 20;
            victorias++;  
        
        } else if (dado == 4) {
            System.out.println("¡Ganaste 10 monedas!");
            monedas += 10;  
            victorias++;  
        
        } else {
           System.out.println("¡No ganaste!");
        derrotas++;
    }  
        System.out.println("Monedas actuales: " + monedas);
    }  

    
    public static void lanzarMoneda() {
        
        if (monedas < 10) {
            System.out.println("No tienes suficientes monedas para jugar.");
            return;
        }
        
        monedas -= 10;
        partidasJugadas++;
        
        System.out.println("\n======== LANZAR MONEDA ========");
        System.out.println("Elige:");
        System.out.println("1. Cara");
        System.out.println("2. Sello");
        System.out.print("Opción: ");
        
        int eleccion = teclado.nextInt();

        if (eleccion < 1 || eleccion > 2) {
            System.out.println("Opción inválida.");
            monedas += 10;
            partidasJugadas--;
            return;
        }
        int resultado = random.nextInt(2) + 1;
        String jugador = "";
        String computadora = "";

        if (eleccion == 1) {
            jugador = "Cara";
        } else {
            jugador = "Sello";
        }
        
        if (resultado == 1) {
            computadora = "Cara";
        } else {
            computadora = "Sello";
        }

        System.out.println("\nLanzando moneda...");
        System.out.println("Elegiste: " + jugador);
        System.out.println("Resultado: " + computadora);

        if (eleccion == resultado) {
            
            System.out.println("¡Adivinaste!");
            System.out.println("Ganaste 20 monedas.");
            
            monedas += 20;
            victorias++;
            
        } else {
            System.out.println("¡No acertaste!");
            derrotas++;
        }
        System.out.println("Monedas actuales: " + monedas);
    }

    
    public static void tragamonedas() {
        
        if (monedas < 10) {
            System.out.println("No tienes suficientes monedas para jugar.");
            return;
        }
        
        monedas -= 10;
        partidasJugadas++;
        
        int simbolo1 = random.nextInt(5) + 1;
        int simbolo2 = random.nextInt(5) + 1;
        int simbolo3 = random.nextInt(5) + 1;

        System.out.println("\nGirando tragamonedas...");

        // Mostrar símbolo 1
        switch (simbolo1) {
            case 1:
            System.out.print("[R]");
            break;
            case 2:
            System.out.print("[O]");
            break;
            case 3:
            System.out.print("[Y]");
            break;
            case 4:
            System.out.print("[A]");
            break;
            case 5:
            System.out.print("[L]");
            break;
        }

        // Mostrar símbolo 2
        switch (simbolo2) {
            case 1:
            System.out.print(" [R]");
            break;
            case 2:
            System.out.print(" [O]");
            break;
            case 3:
            System.out.print(" [Y]");
            break;
            case 4:
            System.out.print(" [A]");
            break;
            case 5:
            System.out.print(" [L]");
            break;
        }

        // Mostrar símbolo 3
        switch (simbolo3) {
            case 1:
            System.out.println(" [R]");
            break;
            case 2:
            System.out.println(" [O]");
            break;
            case 3:
            System.out.println(" [Y]");
            break;
            case 4:
            System.out.println(" [A]");
            break;
            case 5:
            System.out.println(" [L]");
            break;
        }

        // Verificar premios
        if (simbolo1 == simbolo2 && simbolo2 == simbolo3) {
            
            System.out.println("¡¡JACKPOT!!");
            System.out.println("Ganaste 100 monedas.");
            
            monedas += 100;
            victorias++;

        } else if (simbolo1 == simbolo2 || simbolo1 == simbolo3 || simbolo2 == simbolo3) {
                    
            System.out.println("¡¡Dos iguales!!");
            System.out.println("Ganaste 30 monedas.");
        
            monedas += 30;
            victorias++;

                
        } else {
            System.out.println("¡No obtuviste premio!");
            derrotas++;
        }
        System.out.println("Monedas actuales: " + monedas);
    }

    public static void ruleta() {
        
        if (monedas < 10) {
            System.out.println("No tienes suficientes monedas para jugar.");
            return;
        }
        
        monedas -= 10;
        partidasJugadas++;
        
        System.out.println("\n======== RULETA ========");
        System.out.print("Apuesta un número entre 0 y 36: ");
        
        int apuesta = teclado.nextInt();

        if (apuesta < 0 || apuesta > 36) {
            
            System.out.println("Número inválido.");
            monedas += 10;
            partidasJugadas--;
            return;
        }

        
        int numeroRuleta = random.nextInt(37);

        System.out.println("\nGirando la ruleta...");
        System.out.println("Número de la ruleta: " + numeroRuleta);

        if (apuesta == numeroRuleta) {
            
            System.out.println("¡¡Ganaste!!");
            System.out.println("Premio: +100 monedas.");
            
            monedas += 100;
            victorias++;
            
        } else {
            
            System.out.println("¡No acertaste!");
            derrotas++;
        }
        System.out.println("Monedas actuales: " + monedas);
    }
    
    
    public static void piedraPapelTijera() {  
        
        if (monedas < 10) {
            System.out.println("No tienes suficientes monedas para jugar.");
            return;
        }  
        
        monedas -= 10;
        partidasJugadas++;
        
        System.out.println("\n=== PIEDRA, PAPEL O TIJERA ===");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Elige una opción: ");  
        
        int jugador = teclado.nextInt();  
        
        if (jugador < 1 || jugador > 3) {
            System.out.println("Opción inválida.");
            monedas += 10;
            partidasJugadas--;
            return;
        }  
        
        int computadora = random.nextInt(3) + 1;  
        
        String nombreJugador = "";
        String nombreComputadora = "";  
        
        if (jugador == 1) {
            nombreJugador = "Piedra";
        } else if (jugador == 2) {
            nombreJugador = "Papel";
        } else {
            nombreJugador = "Tijera";
        }  
        
        if (computadora == 1) {
            nombreComputadora = "Piedra";
        } else if (computadora == 2) {
            nombreComputadora = "Papel";
        } else {
            nombreComputadora = "Tijera";
        }  
        
        System.out.println("Jugador: " + nombreJugador);
        System.out.println("Computadora: " + nombreComputadora);  
        
        if (jugador == computadora) {  
            
            System.out.println("¡Empate!");
            monedas += 10;  
            
        } else if (
            (jugador == 1 && computadora == 3) ||
            (jugador == 2 && computadora == 1) ||
            (jugador == 3 && computadora == 2)
            ) {  
                System.out.println("¡Ganaste 20 monedas!");
                monedas += 20;
                victorias++;
        } else {  
            System.out.println("¡Perdiste!");
            derrotas++;
        }  
        System.out.println("Monedas actuales: " + monedas);
    }  
  
    
    public static void carreraCaballos() {  
        
        if (monedas < 10) {
            System.out.println("No tienes suficientes monedas para jugar.");
            return;
        }  
        
        monedas -= 10;
        partidasJugadas++;  
        
        System.out.println("\n===== CARRERA DE CABALLOS =====");  
        
        System.out.println("Elige tu caballo:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Caballo " + i);
        }  
        
        System.out.print("Selecciona tu caballo: ");
        int elegido = teclado.nextInt();  

        if (elegido < 1 || elegido > 5) {
            System.out.println("Caballo inválido.");
            monedas += 10;
            partidasJugadas--;
            return;
        }  

        
        int[] caballos = new int[5];  
        
        int meta = 20;
        int ganador = 0;  
        
        System.out.println("\n🏁 ¡Comienza la carrera!");  
        
        while (ganador == 0) {  
            
            for (int i = 0; i < 5; i++) {  
                
                // Avance aleatorio entre 1 y 3 posiciones
                caballos[i] += random.nextInt(3) + 1;
            }  
            
            // Mostrar progreso de todos los caballos
            System.out.println("\n----------------------");
            
            for (int i = 0; i < 5; i++) {  
                
                System.out.print("Caballo " + (i + 1) + ": ");  
                
                for (int j = 0; j < caballos[i]; j++) {
                    System.out.print("-");
                }  
                System.out.println("🐎");
            }  

            
            // Revisar ganador
            for (int i = 0; i < 5; i++) {  
                
                if (caballos[i] >= meta) {
                    ganador = i + 1;
                    break;
                }
            }  
            
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {  
                
            }
        }  
        
        System.out.println("\n🏆 Ganador: Caballo " + ganador);
        
        if (elegido == ganador) {
            System.out.println("¡Tu caballo ganó!");
            System.out.println("Premio: +50 monedas");  
            
            monedas += 50;
            victorias++;  
            
        } else {
            
            System.out.println("¡Tu caballo perdió!");
            derrotas++;
        }
        System.out.println("Monedas actuales: " + monedas);
    }  


    
    public static void verEstadisticas() {
        double porcentajeVictorias = 0;  
        
        if (partidasJugadas > 0) {
            porcentajeVictorias = (victorias * 100.0) / partidasJugadas;
        }  
        
        System.out.println("\n================================");
        System.out.println("         ESTADÍSTICAS");
        System.out.println("================================");  
        
        System.out.println("Monedas actuales: " + monedas);
        System.out.println("Partidas jugadas: " + partidasJugadas);
        System.out.println("Victorias: " + victorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Porcentaje de victorias: " + porcentajeVictorias + "%");  
        
        System.out.println("================================");
    }  

    
    public static void resumenFinal() {  
        
        System.out.println("\n================================");
        System.out.println("       FIN DEL CASINO ROYAL");
        System.out.println("================================");  
        
        System.out.println("Monedas finales: " + monedas);
        System.out.println("Partidas jugadas: " + partidasJugadas);
        System.out.println("Victorias: " + victorias);
        System.out.println("Derrotas: " + derrotas);  
        
        System.out.println("¡Gracias por jugar CASINO ROYAL!");  
        
        System.out.println("================================");
    }
}