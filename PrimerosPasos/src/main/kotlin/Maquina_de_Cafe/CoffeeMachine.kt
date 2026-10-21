package org.example.Maquina_de_Cafe
import org.example.Maquina_de_Cafe.CoffeeMachineState.*

object CoffeeMachine {

    public var monedero: Int = 0
    public var seleccion: Bebidas = Bebidas.NOBEBIDA
    public var currentState: CoffeeMachineState = CoffeeMachineState.Idle

    fun gestorEstados(): CoffeeMachineState {
        println("Estado actual: ${currentState.toString()}")

        when (currentState) {
            is CoffeeMachineState.Idle -> {
                (currentState as Idle).onEnter()
            }
            is CoffeeMachineState.MakingCoffee -> {
                (currentState as MakingCoffee).onEnter()

                currentState = ServingCoffee(type = seleccion)
            }
            is CoffeeMachineState.ServingCoffee -> {
                (currentState as ServingCoffee).onEnter()

                currentState = Idle
            }
            is CoffeeMachineState.Error -> {
                println("La máquina tiene un error: ${(currentState as CoffeeMachineState.Error).message}")
            }
        }
        return currentState
    }

    fun clean() {
        println("Limpiando la máquina...")
        currentState = CoffeeMachineState.Idle
        println("Máquina limpia. Estado: $currentState")
    }
}
