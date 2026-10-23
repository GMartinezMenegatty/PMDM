package org.example.Maquina_de_Cafe

import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @BeforeTest
    fun resetMachineBeforeTest() {
        resetMachine()
    }

    @AfterTest
    fun resetMachineAfterTest() {
        resetMachine()
    }

    @Test
    fun followsTheScenarioFromMain() {
        CoffeeMachine.monedero = 1.0

        assertEquals(
            CoffeeMachineState.MakingCoffee(Cafe.NOBEBIDA),
            CoffeeMachine.gestorEstados()
        )

        CoffeeMachine.seleccion = Cafe.ESPRESSO

        assertEquals(
            CoffeeMachineState.ServingCoffee(Cafe.ESPRESSO),
            CoffeeMachine.gestorEstados()
        )
        assertEquals(CoffeeMachineState.Idle, CoffeeMachine.gestorEstados())
    }

    @Test
    fun staysIdleWhenWalletIsZero() {
        CoffeeMachine.monedero = 0

        assertEquals(CoffeeMachineState.Idle, CoffeeMachine.gestorEstados())
    }

    private fun resetMachine() {
        CoffeeMachine.monedero = 0
        CoffeeMachine.seleccion = Cafe.NOBEBIDA
        CoffeeMachine.currentState = CoffeeMachineState.Idle
    }
}