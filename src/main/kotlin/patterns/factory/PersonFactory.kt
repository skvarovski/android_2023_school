package patterns.factory

class PersonFactory {

    fun createPerson(personType: PersonType): Factory {
        when (personType) {
            PersonType.HUMAN -> { return Human()}
            PersonType.ROBOT -> { return Robot()}

        }
    }
}