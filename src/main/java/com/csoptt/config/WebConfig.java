package com.csoptt.config;

import com.csoptt.filter.CorsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * web相关配置
 *
 * @author qishao
 * @date 2018-09-05
 */
@Configuration
public class WebConfig {

    /**
     * 跨域
     * @return
     * @author qishao
     * date 2018-09-05
     */
    @Bean
    public FilterRegistrationBean corsFilter() {
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CorsFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("corsFilter");
        registrationBean.setOrder(8);
        return registrationBean;
    }
}
