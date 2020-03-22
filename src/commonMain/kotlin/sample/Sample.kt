package sample

class Sample

interface SampleInterface

class SampleClass: SampleInterface

class MyClass(val str1: String, var str2: String)

data class MyDataClass(val str1: String, var str2: String)

enum class MyEnum { CASE1, CASE2 }

enum class LogLevel {
    ERROR,
    WARNING,
    INFO,
    DEBUG
}

class Logger {
    companion object default {
        fun log(level: LogLevel = LogLevel.ERROR, message: String, completion: (Boolean) -> Unit) { }
    }
}

expect object Platform {
    fun name(): String
}

fun hello(): String = "Hello from ${Platform.name()}"