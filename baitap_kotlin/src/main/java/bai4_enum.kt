// Định nghĩa các hướng đi
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun main() {
    val currentDirection = Direction.NORTH

    // Dùng when để kiểm tra hướng
    when (currentDirection) {
        Direction.NORTH -> println("Bạn đang đi về hướng Bắc")
        Direction.SOUTH -> println("Bạn đang đi về hướng Nam")
        else -> println("Bạn đang đi hướng khác")
    }
}