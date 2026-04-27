// Archivo: ejercicios/Bloque2NullSafety.kt
package ejercicios

fun ejecutarBloque2() {
    println("=== BLOQUE 2: NULLSAFETY ===")

    // Ejercicio 6
    var apodo: String? = null
    println("Apodo: $apodo")

    // Ejercicio 7
    val resultadoApodo = apodo ?: "Sin apodo"
    println("Resultado: $resultadoApodo")

    // Ejercicio 8
    val longitudApodo = apodo?.length
    println("Longitud del apodo: $longitudApodo")

    // Ejercicio 9
    val correo: String? = "mateo@email.com"

    correo?.let {
        println("Correo enviado a $it")
    }

    // Ejercicio 10
    var nombre: String? = "Mateo"

    val longitudNombre = nombre!!.length
    println("Longitud del nombre: $longitudNombre")
}