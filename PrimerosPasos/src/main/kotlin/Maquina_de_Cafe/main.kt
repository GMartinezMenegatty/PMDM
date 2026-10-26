package org.example.Maquina_de_Cafe

fun main() {
    CoffeeMachine.monedero = 3.0
    CoffeeMachine.cafeSeleccionado = Cafe.LATTE


    CoffeeMachine.gestorEstados()
    println("---")
    CoffeeMachine.gestorEstados()
    println("---")
    CoffeeMachine.gestorEstados()

}