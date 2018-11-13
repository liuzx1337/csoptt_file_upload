package com.csoptt.service;

import com.csoptt.properties.FileUploadProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * 缩略图
 *
 * @author qishao
 * @date 2018-11-13
 */
@Service
public class ThumbnailService {

    /**
     * 配置
     */
    @Autowired
    private FileUploadProperties fileUploadProperties;

    /**
     * 将图片压缩成缩略图
     *
     * @param pictureFiles
     * @author qishao
     * date 2018-11-13
     */
    public void generateThumb(File... pictureFiles) {
        //
    }
}
