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
    print("Last character--> $lastCharInStr and length of my string is ${myString.length}")



}


