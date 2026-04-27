// Archivo: ejercicios/Bloque1Variables.kt
package ejercicios

fun ejecutarBloque1() {
    println("=== BLOQUE 1: VARIABLES ===")

    // Ejercicio 1
    val nombre = "Mateo"
    println("1. Nombre: $nombre")
    var ciudad = "Medellin"
    println("2. Ciudad: $ciudad")

    // Ejercicio 2
    val añoNacimiento = 2007
    val añoActual = 2026
    var edad = añoActual - añoNacimiento
    println("Tienes: $edad años")

    // Ejercicio 3
    var precioCoche: Double = 10.000
    var pesoNaranja: Float = 5.2f
    var poblacionMundo: Long = 8_000_000_000L

    println("3. Un coche cuesta $precioCoche dolares, " + "Una naranja pesa $pesoNaranja gramos, " + "La población del mundo es igual a $poblacionMundo personas")

    // Ejercicio 4
    val estaLloviendo = true
    println("¿Está lloviendo? $estaLloviendo")

    // Ejercicio 5
    println("Velocidad de la luz: ${Constants.VELOCIDAD_LUZ} m/s")
}

// Objetos para constantes
object Constants {
    const val VELOCIDAD_LUZ = 299_792_458 // en metros por segundo
}