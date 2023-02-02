package OcaKotlin;

import java.util.Scanner;

public class Intro {
    public static void intro() {
        System.out.println("""
                
                                ██▓    ▄▄▄          ▒█████   ▄████▄   ▄▄▄
                                ▓██▒   ▒████▄       ▒██▒  ██▒▒██▀ ▀█  ▒████▄    
                                ▒██░   ▒██  ▀█▄     ▒██░  ██▒▒▓█    ▄ ▒██  ▀█▄  
                                ▒██░   ░██▄▄▄▄██    ▒██   ██░▒▓▓▄ ▄██▒░██▄▄▄▄██ 
                                ░██████▒▓█   ▓██▒   ░ ████▓▒░▒ ▓███▀ ░ ▓█   ▓██▒
                                ░ ▒░▓  ░▒▒   ▓▒█░   ░ ▒░▒░▒░ ░ ░▒ ▒  ░ ▒▒   ▓▒█░
                                ░ ░ ▒  ░ ▒   ▒▒ ░     ░ ▒ ▒░   ░  ▒     ▒   ▒▒ ░
                                  ░ ░    ░   ▒      ░ ░ ░ ▒  ░          ░   ▒   
                                   ░  ░     ░  ░       ░ ░  ░ ░            ░  ░
                                                             ░                 """);
        System.out.println("""
                 
                                 ███▄ ▄███▓ ▄▄▄      ▓█████▄ ▓█████     ▄▄▄▄ ▓██   ██▓    ██▓     ██▓     █    ██  ▄████▄       ▄████  ▄▄▄       ██▓     ▄████▄  ▓█████  ██▀███   ▄▄▄       ███▄    █  
                                ▓██▒▀█▀ ██▒▒████▄    ▒██▀ ██▌▓█   ▀    ▓█████▄▒██  ██▒   ▓██▒    ▓██▒     ██  ▓██▒▒██▀ ▀█      ██▒ ▀█▒▒████▄    ▓██▒    ▒██▀ ▀█  ▓█   ▀ ▓██ ▒ ██▒▒████▄     ██ ▀█   █  
                                ▓██    ▓██░▒██  ▀█▄  ░██   █▌▒███      ▒██▒ ▄██▒██ ██░   ▒██░    ▒██░    ▓██  ▒██░▒▓█    ▄    ▒██░▄▄▄░▒██  ▀█▄  ▒██░    ▒▓█    ▄ ▒███   ▓██ ░▄█ ▒▒██  ▀█▄  ▓██  ▀█ ██▒ 
                                ▒██    ▒██ ░██▄▄▄▄██ ░▓█▄   ▌▒▓█  ▄    ▒██░█▀  ░ ▐██▓░   ▒██░    ▒██░    ▓▓█  ░██░▒▓▓▄ ▄██▒   ░▓█  ██▓░██▄▄▄▄██ ▒██░    ▒▓▓▄ ▄██▒▒▓█  ▄ ▒██▀▀█▄  ░██▄▄▄▄██ ▓██▒  ▐▌██▒
                                ▒██▒   ░██▒ ▓█   ▓██▒░▒████▓ ░▒████▒   ░▓█  ▀█▓░ ██▒▓░   ░██████▒░██████▒▒▒█████▓ ▒ ▓███▀ ░   ░▒▓███▀▒ ▓█   ▓██▒░██████▒▒ ▓███▀ ░░▒████▒░██▓ ▒██▒ ▓█   ▓██▒▒██░   ▓██░ 
                                ░ ▒░   ░  ░ ▒▒   ▓▒█░ ▒▒▓  ▒ ░░ ▒░ ░   ░▒▓███▀▒ ██▒▒▒    ░ ▒░▓  ░░ ▒░▓  ░░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░    ░▒   ▒  ▒▒   ▓▒█░░ ▒░▓  ░░ ░▒ ▒  ░░░ ▒░ ░░ ▒▓ ░▒▓░ ▒▒   ▓▒█░░ ▒░   ▒ ▒  
                                ░  ░      ░  ▒   ▒▒ ░ ░ ▒  ▒  ░ ░  ░   ▒░▒   ░▓██ ░▒░    ░ ░ ▒  ░░ ░ ▒  ░░░▒░ ░ ░   ░  ▒        ░   ░   ▒   ▒▒ ░░ ░ ▒  ░  ░  ▒    ░ ░  ░  ░▒ ░ ▒░  ▒   ▒▒ ░░ ░░   ░ ▒░ 
                                ░      ░     ░   ▒    ░ ░  ░    ░       ░    ░▒ ▒ ░░       ░ ░     ░ ░    ░░░ ░ ░ ░           ░ ░   ░   ░   ▒     ░ ░   ░           ░     ░░   ░   ░   ▒      ░   ░ ░  
                                       ░         ░  ░   ░       ░  ░    ░     ░ ░            ░  ░    ░  ░   ░     ░ ░               ░       ░  ░    ░  ░░ ░         ░  ░   ░           ░  ░         ░  
                                                      ░                      ░░ ░                                 ░                                     ░                                             """);
        String intro = """
                  _____  ______ _____ _                _____   _____  ______ _             _ _    _ ______ _____  ____    _____  ______   _                  ____   _____         \s
                 |  __ \\|  ____/ ____| |        /\\    / ____| |  __ \\|  ____| |           | | |  | |  ____/ ____|/ __ \\  |  __ \\|  ____| | |        /\\      / __ \\ / ____|   /\\   \s
                 | |__) | |__ | |  __| |       /  \\  | (___   | |  | | |__  | |           | | |  | | |__ | |  __| |  | | | |  | | |__    | |       /  \\    | |  | | |       /  \\  \s
                 |  _  /|  __|| | |_ | |      / /\\ \\  \\___ \\  | |  | |  __| | |       _   | | |  | |  __|| | |_ | |  | | | |  | |  __|   | |      / /\\ \\   | |  | | |      / /\\ \\ \s
                 | | \\ \\| |___| |__| | |____ / ____ \\ ____) | | |__| | |____| |____  | |__| | |__| | |___| |__| | |__| | | |__| | |____  | |____ / ____ \\  | |__| | |____ / ____ \\\s
                 |_|  \\_\\______\\_____|______/_/    \\_\\_____/  |_____/|______|______|  \\____/ \\____/|______\\_____|\\____/  |_____/|______| |______/_/    \\_\\  \\____/ \\_____/_/    \\_\\
                                                                                                                                                                                  \s
                                                                                                                                                                                  \s

                En este Juego de la Oca es un juego en el que pueden participar dos jugadores.

                El tablero en forma de espiral consta de 63 casillas numeradas del 1 al 63, dependiendo de la casilla en la que caigas puedes avanzar, retroceder o sufrir una penalización.

                En su turno cada participante tira un dado que le indica el número de casillas que debe avanzar.

                La casilla 63 sólo se puede alcanzar de tirada exacta o pasando este mismo numero. Si un jugador tira los dados y saca un número mayor al del final automaticamente va a ganar.
                
                   _____          _ _ _                                       _       _          \s
                  / ____|        (_) | |                                     (_)     | |         \s
                 | |     __ _ ___ _| | | __ _ ___    ___  ___ _ __   ___  ___ _  __ _| | ___  ___\s
                 | |    / _` / __| | | |/ _` / __|  / _ \\/ __| '_ \\ / _ \\/ __| |/ _` | |/ _ \\/ __|
                 | |___| (_| \\__ \\ | | | (_| \\__ \\ |  __/\\__ \\ |_) |  __/ (__| | (_| | |  __/\\__ \\
                  \\_____\\__,_|___/_|_|_|\\__,_|___/  \\___||___/ .__/ \\___|\\___|_|\\__,_|_|\\___||___/
                                                             | |                                 \s
                                                             |_|                                 \s

                Oca [4, 8, 13, 17, 22, 26, 31, 35, 40, 44, 53, 58] “De oca a oca y tiro porque me toca”. Se avanza a la siguiente oca y se vuelve a tirar.

                Puente [5,11] “De puente a puente y tiro porque me lleva la corriente”. Se avanza o retrocede hasta el otro puente y se vuelve a tirar.

                Dados [25,52] “De dados a dados y tiro porque me ha dado”. Se avanza o retrocede hasta los otros dados y se vuelve a tirar.

                Posada [18] Se pierden 5 turnos.

                Carcel [55] Se pierden 3 turnos.

                Muerte [57] Se vuelve a empezar desde la casilla 1.""";
        System.out.println(intro);
    }


    public String retornarNombreval() {
        System.out.println("Escriba el nombre del jugador: ");
        String nom = new Scanner(System.in).nextLine();
        if (nom == null) {
            nom = "LOLALOLITA";
        }
        return nom;
    }
    public String retornarColorJugador() {
        System.out.println("Escriba el color del jugador: ");
        String color = (new Scanner(System.in)).nextLine();
        if (color == null || color.isEmpty()) {
            color = "negro";
        }
        return color;
    }
}



