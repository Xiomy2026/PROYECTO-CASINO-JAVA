import java.util.Scanner;
import java.util.Random;

public class CasinoRoyalBasico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int monedas = 100;
        int partidas = 0;
        int victorias = 0;
        int derrotas = 0;
        int opcion = 0;

        while (opcion != 8) {

            System.out.println();
            System.out.println("================================");
            System.out.println("          CASINO ROYAL");
            System.out.println("================================");
            System.out.println(" Monedas: " + monedas);
            System.out.println();
            System.out.println(" 1. Lanzar Dado");
            System.out.println(" 2. Lanzar Moneda");
            System.out.println(" 3. Tragamonedas");
            System.out.println(" 4. Ruleta");
            System.out.println(" 5. Piedra, Papel o Tijera");
            System.out.println(" 6. Carrera de Caballos");
            System.out.println(" 7. Ver Estadísticas");
            System.out.println(" 8. Salir");

            System.out.print(" Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    if (monedas < 10) {

                        System.out.println();
                        System.out.println(" No tienes suficientes monedas");
                        System.out.println(" para jugar");

                        break;
                    }

                    monedas -= 10;
                    partidas++;

                    System.out.println();
                    System.out.println(" Elegiste: Lanzar Dado");

                    int dado = rd.nextInt(6) + 1;

                    System.out.println(" Resultado: " + dado);

                    if (dado == 6) {

                        monedas += 30;
                        victorias++;

                        System.out.println(" ¡Ganaste 30 monedas!");

                    } else if (dado == 5) {

                        monedas += 20;
                        victorias++;

                        System.out.println(" ¡Ganaste 20 monedas!");

                    } else if (dado == 4) {

                        monedas += 10;
                        victorias++;

                        System.out.println(" ¡Ganaste 10 monedas!");

                    } else {

                        derrotas++;

                        System.out.println(" ¡Perdiste!");
                        System.out.println(" No ganaste monedas");
                    }

                    break;

                case 2:

                    if (monedas < 10) {

                        System.out.println();
                        System.out.println(" No tienes suficientes monedas");
                        System.out.println(" para jugar");

                        break;
                    }

                    System.out.println();
                    System.out.println(" Elegiste: Lanzar Moneda");
                    System.out.println();
                    System.out.println(" Elige una opción");
                    System.out.println(" 1. Cara");
                    System.out.println(" 2. Sello");
                    System.out.print(" Seleccione: ");

                    int eleccion = sc.nextInt();

                    if (eleccion < 1 || eleccion > 2) {

                        System.out.println();
                        System.out.println(" Opción no válida");

                        break;
                    }

                    monedas -= 10;
                    partidas++;

                    if (eleccion == 1) {

                        System.out.println();
                        System.out.println(" Has elegido: Cara");

                    } else {

                        System.out.println();
                        System.out.println(" Has elegido: Sello");
                    }

                    int moneda = rd.nextInt(2) + 1;

                    if (moneda == 1) {

                        System.out.println(" La máquina obtuvo: Cara");

                    } else {

                        System.out.println(" La máquina obtuvo: Sello");
                    }

                    if (eleccion == moneda) {

                        monedas += 20;
                        victorias++;

                        System.out.println(" ¡Ganaste 20 monedas!");

                    } else {

                        derrotas++;

                        System.out.println(" ¡Perdiste!");
                        System.out.println(" No ganaste monedas");
                    }

                    break;

                case 3:

                    if (monedas < 10) {

                        System.out.println();
                        System.out.println(" No tienes suficientes monedas");
                        System.out.println(" para jugar");

                        break;
                    }

                    monedas -= 10;
                    partidas++;

                    System.out.println();
                    System.out.println(" Elegiste: Tragamonedas");

                    int simbolo1 = rd.nextInt(5) + 1;
                    int simbolo2 = rd.nextInt(5) + 1;
                    int simbolo3 = rd.nextInt(5) + 1;

                    System.out.print(" ");

                    switch (simbolo1) {

                        case 1:
                            System.out.print("[🍒]");
                            break;

                        case 2:
                            System.out.print("[👑]");
                            break;

                        case 3:
                            System.out.print("[⭐]");
                            break;

                        case 4:
                            System.out.print("[💎]");
                            break;

                        case 5:
                            System.out.print("[7️⃣]");
                            break;
                    }

                    switch (simbolo2) {

                        case 1:
                            System.out.print(" [🍒]");
                            break;

                        case 2:
                            System.out.print(" [👑]");
                            break;

                        case 3:
                            System.out.print(" [⭐]");
                            break;

                        case 4:
                            System.out.print(" [💎]");
                            break;

                        case 5:
                            System.out.print(" [7️⃣]");
                            break;
                    }

                    switch (simbolo3) {

                        case 1:
                            System.out.print(" [🍒]");
                            break;

                        case 2:
                            System.out.print(" [👑]");
                            break;

                        case 3:
                            System.out.print(" [⭐]");
                            break;

                        case 4:
                            System.out.print(" [💎]");
                            break;

                        case 5:
                            System.out.print(" [7️⃣]");
                            break;
                    }

                    System.out.println();

                    if (simbolo1 == simbolo2 && simbolo2 == simbolo3) {

                        monedas += 100;
                        victorias++;

                        System.out.println(" ¡¡JACKPOT!!");
                        System.out.println(" ¡Ganaste 100 monedas!");

                    } else if (
                            simbolo1 == simbolo2 ||
                            simbolo1 == simbolo3 ||
                            simbolo2 == simbolo3
                    ) {

                        monedas += 30;
                        victorias++;

                        System.out.println(" ¡¡Dos iguales!!");
                        System.out.println(" ¡Ganaste 30 monedas!");

                    } else {

                        derrotas++;

                        System.out.println(" ¡Perdiste!");
                        System.out.println(" No obtuviste premio");
                    }

                    break;

                case 4:

                    if (monedas < 10) {

                        System.out.println();
                        System.out.println(" No tienes suficientes monedas");
                        System.out.println(" para jugar");

                        break;
                    }

                    System.out.println();
                    System.out.println(" Elegiste: Ruleta");
                    System.out.print(" Apuesta un número entre 0 y 36: ");

                    int apuesta = sc.nextInt();

                    if (apuesta < 0 || apuesta > 36) {

                        System.out.println();
                        System.out.println(" Opción no válida");

                        break;
                    }

                    monedas -= 10;
                    partidas++;

                    System.out.println(" Has elegido el número: " + apuesta);

                    int ruleta = rd.nextInt(37);

                    System.out.println(" Girando ruleta...");
                    System.out.println(" Número ganador: " + ruleta);

                    if (apuesta == ruleta) {

                        monedas += 100;
                        victorias++;

                        System.out.println(" ¡Ganaste 100 monedas!");

                    } else {

                        derrotas++;

                        System.out.println(" ¡Perdiste!");
                        System.out.println(" No ganaste monedas");
                    }

                    break;

                case 5:

                    if (monedas < 10) {

                        System.out.println();
                        System.out.println(" No tienes suficientes monedas");
                        System.out.println(" para jugar");

                        break;
                    }

                    System.out.println();
                    System.out.println(" Elegiste: Piedra, Papel o Tijera");
                    System.out.println();
                    System.out.println(" Elige una opción");
                    System.out.println(" 1. Piedra");
                    System.out.println(" 2. Papel");
                    System.out.println(" 3. Tijera");
                    System.out.print(" Seleccione: ");

                    int jugador = sc.nextInt();

                    if (jugador < 1 || jugador > 3) {

                        System.out.println();
                        System.out.println(" Opción no válida");

                        break;
                    }

                    monedas -= 10;
                    partidas++;

                    int maquina = rd.nextInt(3) + 1;

                    if (jugador == 1) {

                        System.out.println();
                        System.out.println(" Has elegido: Piedra");

                    } else if (jugador == 2) {

                        System.out.println();
                        System.out.println(" Has elegido: Papel");

                    } else {

                        System.out.println();
                        System.out.println(" Has elegido: Tijera");
                    }

                    if (maquina == 1) {

                        System.out.println(" La máquina eligió: Piedra");

                    } else if (maquina == 2) {

                        System.out.println(" La máquina eligió: Papel");

                    } else {

                        System.out.println(" La máquina eligió: Tijera");
                    }

                    if (jugador == maquina) {

                        monedas += 10;

                        System.out.println();
                        System.out.println(" ¡Empate!");
                        System.out.println(" Se devuelven tus 10 monedas");

                    } else if (
                            (jugador == 1 && maquina == 3) ||
                            (jugador == 2 && maquina == 1) ||
                            (jugador == 3 && maquina == 2)
                    ) {

                        monedas += 20;
                        victorias++;

                        System.out.println(" ¡Ganaste 20 monedas!");

                    } else {

                        derrotas++;

                        System.out.println(" ¡Perdiste!");
                    }

                    break;

                case 6:

                    if (monedas < 10) {

                        System.out.println();
                        System.out.println(" No tienes suficientes monedas");
                        System.out.println(" para jugar");

                        break;
                    }

                    System.out.println();
                    System.out.println(" Elegiste: Carrera de Caballos");
                    System.out.println();
                    System.out.println(" Elige tu caballo");
                    System.out.println(" 1. Caballo 1");
                    System.out.println(" 2. Caballo 2");
                    System.out.println(" 3. Caballo 3");
                    System.out.println(" 4. Caballo 4");
                    System.out.println(" 5. Caballo 5");
                    System.out.print(" Seleccione: ");

                    int elegido = sc.nextInt();

                    if (elegido < 1 || elegido > 5) {

                        System.out.println();
                        System.out.println(" Opción no válida");

                        break;
                    }

                    monedas -= 10;
                    partidas++;

                    int caballo1 = 0;
                    int caballo2 = 0;
                    int caballo3 = 0;
                    int caballo4 = 0;
                    int caballo5 = 0;

                    int meta = 20;
                    int ganador = 0;

                    System.out.println();
                    System.out.println(" Has elegido: Caballo " + elegido);
                    System.out.println();
                    System.out.println(" ¡Comienza la carrera!");

                    while (ganador == 0) {

                        caballo1 += rd.nextInt(3) + 1;
                        caballo2 += rd.nextInt(3) + 1;
                        caballo3 += rd.nextInt(3) + 1;
                        caballo4 += rd.nextInt(3) + 1;
                        caballo5 += rd.nextInt(3) + 1;

                        System.out.println();

                        System.out.print(" Caballo 1: ");

                        for (int i = 0; i < caballo1 && i < meta; i++) {
                            System.out.print("*");
                        }

                        System.out.println();

                        System.out.print(" Caballo 2: ");

                        for (int i = 0; i < caballo2 && i < meta; i++) {
                            System.out.print("*");
                        }

                        System.out.println();

                        System.out.print(" Caballo 3: ");

                        for (int i = 0; i < caballo3 && i < meta; i++) {
                            System.out.print("*");
                        }

                        System.out.println();

                        System.out.print(" Caballo 4: ");

                        for (int i = 0; i < caballo4 && i < meta; i++) {
                            System.out.print("*");
                        }

                        System.out.println();

                        System.out.print(" Caballo 5: ");

                        for (int i = 0; i < caballo5 && i < meta; i++) {
                            System.out.print("*");
                        }

                        System.out.println();

                        if (caballo1 >= meta) {

                            ganador = 1;

                        } else if (caballo2 >= meta) {

                            ganador = 2;

                        } else if (caballo3 >= meta) {

                            ganador = 3;

                        } else if (caballo4 >= meta) {

                            ganador = 4;

                        } else if (caballo5 >= meta) {

                            ganador = 5;
                        }
                    }

                    System.out.println();
                    System.out.println(" ¡Ganó el Caballo " + ganador + "!");

                    if (elegido == ganador) {

                        monedas += 50;
                        victorias++;

                        System.out.println(" ¡Ganaste 50 monedas!");

                    } else {

                        derrotas++;

                        System.out.println(" ¡Perdiste!");
                    }

                    break;

                case 7:

                    System.out.println();
                    System.out.println("================================");
                    System.out.println("          ESTADÍSTICAS");
                    System.out.println("================================");

                    System.out.println(" Monedas actuales: " + monedas);
                    System.out.println(" Partidas jugadas: " + partidas);
                    System.out.println(" Victorias: " + victorias);
                    System.out.println(" Derrotas: " + derrotas);

                    if (partidas > 0) {

                        double porcentaje =
                                (victorias * 100.0) / partidas;

                        System.out.println(
                                " Porcentaje de victorias: " + victorias + "%"
                        );

                    } else {

                        System.out.println(
                                " Porcentaje de victorias: 0%"
                        );
                    }

                    System.out.println("================================");

                    break;

                case 8:

                    System.out.println();
                    System.out.println("================================");
                    System.out.println("      FIN DEL CASINO ROYAL");
                    System.out.println("================================");

                    System.out.println(" Monedas finales: " + monedas);
                    System.out.println(" Partidas jugadas: " + partidas);
                    System.out.println(" Victorias: " + victorias);
                    System.out.println(" Derrotas: " + derrotas);

                    System.out.println();
                    System.out.println(
                            " ¡Gracias por jugar Casino Royal! 🤩✨"
                    );

                    System.out.println("================================");

                    break;

                default:

                    System.out.println();
                    System.out.println(" Opción no válida");

                    break;
            }

            System.out.println();
        }

        sc.close();
    }
}