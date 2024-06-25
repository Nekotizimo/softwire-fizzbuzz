package com.example.fizzbuzz

fun addWord(words: MutableList<String>, word: String) {
    words.add(word)
}

fun setWordsToBong(words: MutableList<String>) {
    words.clear()
    words.add("Bong")
}

fun insertFezz(words: MutableList<String>) {
    var inserted = false
    for (i in words.indices) {
        if (words[i][0] == 'B') {
            words.add(i, "Fezz")
            inserted = true
            break
        }
    }
    if (!inserted) {
        words.add("Fezz")
    }
}

fun reverseWords(words: MutableList<String>) {
    words.reverse()
}

fun printNumOrWords(num: Int, words: MutableList<String>) {
    var combined = ""
    if (words.isEmpty()) {
        println(num)
    } else {
        for (word in words) {
            combined += word
        }
        println(combined)
    }
}

fun main() {
    val words = mutableListOf<String>()

    for (num in 1..100) {
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
        words.clear()

    }
}