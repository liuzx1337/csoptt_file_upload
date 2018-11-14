package com.csoptt.config;

import com.csoptt.properties.FileUploadProperties;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * 临时文件存放
 *
 * @author liuzixi
 * @date 2018-11-09
 */
@Configuration
public class TempFileConfig {

    /**
     * 文件属性
     */
    private FileUploadProperties fileUploadProperties;

    /**
     * 初始化时加载属性
     * @param fileUploadProperties
     */
    public TempFileConfig(FileUploadProperties fileUploadProperties) {
        this.fileUploadProperties = fileUploadProperties;
    }

    /**
     * 设置临时文件存放路径
     *
     * @return
     * @author liuzixi
     * date 2018-11-09
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 设置临时文件目录
        factory.setLocation(fileUploadProperties.getTempFilePath());
        return factory.createMultipartConfig();
    }
}
