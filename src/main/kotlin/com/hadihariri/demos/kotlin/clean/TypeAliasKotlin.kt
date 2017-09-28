package com.hadihariri.demos.kotlin.clean

typealias CustomerName = String


data class Customer(val name: CustomerName, val email: String)



fun validateName(input: String): Boolean {
    return input != ""
}


fun main(args: Array<String>) {

    val customer = Customer("Joe Smith", "joe@gmail.com")

    validateName(customer.name)


    val name : String = "Joe Smith"
    validateName(name)
}



/*
@Deprecated("Customer is now called AwesomeCustomer", replaceWith = ReplaceWith("AwesomeCustomer"))
data class AwesomeCustomer(val name: CustomerName, val email: String)

typealias Customer = AwesomeCustomer
*/
