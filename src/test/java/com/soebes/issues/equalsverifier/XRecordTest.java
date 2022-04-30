package com.soebes.issues.equalsverifier;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import org.junit.jupiter.api.Test;

class XRecordTest {

  @Test
  void name() {
    EqualsVerifier.forClass(XRecord.class).usingGetClass().suppress(Warning.ZERO_FIELDS).verify();
  }
}
