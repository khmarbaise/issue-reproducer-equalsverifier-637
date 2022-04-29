package com.soebes.issues.equalsverifier;

import java.util.Objects;

public class Record {

  private final int numerator;

  private final int denominator;

  public Record(int numerator, int denominator) {
    if (denominator == 0) {
      throw new IllegalArgumentException("denominator is not allowed to be zero.");
    }
    this.numerator = numerator;
    this.denominator = denominator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Record record = (Record) o;
    return numerator == record.numerator &&
        denominator == record.denominator;
  }

  @Override
  public int hashCode() {
    return Objects.hash(numerator, denominator);
  }

}
