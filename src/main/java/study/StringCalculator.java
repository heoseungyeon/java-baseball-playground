package study;

public class StringCalculator implements Calculator {

  @Override
  public float calculate(String expression) {
    String[] values = expression.split(" ");

    float result = Integer.parseInt(values[0]);
    for (int i = 1; i < values.length; i += 2) {
      result = calculate(values[i], result, Integer.parseInt(values[i + 1]));
    }

    return result;
  }

  public float calculate(String operator, float preOperand, float postOperand) {
    if (operator.equals("*")) {
      return preOperand * postOperand;
    }
    if (operator.equals("+")) {
      return preOperand + postOperand;
    }
    if (operator.equals("-")) {
      return preOperand - postOperand;
    }
    if (operator.equals("/")) {
      return preOperand / postOperand;
    }

    return Float.MAX_VALUE;
  }
}
