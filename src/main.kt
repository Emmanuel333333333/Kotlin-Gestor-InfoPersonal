import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val usuarios = mutableListOf<User>()

    println("=== REGISTRO DE USUARIOS ===")

    repeat(3) { i ->
        println("\n--- Usuario ${i + 1} ---")

        print("Nombre completo: ")
        val nombre = readLine() ?: ""

        var edad: Int
        while (true) {
            print("Edad: ")
            edad = scanner.nextInt()
            if (edad > 0) break
            println("Edad inválida, intenta de nuevo.")
        }

        var altura: Double
        while (true) {
            print("Altura (metros): ")
            altura = scanner.nextDouble()
            if (altura > 0) break
            println("Altura inválida, intenta de nuevo.")
        }

        var peso: Double
        while (true) {
            print("Peso (kg): ")
            peso = scanner.nextDouble()
            if (peso > 0) break
            println("Peso inválido, intenta de nuevo.")
        }

        scanner.nextLine() // limpiar buffer

        var email: String
        while (true) {
            print("Email: ")
            email = readLine() ?: ""
            if (email.contains("@") && email.contains(".")) break
            println("Email inválido, intenta de nuevo.")
        }

        print("Ciudad de residencia: ")
        val ciudad = readLine() ?: ""

        val user = User(nombre, edad, altura, peso, email, ciudad)
        usuarios.add(user)
    }

    println("\n=== INFORMACIÓN DE LOS USUARIOS ===")
    for ((index, user) in usuarios.withIndex()) {
        val imc = user.peso / (user.altura * user.altura)
        val mayorEdad = user.edad >= 18
        val nombreMayus = user.nombre.uppercase()
        val nombreMinus = user.nombre.lowercase()
        val dominio = user.email.substringAfter("@")
        val resumen = """
            --- Usuario ${index + 1} ---
            Nombre: $nombreMayus
            Nombre (minúscula): $nombreMinus
            Edad: ${user.edad} años - ${if (mayorEdad) "Mayor de edad" else "Menor de edad"}
            Altura: ${user.altura} m
            Peso: ${user.peso} kg
            IMC: ${"%.2f".format(imc)}
            Email: ${user.email}
            Dominio del email: $dominio
            Ciudad: ${user.ciudad}
        """.trimIndent()

        println(resumen)
        println("----------------------------")
    }
}
