package org.example

var estado: Int =0

fun gestorEstados (a: Boolean, b: Boolean): Int{

    if(a && estado==1)
        return 2
        if(b && estado==2)
            return 4
        else if(b == false && estado==2)
            return 3
    else return 1
}

//fun estado1 (){
//    println("Estado 1")
//}
//
//fun estado2 (){
//    println("Estado 2")
//}
//
//fun estado3 (){
//    println("Fin")
//}
//
//fun estado4 (){
//    println("Estado4")
//}

fun main (){
    gestorEstados(true, false)
}