package com.test;

public class MyFirstFeature {

  public String getFeatureMethod(boolean isThrowException) throws Exception {

    if (isThrowException) {
      throw new Exception("this is my exception");
    }

    return "test-value";
  }

}
