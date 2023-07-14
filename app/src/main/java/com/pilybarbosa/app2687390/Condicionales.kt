package com.pilybarbosa.app2687390

class Condicionales {
}


fun main() {

    println("ingrese su primer numero ")
    var num  : Int = readLine()!!.toInt()
    println("ingrese su segundo numero ")
    var numm : Int = readLine()!!.toInt()

    if (num>numm) {
        print("su numero 2 es mayor a numero 1 ")

    } else if (num == numm){

        print(" sus numero son iguales ")
    } else {
        print(" su numero 1 es myor a 2")
    }



    println (" ingrese un  numero de 1 a 20")
    var num1 : Int = readLine()!!.toInt()


    if (num1<20) {
        print(" el numero esta en el rango")
    } else
        print(" te dije un numero del  1 al 20 ")



    var aleatorio=(0..50).random()

    when (aleatorio) {
        0-> println("sin resultados")
      in 1..10 ->  println("hay 10 condiciones")
      in  20..50 -> println("hay muchas condiciones")
    }

}