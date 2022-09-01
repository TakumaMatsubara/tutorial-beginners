fun main() {
    val list = listOf("Kotlin", "Java", "Python", "Javascript", null, null)
    val map = list.filterNotNull().associate { it to it.length }
    val language = list.filterNotNull().findLast { it.startsWith("foo") }.orEmpty()
    println(map)
    println(language)
}