package com.csoptt.service;

import com.csoptt.properties.FileUploadProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传
 *
 * @author qishao
 * @date 2018-11-09
 */
@Service
public class FileUploadService {

    /**
     * 文件属性
     */
    @Autowired
    private FileUploadProperties fileUploadProperties;
    
    /**
     * 文件上传
     *
     * @param file
     * @param fileType
     * @author qishao
     * date 2018-11-09
     */
    public void upload(MultipartFile file, String fileType) {
        //
    }
}
