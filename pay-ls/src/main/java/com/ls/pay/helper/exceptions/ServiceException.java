package com.ls.pay.helper.exceptions;

/**
 * 封装异常处理
 */
public class ServiceException extends RuntimeException {

  private String errorCode;
  private String errorMsg;

  public ServiceException(String errorCode, String errorMsg) {
    super(errorCode + "-" + errorMsg);
    this.errorCode = errorCode;
    this.errorMsg = errorMsg;
  }


  public ServiceException(String errorCode, String message, Throwable cause) {
    super(errorCode + "-" + message, cause);
    this.errorCode = errorCode;
    this.errorMsg = message;
  }

  public ServiceException(String message, Throwable cause) {
    super(message, cause);
  }

  public ServiceException(Throwable cause) {
    super(cause);
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }
}
