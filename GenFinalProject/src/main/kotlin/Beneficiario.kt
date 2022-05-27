class Beneficiario(nome: String, endereco: String, cpf : String, telefone: String, email: String,
msg: String) {
    init {
        if (nome.isEmpty() || endereco.isEmpty() || cpf.isEmpty() || telefone.isEmpty()) {
            throw Exception(" Falha aos cadastrar, campos obrigatorios estao vazios !")
        } else {
            println("Cadastro realizado com sucesso, Entraremos em contato em por email ou telefone para marcar uma entrevista.")
        }
    }

}