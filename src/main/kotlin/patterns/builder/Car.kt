package patterns.builder

class Car {

    override fun toString(): String {
        return "Car object test"
    }

    companion object {
        private var engineType: EngineType = EngineType.TYPE_NORMAL
        private var whellType: WhellType = WhellType.WHELL_REAR_WD
        private var fuelSize: Int = 0

        fun Build() = Car

        fun engine(engineType: EngineType): Companion {
            Companion.engineType = engineType
            return Car
        }

        fun whell(whellType: WhellType): Companion {
            Companion.whellType = whellType
            return  Car
        }

        fun fuel(fuelSize: Int) : Companion {
            Companion.fuelSize = fuelSize
            return  Car
        }

        fun build(): Companion { return Car
        }

        override fun toString(): String {

            return "Car configure: Engine: $engineType, Whell: $whellType, Fuel:$fuelSize"
        }


    }

}