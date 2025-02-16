```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val keys = map.keys
    println(keys) //Output: [a, b, c]
    for (key in keys) {
        println(map[key]) // Output: 1,2,3
    }
}