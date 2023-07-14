package com.pilybarbosa.app2687390

class Reto2 {
}

fun main() {
    var aleatorio=(1..4).random()
    println("ingrese el valor de su compra ")
    var num : Int = readLine()!!.toInt()

    if (num<50000){
        println("su monto en menor a 50.000 por lo tanto no odtiene descuento ")
    }

    if (aleatorio==1) {
        println("utt ha odtenido un 10% de descuento en su compra ${num*10/100} ")
    } else if (aleatorio==2) {
        println(" utt ha  odtenido un 30% de descuento en su compra  ${num*30/100} ")
    } else if (aleatorio==3) {
        println("utt ha  odtenido un 50% de descuento en su compra ${num*50/100} ")
    } else if (aleatorio==4) {
        println("utt a llevado su compra gratis")
    } else {

    }


}