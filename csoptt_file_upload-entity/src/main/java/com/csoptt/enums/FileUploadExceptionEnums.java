package com.csoptt.enums;

/**
 * 一些固定的信息枚举
 *
 * @author qishao
 * @date 2018-11-10
 */
public enum FileUploadExceptionEnums {

    /**
     * 找不到文件
     */
    FILE_NOT_FOUND("-3001", "找不到文件"),
    /**
     * 上传时写入出错
     */
    FILE_UPLOAD_FAILED("-3002", "文件写入异常"),
    /**
     * 找不到路径
     */
    DIR_NOT_FOUND("-3003", "找不到路径");

    /**
     * 错误代码
     */
    private String errCode;

    /**
     * 错误信息
     */
    private String errMsg;

    FileUploadExceptionEnums(String errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    /**
     * Gets the value of errCode.
     *
     * @return the value of errCode
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * Gets the value of errMsg.
     *
     * @return the value of errMsg
     */
    public String getErrMsg() {
        return errMsg;
    }
}
