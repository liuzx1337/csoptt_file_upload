package com.csoptt.fileupload;

import com.csoptt.utils.http.ResponseMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传服务FeignClient，供其他微服务调用
 *
 * @author qishao
 * @date 2018-11-09
 */
@FeignClient(value = "csoptt-fileupload")
public interface FileUploadClient {

    /**
     * 文件上传
     *
     * @param file
     * @param fileType
     * @return 
     * @author qishao
     * date 2018-11-09
     */
    @PostMapping("/fileUpload/upload")
    ResponseMessage upload(MultipartFile file, String fileType);
}
