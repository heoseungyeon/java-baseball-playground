package study.exception;

public enum ErrorMessage {
  OPERATOR_NOT_FOUNDED("찾을 수 없는 연산자 {0} 입니다");

  private final String errorMessage;

  ErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getErrorMessage() {
    return this.errorMessage;
  }
}
