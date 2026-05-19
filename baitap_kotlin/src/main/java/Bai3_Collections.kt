fun main() {
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5)
    val setOfNumbers = numbers.toSet()
    println("Set đã lọc trùng: $setOfNumbers")
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges["Joe"] = 51
    peopleAges.forEach { (name, age) ->
        println("$name năm nay $age tuổi")
    }

}
