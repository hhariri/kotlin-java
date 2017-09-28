package com.hadihariri.demos.kotlin.clean

class KotlinNulls {

    fun validateCustomer(customer: CustomerKotlin) {
        if (customer.name.startsWith("A")) {
            throw Exception("Names are not allowed to start with A")
        }
    }

    fun validateJavaCustomer(customer: CustomerJava?) {
        if (customer?.name?.startsWith("A") == true) {
            throw Exception("Names are not allowed to start with A")
        }
    }


}

fun main(args: Array<String>) {
    KotlinNulls().validateJavaCustomer(null)
}