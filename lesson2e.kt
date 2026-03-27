// when statement
//  checkswhen Statement The when statement in Kotlin is like a switch case in other languages. It checks a value against multiple conditions and executes the matching block.

fun main() {
    val marks = 7

    when (marks){
        in 1..30 -> println("you failed")
        in 21..50 -> println("you have average")
        in 51..70 -> println("you above average")
        in 70..100 -> println("you passed")
        else -> println("invalid score...!")


    }
}