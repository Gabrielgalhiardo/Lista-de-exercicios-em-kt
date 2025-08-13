fun main(){
    val nomeDoApp = "site muito doido"
    println("Bem-vindo ao ${nomeDoApp}")

    val versaoDoAplicativo = "1.0"
    println(versaoDoAplicativo)

    val cores: Array<String> = arrayOf("#FFFFFFF", "#0x03dsa3")
    println("Cores disponiveis: \n ${cores[0]} \n ${cores[1]}")

    val nome = "Gabriel"
    val idade = 18
    val cidade = "São Paulo"
    println("Bem-vindo ${nome}, ${idade} anos, ${cidade}")

    val online: Boolean = true
    if (online){
        println("O usuario está online")
    }else{
        println("O usuario não está online")
    }
}
