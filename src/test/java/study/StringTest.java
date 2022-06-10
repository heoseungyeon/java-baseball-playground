package study;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringTest {

  @Test
  void replace() {
    String actual = "abc".replace("b", "d");
    assertThat(actual).isEqualTo("adc");
  }

  @Test
  void splitMoreThanTwoString() {
    String[] actual = "1,2".split(",");
    assertThat(actual).containsExactly("1", "2");
  }

  @Test
  void splitOnlyOneString() {
    String[] actual = "1".split(",");
    assertThat(actual).containsOnly("1");
  }

  @Test
  void subString() {
    String actual = "(1,2)".substring(1, 4);
    assertThat(actual).isEqualTo("1,2");
  }

}
