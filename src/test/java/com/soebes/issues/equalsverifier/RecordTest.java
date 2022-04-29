package com.soebes.issues.equalsverifier;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

class RecordTest {

  @Test
  void name() {
    EqualsVerifier.forClass(Record.class).usingGetClass().verify();
  }

}