// Archivo: ejercicios/Bloque4Ciclos.kt
package ejercicios

fun ejecutarBloque4() {
    println("=== BLOQUE 4: CICLOS ===")

    // Ejercicio 16
    println("Conteo del 1 al 10:")
    for (i in 1..10) {
        println(i)
    }

    // Ejercicio 17
    println("\nCuenta regresiva del 10 al 1:")
    for (i in 10 downTo 1) {
        println(i)
    }

    // Ejercicio 18
    println("\nConteo de 1 a 20 en saltos de 3:")
    for (i in 1..20 step 3) {
        println(i)
    }

    // Ejercicio 19
    println("\nWhile con energía:")
    var energia = 5

    while (energia > 0) {
        println("Energía restante: $energia")
        energia--

        // Ejercicio 20
        println("\nValidación de contraseña:")

        var contrasena: String

        do {
            println("Ingrese la contraseña:")
            contrasena = "1234"
        } while (contrasena != "1234")

        println("Contraseña correcta")

    }
}