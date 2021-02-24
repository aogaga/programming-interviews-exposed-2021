package treendgraph;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleIdeasTest {
  private   SampleIdeas si;
  @BeforeEach
  void setUp()
  {
   si = new SampleIdeas();
  }

  @Test
  void getFromhileLoop() {
    assertEquals(9, si.getFromhileLoop());
  }
}