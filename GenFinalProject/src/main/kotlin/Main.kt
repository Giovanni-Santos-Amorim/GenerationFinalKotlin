fun main()
{
    do{
        when(inicio())
        {
            1 -> {
                println("Insira sua informaçoes para se cadastrar: ")

                print("Digite o seu nome: ")
                val nomeDoador = readLine()

                print("Digite o seu endereco: ")
                val enderecoDoador = readLine()

                print("Digite o seu telefone: ")
                val telefoneDoador = readLine()

                print("Digite o seu email: ")
                val emailDoador = readLine()

                print("Digite o seu cpf, somente números: ")
                val cpfDoador = readLine()







            }

            2 ->{
                println("Insira sua informaçoes para se cadastrar: ")
            }


        }

    }while(true)
}




fun inicio(): Int {
    var operation: Int

    do {
        println("Digite 1 para Doar\nDigite 2 para ser um beneficiário:")
        operation = readln().toInt()
        if (!(operation == 1 || operation == 2)) {
            println("Opção inválida\n")
        }
    } while (!(operation == 1 || operation == 2))

    return operation
}
