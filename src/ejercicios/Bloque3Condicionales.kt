// Archivo: ejercicios/Bloque3Condicionales.kt
package ejercicios

fun ejecutarBloque3() {
    println("=== BLOQUE 3: CONDICIONALES ===")

    // Ejercicio 11
    val edad = 20

    if (edad >= 18) {
        println("Puede votar")
    } else {
        println("No puede votar")
    }

    // Ejercicio 12
    val nota = 3.5
    val resultado = if (nota >= 3.0) "Aprobado" else "Reprobado"
    println("Resultado: $resultado")


    // Ejercicio 13
    val color = "Rojo"

    when (color) {
        "Rojo" -> println("Pare")
        "Amarillo" -> println("Precaución")
        "Verde" -> println("Siga")
        else -> println("Color desconocido")
    }

    // Ejercicio 14
    val temperatura = 22

    when (temperatura) {
        in Int.MIN_VALUE..14 -> println("Frío")
        in 15..25 -> println("Templado")
        in 26..Int.MAX_VALUE -> println("Calor")
    }

    // Ejercicio 15
    val dato: Any = "Hola mundo"

    when (dato) {
        is String -> println("Es un String con longitud ${dato.length}")
        is Int -> println("Es un Int con valor $dato")
        else -> println("Tipo desconocido")
    }
}