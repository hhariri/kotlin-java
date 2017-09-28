package com.hadihariri.demos.kotlin.clean


fun usingListener() {
    val view = View()
    view.setOnClickListener { println("I'm just writing a single line") }
}