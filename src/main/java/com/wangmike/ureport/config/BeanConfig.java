package com.wangmike.ureport.config;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 *    @author  : wangchun
 *    @time    : 2020/6/24 17:06
 *    @desc    : 输入描述
 *    @version : v1.0
 * </pre>
 */
@Configuration
public class BeanConfig {

    @Bean
    public ServletRegistrationBean registrationBean(){
        return new ServletRegistrationBean(new UReportServlet(),"/ureport/*");
    }


}
