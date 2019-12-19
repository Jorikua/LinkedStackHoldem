package com.example.linkedstackholdem.stack

import java.util.*

class LinkedStack<T: Any> : Iterable<T?> {

  var size = 0
  var first: Node<T>? = null

  /**
   * Inserts the specified element to stack.
   *
   * @param value the element to add
   */
  fun push(value: T) {
    val item = first
    val newNode = Node(
      value = value,
      prev = null,
      next = item
    )

    first?.prev = newNode

    first = newNode
    size++
  }

  /**
   * Pops an element from the stack. In other
   * words, removes and returns the element of this stack.
   * @return the element at the top of this stack
   * @throws NoSuchElementException if this stack is empty
   */
  fun pop(): T {
    val temp = first ?: throw NoSuchElementException("No such element")
    first = temp.next
    temp.prev = null
    size--
    return temp.value
  }

  /**
   * Check whether stack is empty
   * @return true if empty
   */
  fun isEmpty(): Boolean {
    return size == 0
  }

  /**
   * Retrieves, but does not remove, the item in stack.
   */
  fun peek(): T? {
    return first?.value
  }

  /**
   * Removes all of the elements from this stack.
   */
  fun clear() {
    first = null
    size = 0
  }

  /**
   * Randomly shuffles elements in this stack.
   */
  fun shuffle() {
    val list = shuffled().filterNotNull()
    clear()
    list.forEach {
      push(it)
    }
  }

  inner class Node<T>(
    var value: T,
    var prev: Node<T>? = null,
    var next: Node<T>? = null
  )

  override fun iterator(): Iterator<T?> {
    return LinkedStackIterator()
  }

  private inner class LinkedStackIterator: Iterator<T?> {

    var i = 0
    private var currentItem: Node<T>? = first

    override fun hasNext(): Boolean {
      return i < size
    }

    override fun next(): T? {
      if (!hasNext()) throw IllegalStateException("")
      val value = currentItem?.value
      currentItem = currentItem?.next
      i++
      return value
    }
  }
}