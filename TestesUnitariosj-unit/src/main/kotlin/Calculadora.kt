class Calculadora {


    companion object{

        fun soma(n1: Int, n2: Int, n3: Double): Double{
            return n1 + n3 + n2
        }

        fun mult(n1: Int, n2: Int): Int{
            return n1 * n2
        }
        fun divisao(n1: Int, n2: Int): Int{
            return n1 / n2
        }
        fun subtracao (valor1: Int, valor2: Int, ): Int{
           return  valor1 - valor2

        }
        fun exponenciaciao(n1: Double, n2: Double): Int{
            return Math.pow(n1, n2).toInt()
        }
        fun raizQuadrada(n1: Double) : Double{
            return Math.sqrt(n1)
        }
    }
}