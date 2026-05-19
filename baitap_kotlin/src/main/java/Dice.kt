
class Dice {
    var sides = 6
    fun roll() {
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}
fun main() {
    val myFirstDice = Dice()
    println("Đang đổ xúc xắc...")
    myFirstDice.roll()
}