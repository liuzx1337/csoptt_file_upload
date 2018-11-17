package com.csoptt.vo;

/**
 * 上传后文件的相关信息
 * 包括在服务器的绝对路径和在
 *
 * @author qishao
 * @date 2018-11-09
 */
public class FilePathInfoVO {

    /**
     * 文件的绝对路径
     */
    private String filePath;

    /**
     * 文件通过nginx的可访问路径
     */
    private String nginxPath;

    /**
     * Gets the value of filePath.
     *
     * @return the value of filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the filePath.
     * <p>
     * <p>You can use getFilePath() to get the value of filePath</p>
     *
     * @param filePath filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Gets the value of nginxPath.
     *
     * @return the value of nginxPath
     */
    public String getNginxPath() {
        return nginxPath;
    }

    /**
     * Sets the nginxPath.
     * <p>
     * <p>You can use getNginxPath() to get the value of nginxPath</p>
     *
     * @param nginxPath nginxPath
     */
    public void setNginxPath(String nginxPath) {
        this.nginxPath = nginxPath;
    }
}
