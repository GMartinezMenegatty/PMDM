package org.example.Maquina_de_Cafe

import kotlin.test.*

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
            CoffeeMaquinaState.MakingCoffee(Cafe.NOBEBIDA),
            CoffeeMachine.gestorEstados()
        )

        CoffeeMachine.seleccion = Cafe.ESPRESSO

        assertEquals(
            CoffeeMaquinaState.ServingCoffee(Cafe.ESPRESSO),
            CoffeeMachine.gestorEstados()
        )
        assertEquals(CoffeeMaquinaState.Idle,
            CoffeeMachine.gestorEstados())
    }

    @Test
    fun staysIdleWhenWalletIsZero() {
        CoffeeMachine.monedero = 0.0

        assertEquals(CoffeeMaquinaState.Idle,
            CoffeeMachine.gestorEstados())
    }

    private fun resetMachine() {
        CoffeeMachine.monedero = 0.0
        CoffeeMachine.currentState = CoffeeMaquinaState.Idle
    }
}