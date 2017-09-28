package com.hadihariri.demos.kotlin.clean


fun main(args: Array<String>) {

    val param = if (args.isEmpty()) "100" else args[0]

    val value = if (param.equals("100")) {
        1
    } else if (param.equals("300")) {
        2
    } else {
        println("Something")
        70
    }

    val anotherValue : Number = 10

    val actual = when (anotherValue) {
        1 -> {
            println("It was one")
            20
        }
        2 -> {
            println("it was two")
            30
        }
        3, 4, 5 -> {
            println("One of these")
            30
        }
        is Int -> {
            println("It's an Int")
            20
        }
        in 0..100 -> {
            println("Other")
            40
        }
        else -> {
            0
        }
    }


}

