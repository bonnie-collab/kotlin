fun main() {
    val marks = -103

    if (marks > 0 && marks <= 30){
        println("you failed")
    }
    else if (marks > 30 && marks <= 50){
        println("average")
    }
    else if (marks > 50 && marks <= 70){
        println("above average")
    }
    else if ( marks >70 && marks <=100){
        println("you passed")
    } 
    else {
        println("invalid")
    }
}