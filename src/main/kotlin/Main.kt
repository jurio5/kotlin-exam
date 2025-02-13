package com.ll

class Person(val name: String, val age: Int) {
    fun greet() {
        println("Hello, my name is $name,\nMy Age is $age")
    }
}

fun main() {
    val person = Person("Alice", 22)
    person.greet()
}