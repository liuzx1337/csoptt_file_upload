package com.csoptt.exception;

import com.csoptt.enums.FileUploadExceptionEnums;
import com.csoptt.utils.exception.BaseException;

/**
 * 文件上传异常类
 *
 * @author qishao
 * @date 2018-11-09
 */
public class FileUploadException extends BaseException {
    public FileUploadException() {
    }

    public FileUploadException(String message) {
        super(message);
    }

    public FileUploadException(String errCode, String message) {
        super(errCode, message);
    }

    public FileUploadException(FileUploadExceptionEnums fileUploadExceptionEnums) {
        this(fileUploadExceptionEnums.getErrCode(), fileUploadExceptionEnums.getErrMsg());
    }
}
