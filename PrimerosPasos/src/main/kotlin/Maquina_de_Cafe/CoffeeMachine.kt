package org.example.Maquina_de_Cafe


sealed class CoffeeMaquinaState {
    data object Idle : CoffeeMaquinaState()
    data object SelectCoffee : CoffeeMaquinaState()
    data object MakingCoffee : CoffeeMaquinaState()
    data object ServingCoffee: CoffeeMaquinaState()
    data object Error : CoffeeMaquinaState()
}

    object CoffeeMachine {
        var currentState: CoffeeMaquinaState = CoffeeMaquinaState.Idle
        var monedero: Double = 0.0

        fun gestorEstados() {
            when (currentState) {
                CoffeeMaquinaState.Idle -> {
                    println("Máquina en estado IDLE")
                    if (monedero > 0){
                        currentState = CoffeeMaquinaState.SelectCoffee
                    } else {
                        println("Por favor, inserta dinero en el monedero.")
                    }
                }

                is CoffeeMaquinaState.SelectCoffee -> {
                    println("Elige tu Café: 1. Espresso (1.5€) 2. Latte (2.0€) 3. Cappuccino (2.5€)")
                    if (monedero == 1.5) {
                        println("Café seleccionado. Preparando Espresso.")
                        currentState = CoffeeMaquinaState.MakingCoffee
                    } else if (monedero == 2.0) {
                        println("Café seleccionado. Preparando Latte.")
                        currentState = CoffeeMaquinaState.MakingCoffee
                    } else if (monedero == 2.5) {
                        println("Café seleccionado. Preparando Cappuccino.")
                        currentState = CoffeeMaquinaState.MakingCoffee
                    } else {
                        println("No hay suficiente dinero en el monedero.")
                        currentState = CoffeeMaquinaState.Error
                    }
                }

                is CoffeeMaquinaState.ServingCoffee -> {
                    println("Sirviendo café.")
                }

                is CoffeeMaquinaState.Error -> {
                    println("Error en la máquina.")
                }

                is CoffeeMachineState.Error -> {
                    TODO()
                }
                is CoffeeMachineState.Idle -> {
                    TODO()
                }
                CoffeeMachineState.MakingCoffee -> {
                    TODO()
                }
                is CoffeeMachineState.ServingCoffee -> {
                    TODO()
                }

                CoffeeMaquinaState.SelectCoffee -> TODO()
                CoffeeMaquinaState.MakingCoffee -> TODO()
            }
        }
    }

