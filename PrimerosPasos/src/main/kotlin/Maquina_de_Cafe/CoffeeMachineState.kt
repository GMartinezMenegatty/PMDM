package org.example.Maquina_de_Cafe

sealed class CoffeeMachineState {
    object Idle : CoffeeMachineState()
    data class MakingCoffee (val coffee: Cafe) : CoffeeMachineState()
    data class ServingCoffee(val type: String) : CoffeeMachineState()
    data class SelectCoffee(val options: List<Cafe>) : CoffeeMachineState()
    data class Error(val message: String) : CoffeeMachineState()
    }
