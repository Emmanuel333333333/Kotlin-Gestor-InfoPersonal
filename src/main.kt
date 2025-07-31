import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val usuarios = mutableListOf<User>()

    println("=== REGISTRO DE USUARIOS ===")

    // === Usuario 1 ===
    println("\n--- Usuario 1 ---")
    val user1 = crearUsuario(scanner)
    usuarios.add(user1)

    // === Usuario 2 ===
    println("\n--- Usuario 2 ---")
    val user2 = crearUsuario(scanner)
    usuarios.add(user2)

    // === Usuario 3 ===
    println("\n--- Usuario 3 ---")
    val user3 = crearUsuario(scanner)
    usuarios.add(user3)

    println("\n=== INFORMACIÓN DE LOS USUARIOS ===")
    mostrarDatos(usuarios[0], 1)
    mostrarDatos(usuarios[1], 2)
    mostrarDatos(usuarios[2], 3)
}

// === FUNCIÓN PARA VALIDAR EMAIL ===
// Esta función verifica que el email contenga un '@' y un '.' después del '@'
fun esEmailValido(email: String): Boolean {
    val atIndex = email.indexOf("@")
    val dotIndex = email.indexOf(".", atIndex)
    return atIndex > 0 && dotIndex > atIndex
}

// === FUNCIÓN PARA CREAR USUARIO ===
fun crearUsuario(scanner: Scanner): User {
    print("Nombre completo: ")
    val nombre = readLine() ?: ""

    print("Edad: ")
    var edad = scanner.nextInt()
    if (edad <= 0) {
        println("Edad inválida, intenta de nuevo.")
        print("Edad: ")
        edad = scanner.nextInt()
    }

    print("Altura (metros): ")
    var altura = scanner.nextDouble()
    if (altura <= 0) {
        println("Altura inválida, intenta de nuevo.")
        print("Altura (metros): ")
        altura = scanner.nextDouble()
    }

    print("Peso (kg): ")
    var peso = scanner.nextDouble()
    if (peso <= 0) {
        println("Peso inválido, intenta de nuevo.")
        print("Peso (kg): ")
        peso = scanner.nextDouble()
    }

    scanner.nextLine() // Limpiar el buffer

    print("Email: ")
    var email = readLine() ?: ""

    if (!esEmailValido(email)) {
        println("Email inválido, intenta de nuevo.")
        print("Email: ")
        email = readLine() ?: ""

        if (!esEmailValido(email)) {
            println("Email inválido, intenta de nuevo.")
            print("Email: ")
            email = readLine() ?: ""

            if (!esEmailValido(email)) {
                println("Email inválido. Se excedieron los intentos.")
            }
        }
    }

    print("Ciudad de residencia: ")
    val ciudad = readLine() ?: ""

    return User(nombre, edad, altura, peso, email, ciudad)
}

// === FUNCIÓN PARA MOSTRAR DATOS ===
fun mostrarDatos(user: User, index: Int) {
    val imc = user.peso / (user.altura * user.altura)
    val mayorEdad = user.edad >= 18
    val nombreMayus = user.nombre.uppercase()
    val nombreMinus = user.nombre.lowercase()
    val dominio = user.email.substringAfter("@")

    val resumen = """
        --- Usuario $index ---
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
    println("----------------------------\n")
}