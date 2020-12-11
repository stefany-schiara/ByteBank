class TestaCopiasEReferencias

    fun testarCopiaEReferencia(){

        //Aqui é uma cópia, altera somente a variavel que eu desejo
        val numeroX = 10
        var numeroY = numeroX
        numeroY++

        println("numeroX $numeroX")
        println("numeroY $numeroY")

        val contaOgawa = Conta("Ogawa", 1001)

        //Quando eu faço isso, ambas são alteradas, pois estou fazendo referencia, ou seja
        //estou apontando para o mesmo endereço na memoria, apesar de nomes diferentes, o objeto é o mesmo
        var contaSchiara = contaOgawa
        contaSchiara.titular = "Schiara"


        println("contaOgawa $contaOgawa")
        println("contaSchiara $contaSchiara")

        //para criar um novo objeto de fato, ou seja, uma nova instancia em outro endereço da memoria
        // é necessario criar um objeto do tipo conta, conforme abaixo

        var contaNova = Conta("Nova Conta", 1003)

        println("nova conta ${contaNova.titular}")
    }

