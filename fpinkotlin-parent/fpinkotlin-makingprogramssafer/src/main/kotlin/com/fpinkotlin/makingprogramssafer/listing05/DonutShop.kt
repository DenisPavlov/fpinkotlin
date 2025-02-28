package com.fpinkotlin.makingprogramssafer.listing05

fun buyDonuts(quantity: Int = 1, creditCard: CreditCard): Purchase =
    Purchase(List(quantity) { Donut() }, Payment(creditCard, Donut.price * quantity))

