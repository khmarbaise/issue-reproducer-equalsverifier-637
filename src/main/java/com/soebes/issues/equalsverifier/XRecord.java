package com.soebes.issues.equalsverifier;

public record XRecord(int numerator, int denominator) {

  public XRecord(int numerator, int denominator) {
    if (denominator == 0) {
      throw new IllegalArgumentException("denominator is not allowed to be zero.");
    }
    this.numerator = numerator;
    this.denominator = denominator;
  }

}
