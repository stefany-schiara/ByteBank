class TestaLacos

    fun testarWhile(){
        var i = 0
        while(i < 5) {
            val titular: String = "Stefany $i";
            val numeroConta: Int = 1000 + i;
            var saldo = i + 10.0;

            println("titular $titular");
            println("número da conta $numeroConta");
            println("saldo da conta $saldo");
            println();
            i++;
        }
    }

    fun testarForDentroDeFor(){
        loop@ for (i in 1..100) {
            println("i $i")
            for (j in 1..100) {
                println("j $j")
                if (j == 5) break@loop
            }
        }
    }

    fun testarForPulandoIntervalos() {
        for (i in 1..5 step 2) {
            if (i == 3){
                break
            }

            val titular: String = "Stefany $i"
            val conta: Int = 1000 + i
            var saldo: Double = 100.0 + i

            println("conta: $conta ")
            println("titular: $titular")
            println("saldo: $saldo")
        }
    }

    fun testarForDecrescente() {

        for (i in 5 downTo 1) {
            val titular: String = "Stefany $i"
            val conta: Int = 1000 + i
            var saldo: Double = 100.0 + i

            println("conta: $conta ")
            println("titular: $titular")
            println("saldo: $saldo")
        }
    }

    fun testarFor(saldo: Double) {
        for (i in 1..5) {

            val titular: String = "Stefany $i"
            val conta: Int = 1000 + i
            var saldo: Double = 100.0 + i

            println("conta: $conta ")
            println("titular: $titular")
            println("saldo: $saldo")
        }
    }
