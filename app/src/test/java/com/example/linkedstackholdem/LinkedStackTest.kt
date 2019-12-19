package com.example.linkedstackholdem

import com.example.linkedstackholdem.stack.LinkedStack
import org.junit.Assert.*
import org.junit.Test
import java.util.NoSuchElementException

class LinkedStackTest {

  @Test
  fun `push test`() {
    val stack = LinkedStack<String>()
    val value = "1"
    stack.push(value)
    val peek = stack.peek()
    assertEquals(value, peek)
  }

  @Test
  fun `is empty test`() {
    val stack = LinkedStack<String>()
    assertTrue(stack.isEmpty())
  }

  @Test
  fun `pop test`() {
    val stack = LinkedStack<String>()
    val value = "1"
    stack.push(value)
    val pop = stack.pop()
    assertEquals(value, pop)
  }

  @Test(expected = NoSuchElementException::class)
  fun `pop empty stack test`() {
    val stack = LinkedStack<String>()
    stack.pop()
  }

  @Test
  fun `empty stack test`() {
    val stack = LinkedStack<Any>()
    assertEquals(0, stack.size)
  }

  @Test
  fun `size test`() {
    val stack = LinkedStack<String>()
    stack.push("1")
    assertEquals(1, stack.size)
    stack.push("2")
    assertEquals(2, stack.size)
    stack.pop()
    assertEquals(1, stack.size)
    stack.pop()
    assertEquals(0, stack.size)
  }

  @Test
  fun `peek from empty stack test`() {
    val stack = LinkedStack<String>()
    val peek = stack.peek()
    assertNull(peek)
  }

  @Test
  fun `clear test`() {
    val stack = LinkedStack<String>().apply {
      listOf("1", "2", "3", "4").forEach {
        push(it)
      }
    }
    assertEquals(stack.size, 4)

    stack.clear()
    assertTrue(stack.isEmpty())
  }
}