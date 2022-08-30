fun sayHello(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach { itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") {
    println("$greeting $name")
}

fun main() {
    val person = Person()
    person.printInfo()
    person.nickName
}