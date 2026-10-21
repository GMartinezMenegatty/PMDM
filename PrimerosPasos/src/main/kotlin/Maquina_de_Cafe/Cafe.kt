package org.example.Maquina_de_Cafe

enum class Bebidas(val nombre: String, val precio: Double, unidades: Int = 10) {
    CAPUCCINO("Capuccino", 3.5),
    LATTE("Latte", 2.0),
    AMERICANO("Americano", 1.5),
    NOBEBIDA("No bebida", 0.0);
}