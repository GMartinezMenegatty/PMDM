package org.example.Maquina_de_Cafe


object CoffeeMachine {
    var currentState: CoffeeMaquinaState =
        CoffeeMaquinaState.Idle

    var monedero: Double = 0.0
    var cafeSeleccionado: Cafe = Cafe.ESPRESSO

    fun gestorEstados() {
        when (currentState) {

            CoffeeMaquinaState.Idle -> {
                println("Máquina preparada.")
                currentState =
                    CoffeeMaquinaState.SelectCoffee
            }

            CoffeeMaquinaState.SelectCoffee -> {
                val cafe = cafeSeleccionado

                if (cafe.cantidad > 0 &&
                    monedero >= cafe.precio
                ) {
                    println("Café seleccionado: ${cafe.nombre}")

                    monedero -= cafe.precio
                    cafe.cantidad--

                    currentState =
                        CoffeeMaquinaState.MakingCoffee
                } else {
                    println("No hay dinero suficiente o no queda café.")
                    currentState = CoffeeMaquinaState.Error
                }
            }

            CoffeeMaquinaState.MakingCoffee -> {
                println("Preparando ${cafeSeleccionado.nombre}...")
                currentState =
                    CoffeeMaquinaState.ServingCoffee
            }

            CoffeeMaquinaState.ServingCoffee -> {
                println("Sirviendo ${cafeSeleccionado.nombre}.")
                println("Cambio: $monedero €")

                monedero = 0.0
                currentState = CoffeeMaquinaState.Idle
            }

            CoffeeMaquinaState.Error -> {
                println("No se ha podido preparar el café.")
                currentState = CoffeeMaquinaState.Idle
            }
        }
    }
}

