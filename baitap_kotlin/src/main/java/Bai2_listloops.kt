fun main() {
    val entrees = mutableListOf("Phở", "Bún chả", "Cơm tấm")
    println("Danh sách ban đầu: $entrees")
    entrees.add("Bánh mì")

    entrees[0] = "Bún bò"

    println("\nMenu hôm nay gồm có:")
    for (food in entrees) {
        println("- Món: $food")
    }
}