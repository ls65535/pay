package com.ls.pay.config;

import io.swagger.annotations.ApiOperation;
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
 * @author ls
 * @date 2020/5/2 16:00
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .enable(true)
            .apiInfo(apiInfo())
            .select() //返回ApiSelectorBuilder
            .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
            //只给product路径产生API文档
            .paths(PathSelectors.any())
            .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            // 文档标题
            .title("swagger")
            // 文档描述
            .description("user接口文档")
            .termsOfServiceUrl("http://localhost:9091")
            .version("v1.0")
            .build();
    }


}
