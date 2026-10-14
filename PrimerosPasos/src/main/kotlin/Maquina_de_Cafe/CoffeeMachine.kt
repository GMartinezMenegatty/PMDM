package org.example.Maquina_de_Cafe


sealed class CoffeeMaquinaState {
    data object Idle : CoffeeMaquinaState()
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

//                val idleState = currentState as CoffeeMachineState.Idle
                    println("Máquina en estado IDLE")
              if (monedero > 0){
                    print("dscds")
                  currentState = CoffeeMaquinaState.MakingCoffee
              }

                }

                is CoffeeMaquinaState.MakingCoffee -> {

                }

                is CoffeeMaquinaState.ServingCoffee -> {

                }

                is CoffeeMaquinaState.Error -> {

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
            }
        }
    }

