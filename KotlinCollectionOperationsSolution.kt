```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val keys = map.keys
    println(keys) // Output: [a, b, c]

    // Safer way to iterate and handle potential nulls
    for (key in keys) {
        val value = map[key] // value could be null if map is mutable and entry was removed
        println(value ?: "Key not found") // Use the elvis operator to handle null values
    }

    // Example demonstrating null checks for safety
    val nullableMap: Map<String, Int?>? = null
    val safeValue = nullableMap?.get("a")?.let { it * 2 } ?: 0
    println(safeValue) // Output: 0 (handles null map and null value gracefully)
} 
```