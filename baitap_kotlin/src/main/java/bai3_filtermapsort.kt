fun main() {
    val words = listOf("about", "acute", "balloon", "best", "brief", "class")

    val filteredWords = words
        .filter { it.startsWith("b", ignoreCase = true) } // Lọc từ bắt đầu bằng 'b'
        .shuffled()                                      // Trộn ngẫu nhiên
        .take(2)                                         // Lấy 2 từ đầu tiên
        .sorted()                                        // Sắp xếp theo bảng chữ cái

    println("Kết quả sau khi lọc và sắp xếp: $filteredWords")
}