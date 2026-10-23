package org.example.Maquina_de_Cafe


object CoffeeMachine {
    var currentState: CoffeeMachineState = CoffeeMachineState.Idle
    var monedero: Double = 0.0
    var seleccion: Cafe = Cafe.NOBEBIDA

    fun gestorEstados() {
        when(currentState) {
            is CoffeeMachineState.Idle -> {
                println("Por favor, inserta dinero en el monedero.")
                currentState = CoffeeMachineState.SelectCoffee
            }

            is CoffeeMachineState.SelectCoffee -> {
                println("Elige tu Café: 1. Espresso (1.5€) 2. Latte (2.0€) 3. Cappuccino (2.5€)")
                monedero > 0
                if (monedero == 1.5) {
                    println("Café seleccionado. Preparando Espresso.")
                    currentState = CoffeeMachineState.MakingCoffee

                } else if (monedero == 2.0) {
                    println("Café seleccionado. Preparando Latte.")
                    currentState = CoffeeMachineState.MakingCoffee

                } else if (monedero == 2.5) {
                        println("Café seleccionado. Preparando Cappuccino.")
                        currentState = CoffeeMachineState.MakingCoffee

                    } else {
                        println("No hay suficiente dinero en el monedero.")
                        currentState = CoffeeMachineState.Error
                    }
                }

                is CoffeeMachineState.ServingCoffee -> {
                    println("Sirviendo café.")
                    currentState = CoffeeMachineState.Idle
                }

                is CoffeeMachineState.Error -> {
                    println("Error en la máquina.")
                    currentState = CoffeeMachineState.Idle
                }

                is CoffeeMachineState.MakingCoffee -> {
                    println("Preparando café...")
                    currentState = CoffeeMachineState.ServingCoffee
                }

            else -> {
                println("Estado desconocido.")
                currentState = CoffeeMachineState.Idle
            }
        }
    }
}

