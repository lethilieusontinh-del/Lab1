fun main() {// Assign once, cannot change.
    val age = "20"
    val name = "Lee Sink"

// Assign and change as needed.
    var roll = 6
    var rolledValue: Int = 4
    println("You are already ${age}!")
    println("You are already ${age} days old, ${name}!")
    // Define the function.
    fun printHello () {
        println ("Hello Kotlin")
    }

// Call the function.
    printHello()
    fun printBorder(border: String, timesToRepeat: Int) {
        repeat(timesToRepeat) {
            print(border)
        }
        println()
    }
    fun roll(): Int {
        val randomNumber = (1..6).random()
        return randomNumber
    }
    
}