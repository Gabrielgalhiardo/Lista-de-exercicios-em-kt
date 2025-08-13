fun main(){
    var contadorDeLikes: Int = 0
    val nomeDoRemetente = "Gabriel"
    var conteudo = "Eu nao consigo mais prestar atenção na aula, essas musias estão me tirando a concentração"
    var numeroDeItens: Int = 2
    var valorPorItem: Float = 55.5F
    val valorCarrinho: Float = valorPorItem *numeroDeItens

    println("Likes: $contadorDeLikes")
    println("Remetente: $nomeDoRemetente")
    println("Conteúdo: $conteudo")
    println("Número de itens: $numeroDeItens")
    println("Valor por item: R$ $valorPorItem")
    println("Valor total do carrinho: R$ $valorCarrinho")
}
