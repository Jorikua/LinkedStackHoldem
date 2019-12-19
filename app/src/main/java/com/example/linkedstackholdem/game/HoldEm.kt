package com.example.linkedstackholdem.game

import android.util.Log
import com.example.linkedstackholdem.game.deck.CardDeck
import java.lang.IllegalStateException

class HoldEm(
  override val playersCount: Int,
  override val cardDeck: CardDeck
) : CardGame {

  private val TAG = HoldEm::class.java.simpleName

  override val maxNumberOfPlayers: Int
    get() = 9

  override val cardsInHand: Int
    get() = 2

  init {
    if (playersCount > maxNumberOfPlayers) throw IllegalStateException("Number of players should be less than maxNumberOfPlayers: $maxNumberOfPlayers")
  }

  override fun startTheGame() {
    cardDeck.refresh()

    val loop = cardsInHand * playersCount

    for (i in 0 until loop) {
      val card = cardDeck.topCard
      val player = (i % playersCount) + 1
      Log.d(TAG, "Player #$player gets card ${card.name}")
    }

    Log.d(TAG, "Deck of cards size ${cardDeck.currentSize}")
  }
}