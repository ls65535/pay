package com.ls.pay.helper.req;


import com.ls.pay.helper.exceptions.ServiceException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("封装返回对象")
@Data
public class JsonResult<T> {

    private final static String CODE_OK = "200";
    private final static String MEG_OK = "ok";
    private final static String CODE_ERROR = "500";
    private final static String MEG_ERROR = "error";
    @ApiModelProperty(value = "返回码，200为成功，其他为失败", required = true)
    private String code;
    @ApiModelProperty(value = "返回码描述", required = true)
    private String msg;
    @ApiModelProperty(value = "详细数据", required = false)
    private T data;

    public JsonResult() {
        this.code = CODE_OK;
        this.msg = MEG_OK;
    }

    /**
     * 返回成功
     */
    public static <T> JsonResult<T> ok(T data) {
        JsonResult<T> result = new JsonResult<>();
        result.setData(data);
        return result;
    }


    /**
     * 异常处理返回使用
     */
    public static <T> JsonResult<T> error(ServiceException e, T data) {

        return error(e.getErrorCode(), e.getErrorMsg(), data);
    }

    public static <T> JsonResult<T> error(String code, String message, T data) {
        JsonResult<T> result = new JsonResult<>();
        result.setData(data);
        result.setCode(code);
        result.setMsg(message);
        return result;
    }

}
