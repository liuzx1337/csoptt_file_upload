package com.csoptt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 * 1.可作为微服务被Eureka发现
 * 2.可让其他项目使用FeignClient的方式调用
 *
 * @author qishao
 * date 2018-09-05
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
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
