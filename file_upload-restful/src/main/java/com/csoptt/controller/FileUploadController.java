package com.csoptt.controller;

import com.csoptt.service.FileUploadService;
import com.csoptt.utils.base.controller.BaseController;
import com.csoptt.utils.http.ResponseMessage;
import com.csoptt.utils.http.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传服务restful接口
 *
 * @author qishao
 * @date 2018-11-09
 */
@RestController
@RequestMapping("/fileUpload")
@Api(description = "文件上传")
public class FileUploadController extends BaseController {

    /**
     * 业务逻辑层
     */
    @Autowired
    private FileUploadService fileUploadService;
    
    /**
     * 文件上传
     *
     * @param file
     * @param fileType
     * @return 
     * @author qishao
     * date 2018-11-09
     */
    @PostMapping("/upload")
    @ApiOperation(value = "文件上传")
    public ResponseMessage upload(MultipartFile file, String fileType) {
        
        return Result.success();
    }
}
