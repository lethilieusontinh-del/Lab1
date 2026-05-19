fun main() {
    val name = "Android"
    val number = 10
    val groups = 5

    // Dùng .length để đếm số ký tự
    println("Chữ $name có tất cả ${name.length} ký tự.")

    // Dùng ${ } để tính toán ngay bên trong chuỗi in ra
    println("Tổng số học sinh là: ${number * groups} người.")
}