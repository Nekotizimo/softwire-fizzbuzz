package com.example.fizzbuzz

fun addWord(words: MutableList<String>, word: String) {
    words.add(word)
}

fun setWordsToBong(words: MutableList<String>) {
    words.clear()
    words.add("Bong")
}

fun insertFezz(words: MutableList<String>) {
    val index = words.indexOfFirst { it.startsWith('B') }
    if (index == -1) {
        words.add("Fezz")
    } else {
        words.add(index, "Fezz")
    }
}

fun reverseWords(words: MutableList<String>) {
    words.reverse()
}

fun printNumOrWords(num: Int, words: MutableList<String>) {
    println( if(words.isEmpty()) num else words.joinToString("") )
}

fun main() {
    for (num in 1..100) {
        val words = mutableListOf<String>()

        if (num % 3 == 0) {
            addWord(words, "Fizz")
        }
        if (num % 5 == 0) {
            addWord(words, "Buzz")
        }
        // print "FizzBuzzBang" for 3*5*7 = 105?
        if (num % 7 == 0) {
            addWord(words, "Bang")
        }
        if (num % 11 == 0) {
            setWordsToBong(words)
        }
        if (num % 13 == 0) {
            insertFezz(words)
        }
        if (num % 17 == 0) {
            reverseWords(words)
        }

        printNumOrWords(num, words)

    }
}