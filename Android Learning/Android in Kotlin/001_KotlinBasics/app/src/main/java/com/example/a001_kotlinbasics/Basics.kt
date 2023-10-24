package com.example.a001_kotlinbasics

fun main(){
    /*
    //var myName = "Mamata" --> can be overwrite
    val myName = "ValName" //--> CAN'T be overwrite
    print("Hello "+myName)
     */

    // type int
    var myAge = 24

    val myByte: Byte = 123 // 8 bit
    val myShort: Short = 12344 // 16 bit
    val myInt: Int = 1234567890 // 32 bit
    val myLong: Long = 1234567890123456789 // 64 bit

    // Floating point numbers
    val myFloat: Float = 13.3F // 32 bit
    val myDouble: Double = 3.141592653589793238 // 64 bit


    // Booleans
    var isSunny = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myString = "ABCDEF GH" // multiple chars
    var firstCharInStr = myString[0]
    var lastCharInStr = myString[myString.length - 1]

    println("First character--> "+ firstCharInStr)
    println("Last character--> $lastCharInStr and length of my string is ${myString.length}")


    // ************ WHEN EXPRESSION ****************
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autum")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        !in 1..12 -> println("Month should be between 1 to 12")
        else -> println("Invalid Season")
    }


    var x: Any = 13.37
    when(x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }


    // ***************** FOOR LOOP ********************
    // --> break and continue is same
    for (i in 1 until 20){
        print("$i ")
    }

}


