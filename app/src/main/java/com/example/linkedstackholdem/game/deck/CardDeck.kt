package com.example.linkedstackholdem.game.deck

import com.example.linkedstackholdem.game.model.Card

interface CardDeck {
  fun invalidateDeck()
  fun shuffle()
  val topCard: Card
  val initialSize: Int
  val currentSize: Int
}