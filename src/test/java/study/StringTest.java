package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
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

  @DisplayName("charAt() 성공 테스트")
  @Test
  void charAtSuccess() {
    String testString = "abc";

    for (int i = 0; i < testString.length(); i++) {
      char actual = testString.charAt(i);
      assertThat(actual).isEqualTo((char) ('a' + i));
    }
  }

  @DisplayName("charAt() 실패 테스트")
  @Test
  void charAtFail() {
    String testString = "abc";

    assertThatThrownBy(() -> {
      testString.charAt(testString.length());
    }).isInstanceOf(StringIndexOutOfBoundsException.class)
        .hasMessageContaining("String index out of range: ");
  }
}
