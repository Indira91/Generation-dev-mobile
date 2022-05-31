import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{

    @Test

    fun somaTest(){
        assertEquals(55.4, Calculadora.soma(5, 50, 0.4))
    }

    @Test
    fun multTest(){
        assertEquals(32, Calculadora.mult(4, 8))
    }

    @Test
    fun divisTest(){
        assertEquals(20, Calculadora.divisao(60, 3))
    }

    @Test

    fun subTest(){
        assertEquals(65, Calculadora.subtracao(90, 25))
    }

    @Test

    fun expoTest(){
        assertEquals(16777216, Calculadora.exponenciaciao(8.0, 8.0))
    }

    @Test

    fun raizquaTest(){
        assertEquals(8.0,Calculadora.raizQuadrada(64.0))
    }


}