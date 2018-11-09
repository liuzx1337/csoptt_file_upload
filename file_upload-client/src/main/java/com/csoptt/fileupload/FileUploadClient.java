package com.csoptt.fileupload;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 文件上传服务FeignClient，供其他微服务调用
 *
 * @author liuzixi
 * @date 2018-11-09
 */
@FeignClient(value = "csoptt-fileupload")
public interface FileUploadClient {
}
