package org.example.Maquina_de_Cafe

enum class Cafe(
    val nombre: String,
    val precio: Double,
    var cantidad: Int = 10
) {
    ESPRESSO("Espresso", 1.5),
    CAPUCHINO("Capuchino", 2.5),
    LATTE("Latte", 2.0)
}