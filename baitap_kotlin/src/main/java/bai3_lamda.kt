fun main() {
    // Khai báo một hàm nhân 3 dưới dạng Lambda
    // (Đầu vào là Int) -> Trả về Int = { tham số -> biểu thức }
    val triple: (Int) -> Int = { a: Int -> a * 3 }

    val result = triple(5)
    println("Kết quả 5 nhân 3 là: $result")
}