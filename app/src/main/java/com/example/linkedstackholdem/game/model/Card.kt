package com.example.linkedstackholdem.game.model

class Card(
    val value: String,
    val suit: Suit
) {

    val name: String
        get() = "$value${suit.shortName}"

    enum class Suit(val shortName: String) {
        SPADES("S"),
        HEARTS("H"),
        DIAMONDS("D"),
        CLUBS("C")
    }
}