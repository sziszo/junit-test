package com.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFirstFeatureTest {

  MyFirstFeature myFirstClass;

  @BeforeEach
  public void setup() {
    System.out.println("we are in setup");
    myFirstClass = new MyFirstFeature();
  }

  @AfterEach
  public void tearDown() {
    System.out.println("we are in teardown");
    myFirstClass = null;
  }

  @Test
  public void test_getSomething() throws Exception {

    //given
    final String expectedValue = "test-value";

    //when
    String result = myFirstClass.getFeatureMethod(false);

    //then
    Assertions.assertEquals(expectedValue, result, "getSomething method should return " + expectedValue);

  }

  @Test
  public void shouldGetSomehtingUnexpected() throws Exception {

    //given
    final String expectedValue = "test-unexpected-value";

    //when
    String result = myFirstClass.getFeatureMethod(false);

    //then
    Assertions.assertEquals(expectedValue, result, "getSomething method should get some unexpected ");

  }

  @Test
  public void shouldGetException() throws Exception {

    //given
    final String expectedMessage = "this is my exception";

    //when
    Exception exception = assertThrows(Exception.class, () -> {
      myFirstClass.getFeatureMethod(true);
    });

    //then

    Assertions.assertEquals(expectedMessage, exception.getMessage(), "somehting is happened, getSomething should have thrown an exception ");

  }


}