package com.oganbelema.hellokmp

import daysUntilNewYear

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform.reversed()}!" +
                "\nThere are only ${daysUntilNewYear()} days left until New Year!"
    }
}