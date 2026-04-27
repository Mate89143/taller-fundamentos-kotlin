// Archivo: ejercicios/Bloque5Funciones.kt
package ejercicios

fun ejecutarBloque5() {
    println("=== BLOQUE 5: FUNCIONES ===")

    // Ejercicio 21
    val mensaje = saludar("Mateo")
    println(mensaje)

    // Ejercicio 22
    println("Suma: ${sumar(5, 3)}")

    // Ejercicios 23 y 24
    crearRectangulo(ancho = 5)

    // Ejercicio 25
    val pesos = convertirADineroLocal(10.0)
    println("10 USD en moneda local: $pesos")
}

// Ejercicio 21
fun saludar(nombre: String): String {
    return "Hola, $nombre!"
}

// Ejercicio 22
fun sumar(a: Int, b: Int): Int = a + b

// Ejercicio 24
fun crearRectangulo(ancho: Int, alto: Int = 10) {
    println("Rectángulo de $ancho x $alto")
}

// Ejercicio 25
fun convertirADineroLocal(dolares: Double): Double {
    val tasaCambio = 4000.0
    return dolares * tasaCambio
}