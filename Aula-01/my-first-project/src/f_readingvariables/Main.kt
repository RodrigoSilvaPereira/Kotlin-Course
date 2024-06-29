package f_readingvariables

import java.util.*

fun main() {

    print("Digite o seu nome: ")
    val name = readln()

    print("Digite a sua idade: ")
    val yearsOld = readln().toInt()

    print("Seu nome é $name e sua idade é $yearsOld")

    val scanner = Scanner(System.`in`)
    print("> ")
    val n1 = scanner.nextInt()

    print("> ")
    val n2 = scanner.nextInt()

    val result = n2 + n1

    print(result)
}