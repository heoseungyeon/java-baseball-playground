package study;

import java.util.Arrays;
import study.exception.ErrorMessage;
import study.exception.NotFoundException;

public class StringCalculator implements Calculator {

  @Override
  public float calculate(String expression) {
    String[] splitedExpressionArgs = splitExpression(expression);

    return accumulateByExpressionArgs(splitedExpressionArgs);
  }

  public float accumulateByExpressionArgs(String[] splitedExpressionArgs) {
    final int FIRST_OPERATOR_IDX = 1;
    final int OPERATOR_IDX_GAP = 2;
    float result = Float.parseFloat(splitedExpressionArgs[0]);

    for (int i = FIRST_OPERATOR_IDX; i < splitedExpressionArgs.length; i += OPERATOR_IDX_GAP) {
      String operator = splitedExpressionArgs[i];
      float preOperand = result;
      float postOperand = Float.parseFloat(splitedExpressionArgs[i + 1]);
      result = calculateByOperator(operator, preOperand, postOperand);
    }

    return result;
  }

  public float calculateByOperator(String operator, float preOperand, float postOperand) {
    return Arrays.stream(Operator.values())
        .filter(op -> operator.equals(op.getOperator()))
        .findFirst()
        .map(op -> op.getCalculationResult(preOperand, postOperand))
        .orElseThrow(() -> new NotFoundException(ErrorMessage.OPERATOR_NOT_FOUNDED, operator));
  }

  private String[] splitExpression(String expression) {
    return expression.split(" ");
  }
}
