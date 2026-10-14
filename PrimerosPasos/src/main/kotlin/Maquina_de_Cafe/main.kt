package org.example.Maquina_de_Cafe

fun main() {
    println("--- Encendiendo la máquina ---")
    CoffeeMachine.gestorEstados()

    println("\n--- Intentando hacer café de nuevo ---")
    CoffeeMachine.gestorEstados()

    println("\n--- Y ahora, otro café ---")
    CoffeeMachine.gestorEstados()
}