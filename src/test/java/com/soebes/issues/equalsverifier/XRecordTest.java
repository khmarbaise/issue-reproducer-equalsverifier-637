package com.soebes.issues.equalsverifier;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

class XRecordTest {

  @Test
  void name() {
    EqualsVerifier.forClass(XRecord.class).usingGetClass().verify();
  }
}