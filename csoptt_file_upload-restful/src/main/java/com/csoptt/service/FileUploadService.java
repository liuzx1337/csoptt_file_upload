package com.csoptt.service;

import com.csoptt.enums.FileUploadExceptionEnums;
import com.csoptt.exception.FileUploadException;
import com.csoptt.properties.FileUploadProperties;
import com.csoptt.vo.response.FilePathInfoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件上传
 *
 * @author qishao
 * @date 2018-11-09
 */
@Service
public class FileUploadService {

    /**
     * Log4j
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(FileUploadService.class);

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
            /*
             *上传的目标文件夹
             * 从配置中可拼装成完整路径
             */
            String uploadDirPath = fileUploadProperties.getFileBasePath() + fileUploadProperties.getFileUploadZone().get(fileType);
            File uploadDir = new File(uploadDirPath);
            // 判断dir是否存在，如果存在则判断是不是文件夹
            if (!uploadDir.exists() || !uploadDir.isDirectory()) {
                uploadDir.mkdirs();
            }

            String fileName = file.getOriginalFilename();
            // 出参
            String filePath = uploadDirPath + File.separator + fileName;
            String nginxPath = fileUploadProperties.getNginxBasePath() + fileUploadProperties.getFileUploadZone().get(fileType) + File.separator + fileName;
            // 出参稍后不抛异常则会封装

            try (FileOutputStream out = new FileOutputStream(filePath)) {
                // 完成文件的写入
                out.write(file.getBytes());
                out.flush();
                out.close();
                // 封装入参
                filePathInfoVO.setFilePath(filePath);
                filePathInfoVO.setNginxPath(nginxPath);
            } catch (FileNotFoundException e) {
                LOGGER.error("找不到目标路径", e);
                throw new FileUploadException(FileUploadExceptionEnums.DIR_NOT_FOUND);
            } catch (IOException e) {
                LOGGER.error("文件上传失败", e);
                throw new FileUploadException(FileUploadExceptionEnums.FILE_UPLOAD_FAILED);
            }
        }

        return filePathInfoVO;
    }
}
