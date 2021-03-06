package cn.itsource.fastgo.utils;

/**
 * @author AFSZSTHL
 * @version 1.0
 * @className AjaxResult
 * @description 封装Ajax返回值
 * @date 2019/5/11  21:18
 */
public class AjaxResult {

    private boolean success = true;
    private String message;//提示信息
    private String errorCode;//错误码
    private Object data;//AjaxResult中封装数据

    public boolean isSuccess() {
        return success;
    }

    /**
     * 成功
     * @return
     */
    public static AjaxResult me(){
        return new AjaxResult();
    }

    /**
     * 设置值后把当前对象作为方法的返回值
     * @param success
     * @return
     */
    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public AjaxResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Object getData() {
        return data;
    }

    public AjaxResult setData(Object data) {
        this.data = data;
        return this;
    }
}
