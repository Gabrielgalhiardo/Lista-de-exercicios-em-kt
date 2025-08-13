fun main(){
    val musica = "Natural mystic"
    val nomeDoArtista = "Bob Marley"
    val duracaoDaMusicaEmSegundos: Int = 55
    var progressoDaMusica = 222

    if (progressoDaMusica >= duracaoDaMusicaEmSegundos){
        println("""
        |Nome da musica: ${musica}
        |Artista: ${nomeDoArtista}
        |Duração: ${duracaoDaMusicaEmSegundos}
        |Progresso: finalizado
    """.trimMargin())
    }else{
    println("""
        |Nome da musica: ${musica}
        |Artista: ${nomeDoArtista}
        |Duração: ${duracaoDaMusicaEmSegundos}
        |Progresso: ${progressoDaMusica}
    """.trimMargin())
}}
