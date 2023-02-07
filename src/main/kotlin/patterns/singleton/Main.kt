package patterns.singleton

fun main() {


    val singleton = Singleton
    singleton.getInstance()

    val singleton2 = Singleton
    singleton2.getInstance()


    println("See my hashcode...")
    println(singleton)
    println(singleton)
    println(singleton2)
    println(singleton2)

}