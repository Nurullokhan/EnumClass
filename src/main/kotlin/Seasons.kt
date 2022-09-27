enum class Seasons(val weather: String) {

    Spring("Warm") {
        override fun foo() {
            println("The weather is warm is spring!")
        }
    },
    Summer("Hot") {
        override fun foo() {
            println("It is hot in summer!")
        }
    },
    Autumn("Rainy") {
        override fun foo() {
            println("In autumn, the weather is rainy!")
        }
    },
    Winter("Cold") {
        override fun foo() {
            println("It is cold in winter!")
        }
    };

    abstract fun foo()
}