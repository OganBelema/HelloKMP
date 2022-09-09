package com.oganbelema.hellokmp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform.reversed()}!"
    }
}