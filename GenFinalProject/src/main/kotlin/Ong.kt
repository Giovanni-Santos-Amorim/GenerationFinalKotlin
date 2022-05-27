object Ong
{
    val listCestas = listOf(listOf("Macarrão","Toddy"),listOf("Nescau","Farinha"))

    fun printlist()
    {
        var count = 0
        for(i in listCestas) {
            if (count == 0)
            {
                println("Cesta A:")
            }
            else
            {
                println("Cesta B:")
            }
            count++
            for(i2 in i)
            {
                println(i2)
            }
        }

    }
}