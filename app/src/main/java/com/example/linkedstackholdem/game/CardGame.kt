package com.example.linkedstackholdem.game

import com.example.linkedstackholdem.game.deck.CardDeck

interface CardGame {
  val cardDeck: CardDeck
  val playersCount: Int
  val maxNumberOfPlayers: Int
  val cardsInHand: Int

  fun startTheGame()
}