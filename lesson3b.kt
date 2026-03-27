fun main(args: Array<String>) {
    //  for loop
    // used to excute a code  number of time until condition is met

    for (number in 1..10){
        println("the number is: $number")
    }

    println("=========================")

    for(session in 50..60){
        println("the session is: $session")
    }

    println("================================")

    for (y in 20..40 step 2){
        println(y)
    }

    println("==================================")

    
    for (y in 20..40){
        if (y% 2 != 0)
            println(y)
    }
}



