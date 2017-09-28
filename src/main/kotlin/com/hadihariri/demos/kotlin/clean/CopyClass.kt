package com.hadihariri.demos.kotlin.clean


data class Email(val name: String, val email: String)
data class Contacts(val company: String, val emails: List<Email>)

fun main(args: Array<String>) {

    val contacts = Contacts("Company1", listOf(Email("Name1", "Email1"), Email("Name2", "Email2")))

    val contactsCopy = contacts.copy()

    contactsCopy.emails.forEach {
        println(it)
    }


}