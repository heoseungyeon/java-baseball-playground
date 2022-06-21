package study;

public enum Operator {
  ADDITION("+") {
    @Override
    public float getCalculationResult(float preOperand, float postOperand) {
      return preOperand + postOperand;
    }
  },
  SUBTRACTION("-") {
    @Override
    public float getCalculationResult(float preOperand, float postOperand) {
      return preOperand - postOperand;
    }
  },
  MULTIPLICATION("*") {
    @Override
    public float getCalculationResult(float preOperand, float postOperand) {
      return preOperand * postOperand;
    }
  },
  DIVISION("/") {
    @Override
    public float getCalculationResult(float preOperand, float postOperand) {
      return preOperand / postOperand;
    }
  };

  private final String operator;

  Operator(String operator) {
    this.operator = operator;
  }

  public String getOperator() {
    return this.operator;
  }

  public abstract float getCalculationResult(float preOperand, float postOperand);
}
