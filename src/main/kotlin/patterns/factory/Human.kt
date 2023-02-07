package patterns.factory

class Human: Factory {
    override fun sayHi(): String {
        return "Human say hello"
    }
}