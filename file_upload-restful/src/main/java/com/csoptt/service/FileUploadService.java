package com.csoptt.service;

import com.csoptt.properties.FileUploadProperties;
import com.csoptt.vo.response.FilePathInfoVO;
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
     * @return 文件信息
     * @author qishao
     * date 2018-11-09
     */
    public FilePathInfoVO upload(MultipartFile file, String fileType) {
        FilePathInfoVO filePathInfoVO = new FilePathInfoVO();
        // 文件非空，则进行下面的步骤
        if (!file.isEmpty()) {

        }

        return filePathInfoVO;
    }
}
