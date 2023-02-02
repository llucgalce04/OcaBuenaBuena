package OcaKotlin

class OcaGame(val jugadors: List<Jugador>) {


    val caselles = Taulell().casillas


    //La funcio tirarDau fa un readln perque el joc sigui de manera menys dinamica
    // que per cada torn hagis de donarli a l'intro ja que sino el joc jugaria sol, despres també fa el random del 1 al 6 que simula un dau

    fun tirarDau(): Int {
        /*enter per jugar*/
        readln()
        return (1..6).random()
    }

    fun moure(player: Jugador, moviment: Int, ronda: Int, rondaPartida: Int) {
        player.posicio += moviment
        if (player.nortirar == false) {
            println("${player.nom} te mueves hasta la poscion ${player.posicio}")
        }

        if (player.posicio >= 63) {
            player.posicio = 63
            println("                           .-----.\n" +
                    "                         .'       `.\n" +
                    "                        :    Has    :\n" +
                    "                        :   Ganado!! :\n" +
                    "                        '           '\n" +
                    "         |~        www   `.       .'\n" +
                    "        /.\\       /#^^\\_   `-/\\--'\n" +
                    "       /#  \\     /#%    \\   /# \\\n" +
                    "      /#%   \\   /#%______\\ /#%__\\\n" +
                    "     /#%     \\   |= I I ||  |- |\n" +
                    "     ~~|~~~|~~   |_=_-__|'  |[]|\n" +
                    "       |[] |_______\\__|/_ _ |= |`.\n" +
                    "^V^    |-  /= __   __    /-\\|= | :;\n" +
                    "       |= /- /\\/  /\\/   /=- \\.-' :;\n" +
                    "       | /_.=========._/_.-._\\  .:'\n" +
                    "       |= |-.'.- .'.- |  /|\\ |.:'\n" +
                    "       \\  |=|:|= |:| =| |~|~||'|\n" +
                    "        |~|-|:| -|:|  |-|~|~||=|      ^V^\n" +
                    "        |=|=|:|- |:|- | |~|~|| |\n" +
                    "        | |-_~__=_~__=|_^^^^^|/___\n" +
                    "        |-(=-=-=-=-=-(|=====/=_-=/\\\n" +
                    "        | |=_-= _=- _=| -_=/=_-_/__\\ \n" +
                    "        | |- _ =_-  _-|=_- |]#| I II\n" +
                    "        |=|_/ \\_-_= - |- = |]#| I II\n" +
                    "        | /  _/ \\. -_=| =__|]!!!I_II!!\n" +
                    "       _|/-'/  ` \\_/ \\|/' _ ^^^^`.==_^.\n" +
                    "     _/  _/`-./`-; `-.\\_ / \\_'\\`. `. ===`.\n" +
                    "    / .-'  __/_   `.   _/.' .-' `-. ; ====;\\\n" +
                    "   /.   `./    \\ `. \\ / -  /  .-'.' ====='  >\n" +
                    "  /  \\  /  .-' `--.  / .' /  `-.' ======.' /")
            return
        }

        //Aquesta variable ens serveix per poder cridad las llista caselles
        val casella = caselles[player.posicio]

        //Ocas
        if (casella.mouPosicions == 4) {
            player.posicio += casella.mouPosicions
            println(
                "De oca a oca y tiro porque me toca" +
                        "            @*@  /&                      \n" +
                        "           @#@%      *                  \n" +
                        "      @   &             %               \n" +
                        "      # @       . @     &               \n" +
                        "      %        @                        \n" +
                        "       @@ @@        @                   \n" +
                        "           @      @                     \n" +
                        "                 #                      \n" +
                        "                                        \n" +
                        "           @                            \n" +
                        "                  @               @@    \n" +
                        "                   /              @     \n" +
                        "        @           @          @        \n" +
                        "     &                 @   @.         @ \n" +
                        "                                        \n" +
                        " @                                     .\n" +
                        "                                @       \n" +
                        "            @           (         %     \n" +
                        " / @         (       @         /        \n" +
                        "   @            @        @@    @   @    \n" +
                        "      @              @&  @      @       \n" +
                        "         @                  #           \n" +
                        "            #      /     @              \n" +
                        "              %        #                \n" +
                        "       %@           @       *@          \n" +
                        "                      /           ,     \n" +
                        "    @                    @       @ "
            )
            val dau = tirarDau()
            println("${player.nom} ha sacado un: $dau")


        }
        //Puentes
        if (casella.mouPosicions == 4) {
            player.posicio += casella.mouPosicions
            println(
                "De puente a puente y tiro porque me da la corriente" +
                        "            @*@  /&                      \n" +
                        "           @#@%      *                  \n" +
                        "      @   &             %               \n" +
                        "      # @       . @     &               \n" +
                        "      %        @                        \n" +
                        "       @@ @@        @                   \n" +
                        "           @      @                     \n" +
                        "                 #                      \n" +
                        "                                        \n" +
                        "           @                            \n" +
                        "                  @               @@    \n" +
                        "                   /              @     \n" +
                        "        @           @          @        \n" +
                        "     &                 @   @.         @ \n" +
                        "                                        \n" +
                        " @                                     .\n" +
                        "                                @       \n" +
                        "            @           (         %     \n" +
                        " / @         (       @         /        \n" +
                        "   @            @        @@    @   @    \n" +
                        "      @              @&  @      @       \n" +
                        "         @                  #           \n" +
                        "            #      /     @              \n" +
                        "              %        #                \n" +
                        "       %@           @       *@          \n" +
                        "                      /           ,     \n" +
                        "    @                    @       @ "
            )
            val dau = tirarDau()
            println("${player.nom} has sacado un: $dau")


        }


        //Dau bo
        else if (casella.mouPosicions == 25 || casella.mouPosicions == -25) {
            player.posicio += casella.mouPosicions
            println(
                "De dado a dado y tiras porque te ha dado" +
                        "                                                             \n" +
                        "                                                                                \n" +
                        "                                  &&%%&&#                                       \n" +
                        "                              &                %&&&%                            \n" +
                        "                            %                          &&&                      \n" +
                        "                         &                            &   %&                    \n" +
                        "                       &            &%&&&          &%      .&                   \n" +
                        "                    &               *%           &          &%                  \n" +
                        "                  &                            &      &&     %                  \n" +
                        "                 &#  &&%                    &        &&&&     &                 \n" +
                        "                 &             &&&&       &           %       &&                \n" +
                        "                       &&%              &&                     %&               \n" +
                        "                  &    &&&&#             &                      &               \n" +
                        "                   &                      &                     &               \n" +
                        "                    &         &&&&         &      &&&          &                \n" +
                        "                    %          &&&         %      &&&        &%                 \n" +
                        "                     &                      &             &&                    \n" +
                        "                      &              &%&&    &          &&                      \n" +
                        "                        &              /     &&      %&                         \n" +
                        "                            &&&&%.            &    &%                           \n" +
                        "                                      .&&&&&&&&&&&        "
            )
            println("${player.nom} te mueves hasta la poscion ${player.posicio}")
            val dau = tirarDau()
            player.posicio += dau
            println("${player.nom} has sacado un: $dau")
            println("${player.nom} te mueves hasta la poscion ${player.posicio}")
        }

        //Calavera
        else if (casella.mouPosicions == -57) {
            player.posicio += casella.mouPosicions
            println(
                "Has muerto ahora tienes que volver a empezar" +
                        "                                                             \n" +
                        "                               /@@@@@@@@@@@@@@@@@*                              \n" +
                        "                        %@@@@/                     %@@@@%                       \n" +
                        "                     @@@                                 @@@                    \n" +
                        "                  .@@                                       @@                  \n" +
                        "                 @@                                          ,@@                \n" +
                        "                @@                                             @@               \n" +
                        "               @@                                           .   @&              \n" +
                        "               @@  @@                                       @@  @@              \n" +
                        "               @@  @@                                       @@  @@              \n" +
                        "               @@   @@                                     @@   @@              \n" +
                        "                @@  .@@                                   %@.  @@.              \n" +
                        "                .@@  @@    #@@@@@@@@         @@@@@@@@#    @@  @@.               \n" +
                        "                  @@ @@ #@@@@@@@@@@@@       @@@@@@@@@@@@/ #@/@@                 \n" +
                        "                    @@  ,@@@@@@@@@@@         @@@@@@@@@@@.  @@                   \n" +
                        "      @@@@@         @@   .@@@@@@@@@           @@@@@@@@@    &@        %@@@@@     \n" +
                        "     @@    @@       @%     /@@@@@     @@ @@     @@@@@*     (@.      @@   .@#    \n" +
                        "    .@@     @@@,    @@               @@@ @@@               @@    (@@&     @@    \n" +
                        "  @@@           @@@@*@@@,           @@@@ @@@@           (@@@%@@@&           @@% \n" +
                        "  @@@,.*@@@#         @@@@@@@@@      @@@@ @@@@      @@@@@@@@%         /@@@..*@@@ \n" +
                        "            #@@@@        @@ @ @@                 @@ @ @@        @@@@(           \n" +
                        "                 .@@@@    @@/( @@               %@ @ @@   .@@@@.                \n" +
                        "                       @@@@@ @ @ &  * % @ @ @  * & @ @@@@@                      \n" +
                        "                          @% (/@ @@@@/% @,@%@@@* &@  @@                         \n" +
                        "                     @@@@ @@   /@@    # @ & @  &@*   @@*@@@@                    \n" +
                        "         &@@*  /@@@@.      @@                       @@       @@@@#  %@@#        \n" +
                        "      .@%               (@@@@@@                   @@@@@@/               (@#     \n" +
                        "       *@@.         @@@@      *@@@@.         ,@@@@       @@@@,        .@@/      \n" +
                        "          @@    .@@                  ,##&##.                  @@*    @@         \n" +
                        "          &@   @@                                               @@   @@         \n" +
                        "           @@@@.                                                  @@@@          \n" +
                        "                                                                       "
            )
            println("${player.nom} te mueves hasta ${player.posicio}")
        }


        //Carcel
        else if (casella.perdsPartides == 3) {
            println("Has sido arrestado ahora te tienes que quedar 3 turnos aqui" +
                    "%                                                                            @\n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (        @@  (         @  (         @  (         @  (@@       @  /     \n" +
                    "      @  (      @  @  (         @  (         @  (         @  (   @     @  /     \n" +
                    "      @  (      .  @  (         @  (         @  (         @  (   .     @  /     \n" +
                    "      @  (   @(        @        @  (         @  (         @        (@  @  /     \n" +
                    "      @  (  /    @@@@(. @       @  (         @  (        @ .(@@@@    ( @  /     \n" +
                    "      @  (  @           @       @  (         @  (        @           @ @  /     \n" +
                    "      @  (  @    .,,,,. @       @  (         @  (        @ .,,*,.    @ @  /     \n" +
                    "      @  (  @           @       @  (         @  (        @           @ @  /     \n" +
                    "      @  (  .,   ./#&@@@/       @  (         @  (        /@@@&#/,   ,. @  /     \n" +
                    "      @  (   /          @       @  (         @  (        @          (  @  /     \n" +
                    "      @  (      .,*@. (         @  (         @  (         @  (,*,.     @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "      @  (         @  (         @  (         @  (         @  (         @  /     \n" +
                    "  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                    "  %                                                                            @")
            player.nortirar = true
            if (ronda == rondaPartida - 2) {
                player.nortirar = false
            }


        }
        //Posada
        else if (casella.perdsPartides == 5) {
            println(
                "Te has emborachado te quedas en la posada por 2 turnos" +
                        "         .sssssssss.\n" +
                        "                   .sssssssssssssssssss\n" +
                        "                 sssssssssssssssssssssssss\n" +
                        "                ssssssssssssssssssssssssssss\n" +
                        "                 @@sssssssssssssssssssssss@ss\n" +
                        "                 |s@@@@sssssssssssssss@@@@s|s\n" +
                        "          _______|sssss@@@@@sssss@@@@@sssss|s\n" +
                        "        /         sssssssss@sssss@sssssssss|s\n" +
                        "       /  .------+.ssssssss@sssss@ssssssss.|\n" +
                        "      /  /       |...sssssss@sss@sssssss...|\n" +
                        "     |  |        |.......sss@sss@ssss......|\n" +
                        "     |  |        |..........s@ss@sss.......|\n" +
                        "     |  |        |...........@ss@..........|\n" +
                        "      \\  \\       |............ss@..........|\n" +
                        "       \\  '------+...........ss@...........|\n" +
                        "        \\________ .........................|\n" +
                        "                 |.........................|\n" +
                        "                /...........................\\\n" +
                        "               |.............................|\n" +
                        "                  |.......................|\n" +
                        "                      |...............|\n"
            )
            player.nortirar = true
            if (ronda == rondaPartida - 4) {
                player.nortirar = false
            }


        }


    }

    //Aquesta part es el motor general del joc el qual ens permet enumerar els torns per a despres poderlos restart en les casselles especials fa el mateix amb les rondes
    // i ha mes a mes canvia el els torns entre jugadors finalment tambe es el funcio que comprova si has guanyat
    fun play() {
        var isWinner = false
        var rondaPartida = 1
        while (!isWinner) {
            for (i in 0..jugadors.size - 1) {
                jugadors[i].turno = true
                if (!jugadors[i].nortirar) {
                    val roll = tirarDau()
                    println("${jugadors[i].nom} sacado un: $roll")
                    moure(jugadors[i], roll, jugadors[i].ronda, rondaPartida)
                    jugadors[i].ronda = rondaPartida

                } else {
                    println("A ${jugadors[i].nom} se le salta el turno")
                    moure(jugadors[i], 0, jugadors[i].ronda, rondaPartida)

                }

                if (jugadors[i].posicio == 63) {
                    isWinner = true
                }
                jugadors[i].turno = false
            }
            rondaPartida++
        }

        // El joc ha acbat
    }
}


