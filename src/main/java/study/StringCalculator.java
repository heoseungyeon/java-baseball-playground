package study;

public class StringCalculator implements Calculator {

  @Override
  public float calculate(String expression) {
    String[] values = expression.split(" ");

    float result = Integer.parseInt(values[0]);
    for (int i = 1; i < values.length; i += 2) {
      if (values[i].equals("*")) {
        result *= Integer.parseInt(values[i + 1]);
      }
      if (values[i].equals("+")) {
        result += Integer.parseInt(values[i + 1]);
      }
      if (values[i].equals("-")) {
        result -= Integer.parseInt(values[i + 1]);
      }
      if (values[i].equals("/")) {
        result /= Integer.parseInt(values[i + 1]);
      }
    }

    return result;
  }
}
