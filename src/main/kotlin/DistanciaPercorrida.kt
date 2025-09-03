fun main(){
    var distanciaPercorrida = 4.2232131233F
    var distanciaPercorridaFormatada = String.format("%.2f", distanciaPercorrida)
    println("""
        Hoje voce se locomoveu um total de : ${distanciaPercorridaFormatada} Km
    """.trimIndent())
}
