import java.util.Objects

class Doador(nome: String, endereco: String, telefone: String, email: String, private var cpf: String
) {

    init {
        if (nome.isEmpty() || endereco.isEmpty() || cpf.isEmpty() || telefone.isEmpty()) {
            throw Exception(" Falha aos cadastrar, campos obrigatorios estao vazios !")
        } else {
            println("Cadastro realizado com sucesso, bem vindo ao time e parabens por realizar uma boa ação")
        }
    }

    fun doarCesta(cesta: String) {

        if (cesta == "") {
            println("O campo 'cesta' esta vazio")
        } else {
            println("Cesta $cesta doada com sucesso")
        }
    }
}