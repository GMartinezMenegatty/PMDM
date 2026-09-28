package org.example.example.myapp.decor

data class Decoration (val rocks: String){
}
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations(){
//    val decoration1 = Decoration("granite")
//    println(decoration1)
//
//    val decoration2 = Decoration("slate")
//    println(decoration2)
//
//    val decoration3 = Decoration("slate")
//    println(decoration3)
//
//    println (decoration1.equals(decoration2))
//    println (decoration3.equals(decoration2))

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}
//ejercicio
//data class color (val color_entrada: String){
//}
//
//fun colores (){
//    println("Escribe red o black: ")
//    val color_entrada = readln()
//    if (color_entrada == "black"){
//        return println("Color")
//    }else if (color_entrada == "red"){
//        return println (1)
//    }
//}

data class retorno (var numero:Int, var cadena:String){
}

fun especificar (entrada:String) : retorno{
var resultado = retorno(0,"")
    if (entrada == "negro")
        resultado = retorno (0, "color")
     else
        resultado = retorno (1, "")
    return resultado
}

fun main() {
    var dato = especificar("negro")
    println(dato)
    dato = especificar("rojo")
    println(dato)
    val (numero, cadena) = dato
    println(numero)
    println(cadena)

//    makeDecorations()
//    println(Direction.EAST.name)
//    println(Direction.EAST.ordinal)
//    println(Direction.EAST.degrees)
}


