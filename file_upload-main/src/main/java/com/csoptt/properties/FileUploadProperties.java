package com.csoptt.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 文件传输 - 配置
 *
 * @author liuzixi
 * @date 2018-11-09
 */
@Component
@ConfigurationProperties(prefix = "file.upload")
public class FileUploadProperties {

    /**
     * 临时文件存放目录
     */
    private String tempFilePath;

    /**
     * Gets the value of tempFilePath.
     *
     * @return the value of tempFilePath
     */
    public String getTempFilePath() {
        return tempFilePath;
    }

    /**
     * Sets the tempFilePath.
     * <p>
     * <p>You can use getTempFilePath() to get the value of tempFilePath</p>
     *
     * @param tempFilePath tempFilePath
     */
    public void setTempFilePath(String tempFilePath) {
        this.tempFilePath = tempFilePath;
    }
}
