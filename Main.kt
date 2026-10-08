enum class Rol {
    ADMIN, EDITOR, VISITANTE
}

interface Autenticable {
    fun iniciarSesion(clave: String): Boolean
}

data class Usuario(val id: Int, val nombre: String, val password: String, val rol: Rol) : Autenticable {
    override fun iniciarSesion(clave: String): Boolean {
        return password == clave
    }
}

fun main() {
}
