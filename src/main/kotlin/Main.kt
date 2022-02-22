fun main() {
    atividade1()
    atividade2()
    atividade3()
    atividade4()
    atividade5()
}
fun atividade1():Unit{
    println("Digite o Primeiro Número:")
    val value1 = readLine()!!.toFloat()
    println("Digite o Segundo número:")
    val value2 = readLine()!!.toFloat()
    if (value1 > value2) {
        println("O primeiro número é o maior")
    }else {
        println("O segundo número é o maior")
    }
}

fun atividade2():Unit{
    println("Digite um Número:")
    val value = readLine()!!.toFloat()
    if(value > 0){
        println("O Número $value é Positivo!!!")
    }else{
        println("O Número $value é Negativo!!!")
    }
}

fun atividade3():Unit{
    println("Digite uma Letra Qualquer")
    val letra = readLine()!!.toString()
    when(letra) {
        "a" -> println("Esta letra é vogal")
        "e" -> println("Esta letra é vogal")
        "i" -> println("Esta letra é vogal")
        "o" -> println("Esta letra é vogal")
        "u" -> println("Esta letra é vogal")
        else -> println("Esta letra é consoante")
    }
}

fun atividade4():Unit{
    val jogo = Adivinha()
    println("Digite um número de 0 a 10 para o seu palpite")
    val palpite = readLine()!!.toInt()
    if (palpite in 0 .. 10){
        println(jogo.jogar(palpite))
    } else {
        println("Palpite Inválido")
    }
}

fun atividade5():Unit{
    val jogo = Jokenpo()
    println("Digite um número entre 1 e 3 para a sua jogada")
    val jogador = readLine()!!.toInt()

    if(jogador in 1..3){
        println(jogo.jogar(jogador))
    }else{
        println("Jogada inválida!!!")
    }
}