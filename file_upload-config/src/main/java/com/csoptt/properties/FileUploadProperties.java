package com.csoptt.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

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
     * 上传文件根目录
     */
    private String fileBasePath = "/home/";

    /**
     * Nginx根目录
     */
    private String nginxBasePath = "http://127.0.0.1:8080/";

    /**
     * 上传文件种类与目录的映射关系
     * 可自定义
     */
    private Map<String, String> fileUploadZone = new HashMap<>();

    /**
     * 生成一些默认属性用
     */
    public FileUploadProperties() {
        fileUploadZone.put("default", "default");
    }

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

    /**
     * Gets the value of fileBasePath.
     *
     * @return the value of fileBasePath
     */
    public String getFileBasePath() {
        return fileBasePath;
    }

    /**
     * Sets the fileBasePath.
     * <p>
     * <p>You can use getFileBasePath() to get the value of fileBasePath</p>
     *
     * @param fileBasePath fileBasePath
     */
    public void setFileBasePath(String fileBasePath) {
        this.fileBasePath = fileBasePath;
    }

    /**
     * Gets the value of nginxBasePath.
     *
     * @return the value of nginxBasePath
     */
    public String getNginxBasePath() {
        return nginxBasePath;
    }

    /**
     * Sets the nginxBasePath.
     * <p>
     * <p>You can use getNginxBasePath() to get the value of nginxBasePath</p>
     *
     * @param nginxBasePath nginxBasePath
     */
    public void setNginxBasePath(String nginxBasePath) {
        this.nginxBasePath = nginxBasePath;
    }

    /**
     * Gets the value of fileUploadZone.
     *
     * @return the value of fileUploadZone
     */
    public Map<String, String> getFileUploadZone() {
        return fileUploadZone;
    }

    /**
     * Sets the fileUploadZone
     * <p>You can use getFileUploadZone() to get the value of fileUploadZone</p>
     *
     * @param fileUploadZone fileUploadZone
     */
    public void setFileUploadZone(Map<String, String> fileUploadZone) {
        this.fileUploadZone = fileUploadZone;
    }
}
