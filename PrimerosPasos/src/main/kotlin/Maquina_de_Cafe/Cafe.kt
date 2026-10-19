package org.example.Maquina_de_Cafe

enum class Cafe(val nombre: String, val precio: Double, val cantidad: Int = 10) {
    espresso("Espresso",1.5),
    capuchino("Capuchino",2.5),
    latte("Latte",2.0)

}