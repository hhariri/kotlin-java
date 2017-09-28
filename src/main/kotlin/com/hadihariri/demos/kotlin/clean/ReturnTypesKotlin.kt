package com.hadihariri.demos.kotlin.clean

sealed class Response {
    class Success(val message: String): Response()
    class Failure(val error: Int): Response()
}



fun getPage(url: String): Response {
    return when (url) {
        "" -> Response.Failure(404)
        "/" -> Response.Success("Index.html")
        else -> Response.Failure(500)
    }
}


fun main(args: Array<String>) {

    val result = getPage("Some Result")

    when (result) {
        is Response.Success -> println(result.message)
        is Response.Failure -> println(result.error)
    }


}
