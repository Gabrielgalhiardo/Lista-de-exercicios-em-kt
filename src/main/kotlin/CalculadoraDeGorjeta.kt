fun main(){
    val valorConta: Float = 529.55F
    val gorjeta: Float = valorConta *0.1F

    println("Com o valor da conta sendo: ${valorConta} e a gorjeta ficará: %.2f".format(gorjeta) + " \nCom um preço total de: %.2f".format(gorjeta + valorConta))
}