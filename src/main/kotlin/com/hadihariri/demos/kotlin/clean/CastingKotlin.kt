package com.hadihariri.demos.kotlin.clean


fun createSegment(obj: Any) {
    if (obj is View) {
        obj.initialise()
    }
}

fun main(args: Array<String>) {


}