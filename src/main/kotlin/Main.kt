fun main(args: Array<String>) {
    println("Введите две различные цифры:")
    val number1 = readln().toInt()
    val number2 = readln().toInt()

    if (number1 != number2) {
        val result = number1 + number2
        if (result % 2 != 0) {
            println("Результат: $result")
        } else {
            println("Создать нечетное число невозможно")
        }
    }
}