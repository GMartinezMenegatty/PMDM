package org.example.example.myapp

//abstract class AquariumFish {
//    abstract val color: String
//}
interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

interface FishAction  {
    fun eat()
}

//Ejemplo 2
class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

//Ejemplo 2
class Plecostomus: FishAction, FishColor by GoldColor {
    override fun eat() {
        println("eat algae")
    }
}

sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}

//Ejemplo 1
//class Shark: AquariumFish(), FishAction {
//    override val color = "gray"
//    override fun eat() {
//        println("hunt and eat fish")
//    }
//}

//Ejemplo 1
//class Plecostomus: AquariumFish(), FishAction {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}


