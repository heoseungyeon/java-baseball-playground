package study;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private Calculator calculator = new StringCalculator();

  @DisplayName("계산기 정상 계산 테스트")
  @Test
  void calculateSuccess() {
    float actualResult = calculator.calculate("2 + 3 * 4 / 2");
    assertThat(actualResult).isEqualTo(10);
  }

}
