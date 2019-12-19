package com.example.linkedstackholdem.game.deck

import com.example.linkedstackholdem.LinkedStack
import com.example.linkedstackholdem.game.model.Card

class HoldEmDeck: CardDeck {

  private val stack = LinkedStack<Card>()
  private val valuesList =
    listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A")

  override fun refresh() {
    stack.clear()

    Card.Suit.values().forEach { suit ->
      valuesList.forEach { value ->
        stack.push(Card(value, suit))
      }
    }
  }

  override fun shuffle() {
    stack.shuffle()
  }

  override val topCard: Card
    get() = stack.pop()

  override val initialSize: Int
    get() = Card.Suit.values().size * valuesList.size

  override val currentSize: Int
    get() = stack.size()
}