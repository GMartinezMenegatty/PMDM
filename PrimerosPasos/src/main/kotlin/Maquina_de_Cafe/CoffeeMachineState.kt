package org.example.Maquina_de_Cafe

sealed class CoffeeMachineState {
    class Idle(val timestamp: Long = System.currentTimeMillis()) : CoffeeMaquinaState(){
        init{
            println("Estoy en la función inicial del estado IDLE")
        }
    }
    object MakingCoffee : CoffeeMaquinaState()
    data class ServingCoffee(val type: String) : CoffeeMaquinaState()
    data class SelectCoffee(val options: List<String>) : CoffeeMaquinaState()
    data class Error(val message: String) : CoffeeMaquinaState()
}