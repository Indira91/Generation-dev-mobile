import kotlin.math.pow

fun main(args: Array<String>) {

    //Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele

    print("Digite seu nome: ")
    var nome = readln()

    print("Digite o diámetro do círculo: ")
    var diam = readln().toDouble()

    var PI = 3.14
    var area = (PI) * ((diam/2).pow(2))
    var perim = 2 * PI * (diam/2)

    print(nome.uppercase() + " o perímetro do círculo e "  +
            "%.1f".format(perim) + " e a área e " + "%.1f".format(area))
}