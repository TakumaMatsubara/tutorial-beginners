//fun sayHello(greeting:String, vararg itemsToGreet:String) {
//    itemsToGreet.forEach { itemsToGreet ->
//        println("$greeting $itemsToGreet")
//    }
//}


fun sayHello(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach { itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") {
    println("$greeting $name")
}

fun main() {
    val interestingThings = arrayOf("Kotlin", "comic books", "programming")
    val person = Person()
    sayHello(greeting = "Hey", *interestingThings)
    greetPerson(greeting = "Oh", name = "Bob")
    person.printInfo()
    person.nickName = "Taku"
    person.printInfo()
}