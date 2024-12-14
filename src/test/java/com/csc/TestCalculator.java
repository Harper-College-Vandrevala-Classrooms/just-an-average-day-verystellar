package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void itWorks() {
    int[] nums = {24,72,83,19,9};
    int[] num = {1};
    assertEquals(calculator.maximumUsingForLoop(nums), 83);
    assertEquals(calculator.maximumUsingStream(nums), 83);
    assertEquals(calculator.minimumUsingForLoop(nums), 9);
    assertEquals(calculator.minimumUsingStream(nums), 9);
    assertEquals(calculator.averageUsingForLoop(nums), 41.4);
    assertEquals(calculator.averageUsingStream(nums), 41.4);
    assertEquals(calculator.sumUsingForLoop(nums), 207);
    assertEquals(calculator.sumUsingStream(nums), 207);
    assertEquals(calculator.maximumUsingStream(num), 1);
    assertEquals(calculator.maximumUsingForLoop(num), 1);
    assertEquals(calculator.minimumUsingStream(num), 1);
    assertEquals(calculator.minimumUsingForLoop(num), 1);
    assertEquals(calculator.averageUsingForLoop(num), 1);
    assertEquals(calculator.averageUsingStream(num), 1);
    assertEquals(calculator.sumUsingStream(num), 1);
    assertEquals(calculator.sumUsingForLoop(num), 1);

  }
}
