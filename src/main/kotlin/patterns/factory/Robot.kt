package patterns.factory

class Robot: Factory {
    override fun sayHi(): String {
        return "Robot say 42"
    }
}