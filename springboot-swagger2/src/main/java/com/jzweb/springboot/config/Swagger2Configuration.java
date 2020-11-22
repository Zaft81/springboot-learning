package com.jzweb.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Ryan
 * @version 1.0
 * @date 11/22/2020
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration
{
    public static final String SWAGGER_SCAN_BASE_PACKAGE = "com.jzweb";//API接口包扫描路径
    public static final String VERSION = "1.0";

    @Bean
    public Docket createRestApi()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any())//根据url路径设置哪些请求加入文档，哪些请求忽略
                .build();
    }

    private ApiInfo apiInfo()
    {
        return new ApiInfoBuilder()
                .title("API文档")//设置文档标题
                .description("API接口文档")//文档描述
                .version(VERSION)//文档版本
                .termsOfServiceUrl("http://www.baidu.com")//设置文档的License信息->1.3 License information
                .build();
    }
}
