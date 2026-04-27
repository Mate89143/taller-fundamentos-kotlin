// Archivo: ejercicios/Bloque6Colecciones.kt
package ejercicios

fun ejecutarBloque6() {
    println("=== BLOQUE 6: COLECCIONES ===")

    // Ejercicio 26
    val compras = mutableListOf("Pan", "Leche", "Huevos")
    println("Lista inicial: $compras")

    compras.add("Queso") // añadir nuevo producto
    compras.removeAt(1)  // eliminar el segundo (índice 1)

    println("Lista actualizada: $compras")

    // Ejercicio 27
    val precios = listOf(10, 25, 60, 80, 45)
    val baratos = precios.filter { it < 50 }

    println("Precios menores a 50: $baratos")

    // Ejercicio 28
    val amigos = listOf("Carlos", "Ana", "Luis", "Andrés")
    val encontrado = amigos.find { it.startsWith("A") }

    println("Primer nombre con A: $encontrado")

    // Ejercicio 29
    val numero = -5
    println("¿Es negativo? ${numero.esNegativo()}")

    // Ejercicio 30
    val texto = "Hola mundo Kotlin"
    println("Texto sin espacios: ${texto.quitarEspacios()}")
}

// Ejercicio 29
fun Int.esNegativo(): Boolean {
    return this < 0
}

// Ejercicio 30
fun String.quitarEspacios(): String {
    return this.replace(" ", "")
}