import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {

  @Test
  public void BinaryTest() {
      int expected = 3;
      int actual = CodeChallenge.answer(110111);
      assertEquals(expected, actual);
  }
}

