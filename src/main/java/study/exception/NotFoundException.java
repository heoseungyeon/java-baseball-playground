package study.exception;

import java.text.MessageFormat;

public class NotFoundException extends RuntimeException {

  public NotFoundException(ErrorMessage errorMessage, String arg) {
    super(MessageFormat.format(errorMessage.getErrorMessage(), arg));
  }
}
