package OcaKotlin

fun main() {
    Intro.intro()
    //Atribueix el nombre de jugadors
    val jugador1 = Jugador(Intro().retornarNombreval(), Intro().retornarColorJugador(),0,false,true, 1)
    val jugador2 = Jugador(Intro().retornarNombreval(), Intro().retornarColorJugador(),0,false,true, 1)


    val joc = OcaGame(listOf(jugador1,jugador2))
    joc.play()




}
