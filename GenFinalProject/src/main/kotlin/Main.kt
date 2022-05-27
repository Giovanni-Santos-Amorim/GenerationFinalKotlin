fun main()
{
    do{
        when(inicio())
        {
            1 -> {
                println("Insira sua informaçoes para se cadastrar como Doador: ")

                print("Digite o seu nome: ")
                val nomeDoador = readLine()!!

                print("Digite o seu cpf, somente números: ")
                val endereçoDoador = readLine()!!

                print("Digite o seu telefone: ")
                val telefoneDoador = readLine()!!

                print("Digite o seu email: ")
                val emailDoador = readLine()!!

                print("Digite o seu cpf, somente números: ")
                val cpfDoador = readLine()!!


                println("Escolha uma cesta para Doar:")

                val doador1 = Doador(nomeDoador, endereçoDoador, telefoneDoador, emailDoador, cpfDoador)

                println("Escolha qual cesta ira doar: ")

                Ong.printlist()

                var cesta = readln().toString()
                doador1.doarCesta(cesta)





            }

           /* 2 ->{
                println("Insira sua informaçoes para se cadastrar: ")
            }*/


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
