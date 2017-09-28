package com.hadihariri.demos.kotlin.clean


fun higherOrder(f: (Int, Int) -> Int): Int {
    return f(1, 2)
}

fun higherOrderNoParams(f: () -> Unit) {
    f()
}

fun main(args: Array<String>) {

    val result = higherOrder( { x, y -> x + y })
    println(result)
    higherOrderNoParams { println("Nothing") }

}