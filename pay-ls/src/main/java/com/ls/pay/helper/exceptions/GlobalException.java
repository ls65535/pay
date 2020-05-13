package com.ls.pay.helper.exceptions;



import com.ls.pay.helper.req.JsonResult;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 配置全局异常处理
 */
@ControllerAdvice
public class GlobalException {

    private static final Logger logger = LoggerFactory.getLogger(GlobalException.class);

    @ExceptionHandler(value = ServiceException.class)
    @ResponseBody
    public JsonResult serviceExceptionHandler(ServiceException e) {
        String message = e.getMessage();
        if (StringUtils.isBlank(message)) {
            message = e.getClass().getName();
            logger.error("handleException {}", message, e);
        }
        JsonResult result;
        if (e instanceof ServiceException) {
            result = JsonResult.error(e, e.getMessage());
        } else {
            result = JsonResult.error(e.getErrorCode(), e.getErrorMsg(), "unknown error");
            logger.error("error reason is: {}", e.getMessage());
        }
        return result;
    }


}
