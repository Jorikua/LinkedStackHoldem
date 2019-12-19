package com.example.linkedstackholdem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val CARDS_IN_EACH_HAND = 2

class MainActivity : AppCompatActivity() {

  private val TAG = MainActivity::class.java.simpleName

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val listOfSpades = listOf("2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS", "AS")
    val listOfHearts = listOf("2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH", "AH")
    val listOfClubs = listOf("2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC", "AC")
    val listOfDiamonds = listOf("2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD", "AD")

    val stack = LinkedStack<String>().apply {
      listOf(listOfSpades, listOfHearts, listOfClubs, listOfDiamonds).flatten().forEach {
        push(it)
      }
      shuffle()
    }

    val numberOfPlayers = 6
    val loop = numberOfPlayers * CARDS_IN_EACH_HAND

    for (i in 0 until loop) {
      val card = stack.pop()
      val player = (i % numberOfPlayers) + 1
      Log.d(TAG, "Player #$player gets card $card")
    }

    Log.d(TAG, "Deck of cards size ${stack.size()}")
  }
}
