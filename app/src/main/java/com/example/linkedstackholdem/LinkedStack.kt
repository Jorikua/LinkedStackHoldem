package com.example.linkedstackholdem

import java.util.*

/**
 * A Stack implementation with a LinkedList inside.
 */
class LinkedStack<T: Any> {
  private val list = LinkedList<T>()

  /**
   * Performs the given [action] on each element.
   */
  fun forEach(action: (T) -> Unit) {
    list.forEach(action)
  }

  /**
   * Inserts the specified element to stack.
   *
   * @param value the element to add
   */
  fun push(value: T) {
    list.addFirst(value)
  }

  /**
   * Check whether stack is empty
   * @return true if empty
   */
  fun isEmpty(): Boolean {
    return list.isEmpty()
  }

  /**
   * Retrieves, but does not remove, the item in stack.
   */
  fun peek(): T? {
    return list.peek()
  }

  /**
   * Pops an element from the stack represented by this stack. In other
   * words, removes and returns the element of this stack.
   * @return the element at the top of this stack
   * @throws NoSuchElementException if this stack is empty
   */
  fun pop(): T {
    return list.pop()
  }

  /**
   * Removes all of the elements from this stack.
   */
  fun clear() {
    list.clear()
  }

  /**
   * Randomly shuffles elements in this stack.
   */
  fun shuffle() {
    list.shuffle()
  }

  /**
   * Returns the number of elements in this stack.
   *
   * @return the number of elements in this stack
   */
  fun size(): Int {
    return list.size
  }
}