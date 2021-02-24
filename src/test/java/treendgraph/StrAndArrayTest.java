package treendgraph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StrAndArrayTest {
private StrAndArray sta;
  @BeforeEach
  void setUp()
  {
    sta = new StrAndArray();
  }

  @Test
  void removeChars() {
    assertEquals("gg g", sta.removeChars("aogaga agi", "aeiou"));
  }
}