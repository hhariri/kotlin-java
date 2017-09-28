package com.hadihariri.demos.kotlin.clean

import kotlin.properties.*

class Veto {
    var value: String by Delegates.vetoable("String") {
        prop, old, new ->
        new.startsWith("S") }
}

fun initLate(): String {
    println("initLate run")
    return "Something"
}

fun localDelegatedProps() {
    val lazyProp by lazy { initLate() }
    println("Accessing localDelegatedProps()")
}



fun main(args: Array<String>) {

    localDelegatedProps()

    val veto = Veto()
    println(veto.value)
    veto.value = "Change"
    println(veto.value)
    veto.value = "Strange"
    println(veto.value)

}


