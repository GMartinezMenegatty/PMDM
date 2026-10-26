package org.example.Maquina_de_Cafe

sealed class CoffeeMaquinaState {
    data object Idle : CoffeeMaquinaState()
    data object SelectCoffee : CoffeeMaquinaState()
    data object MakingCoffee : CoffeeMaquinaState()
    data object ServingCoffee : CoffeeMaquinaState()
    data object Error : CoffeeMaquinaState()
}