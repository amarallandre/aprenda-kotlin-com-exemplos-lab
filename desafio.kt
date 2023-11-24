enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val ID: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            println("${usuario.nome} foi matriculado na formação de $nome.")
        } else {
            println("${usuario.nome} já está matriculado nesta formação.")
        }
    }
}

fun main() {

    val conteudo1 = ConteudoEducacional("Introdução a java", 90)
    val conteudo2 = ConteudoEducacional("Introdução a html", 120)
    val conteudo3 = ConteudoEducacional("Banco de Dados", 100)


    val formacao1 = Formacao("Desenvolvedor back-end", listOf(conteudo1))        
    val formacao2 = Formacao("Desenvolvedor front-end", listOf(conteudo2))
    val formacao3 = Formacao("Analista de Dados", listOf(conteudo3))


    val usuario1 = Usuario("João", 1)
    val usuario2 = Usuario("Maria", 2)
    val usuario3 = Usuario("Lucas", 3)


    formacao1.matricular(usuario1)
    formacao2.matricular(usuario2)

    formacao3.matricular(usuario3)
}
