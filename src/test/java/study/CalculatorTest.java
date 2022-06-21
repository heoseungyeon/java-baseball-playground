package study;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.exception.NotFoundException;

public class CalculatorTest {

  private Calculator calculator = new StringCalculator();

  @DisplayName("계산기 정상 계산 테스트")
  @Test
  void calculateSuccess() {
    float actualResult = calculator.calculate("2 + 3 * 4 / 2");
    assertThat(actualResult).isEqualTo(10);
  }

  @DisplayName("계산기 연산자 예외 테스트")
  @Test
  void calculateFail() {
    String testExpression = "2 & 4 * 4 / 2";
    assertThatThrownBy(() -> {
      calculator.calculate(testExpression);
    }).isInstanceOf(NotFoundException.class)
        .hasMessage("찾을 수 없는 연산자 & 입니다");
  }
}
