class Person (val firstName: String = "Takuma", val lastName: String = "Matsubara") {

    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }

    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName $lastName ($nickNameToPrint)")
    }
}
