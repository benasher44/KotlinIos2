package sample

class Sample

class MyClass(val str1: String, val str2: String)

enum class MyEnum { CASE1, CASE2 }

expect object Platform {
    fun name(): String
}

fun hello(): String = "Hello from ${Platform.name()}"