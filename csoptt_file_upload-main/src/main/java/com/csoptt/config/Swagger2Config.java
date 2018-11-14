package com.csoptt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger、SwaggerUI相关配置
 *
 * @author qishao
 * @date 2018-09-05
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    /**
     * 给此服务的所有rest接口创建swagger-ui的api
     * @return
     * @author qishao
     * date 2018-09-05
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.csoptt"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建Swagger页面上的消息
     * @return
     * @author qishao
     * date 2018-09-05
     */
    private ApiInfo createApiInfo() {
        return new ApiInfoBuilder().title("CSOL专业评测团 - 文件服务 - RESTful APIs")
                .contact(new Contact("CSO Pro Evaluation Team", null, "Liuzx1337@163.com"))
                .version("1.0.0").build();
    }
}
