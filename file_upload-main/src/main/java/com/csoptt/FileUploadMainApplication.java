package com.csoptt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类
 * 可作为微服务被Eureka发现
 *
 * @author qishao
 * date 2018-09-05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FileUploadMainApplication {

	/**
	 * 启动类
	 * @param args
	 * @return
	 * @author qishao
	 * date 2018-09-05
	 */
	public static void main(String[] args) {
		SpringApplication.run(FileUploadMainApplication.class, args);
	}
}
