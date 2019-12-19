package com.example.linkedstackholdem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.linkedstackholdem.game.CardGame
import com.example.linkedstackholdem.game.HoldEm
import com.example.linkedstackholdem.game.deck.CardDeck
import com.example.linkedstackholdem.game.deck.HoldEmDeck

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val cardDeck: CardDeck = HoldEmDeck()
    val holdEm: CardGame = HoldEm(6, cardDeck)

    holdEm.startTheGame()
  }
}
