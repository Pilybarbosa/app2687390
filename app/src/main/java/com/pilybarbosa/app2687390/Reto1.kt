package com.pilybarbosa.app2687390

class Reto1 {
}

fun main() {
    var aleatorio=(1..6).random()
    var aleatorioo=(1..6).random()

    if (aleatorio==1 && aleatorioo==1) {

        println("ganaste con par de unos")

    } else if (aleatorio==1 && aleatorioo==2 || aleatorio==2 && aleatorioo==1) {
        println("ganaste al sacar un valor de tres ")
    } else if (aleatorio==6 && aleatorioo==6  ) {
        println(" ganaste al sacar 12 ")
    } else if (aleatorio==6 && aleatorioo==6 || aleatorio==1 && aleatorioo==1) {
        println("ganaste por que has sacado 2 o 12 ")
    } else if (aleatorio==3 && aleatorioo==3 || aleatorio==2 && aleatorioo==4 || aleatorio==1&& aleatorioo==5 || aleatorio==4 && aleatorioo==2  || aleatorio==5 && aleatorioo==1 ) {
        println("ganaste al sacar 6")
    }
}