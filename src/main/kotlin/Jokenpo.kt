import kotlin.random.Random

class Jokenpo {
    fun jogar(jogador: Int): String {
        val computador = Random.nextInt(1,3)
        return if(
            jogador == 1 && computador == 3 ||
                jogador == 2 && computador == 1 ||
                    jogador == 3 && computador == 2
        ) "Você Venceu" else "Computador Venceu"
    }
}