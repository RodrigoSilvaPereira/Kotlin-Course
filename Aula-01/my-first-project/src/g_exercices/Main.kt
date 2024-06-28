package g_exercices

fun main() {
    /**
     * Exercice:
     *
     * Leia 3 informações do usuário: Nome, Idade e Salário. Mostre essas informações no console através do println
     * Utilize "string template". Faça um cálculo para saber quanto vai ser o salário com aumento de 50%
     */

    println("Welcome to my system to user!!")

    print("Please write your name: ")
    val name = readln()

    print("Write your age (years): ")
    val age = readln().toInt()

    print("Write your Salary: ")
    val salary = readln().toFloat()

    val futureSalary = salary * 1.523

    println("Hello! $name. Confirming your age is $age and your salary is $salary.\nYour future salary is $futureSalary")

    println("Rounding the value: ${futureSalary.toInt()}")
}
