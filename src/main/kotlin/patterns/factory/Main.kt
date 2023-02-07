package patterns.factory

fun main() {

    val factory = PersonFactory()
    val human = factory.createPerson(PersonType.HUMAN)
    val robot = factory.createPerson(PersonType.ROBOT)


    println(human.sayHi())
    println(robot.sayHi())

}
