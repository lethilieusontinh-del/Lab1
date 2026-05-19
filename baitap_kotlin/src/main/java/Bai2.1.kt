abstract class Dwelling {
    abstract val buildingMaterial: String
    abstract fun floorArea(): Double
}

class SquareCabin(val length: Double) : Dwelling() {
    override val buildingMaterial = "Gỗ"

    override fun floorArea(): Double {
        return length * length
    }
}

fun main() {
    val myCabin = SquareCabin(5.0)

    println("Ngôi nhà của tôi làm bằng: ${myCabin.buildingMaterial}")
    println("Diện tích ngôi nhà là: ${myCabin.floorArea()}")
}