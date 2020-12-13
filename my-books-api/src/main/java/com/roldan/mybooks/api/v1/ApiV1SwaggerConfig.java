package com.roldan.mybooks.api.v1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class ApiV1SwaggerConfig {

    @Bean
    public Docket apiV1Docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.roldan.mybooks.api.v1.contollers"))
                .paths(PathSelectors.ant("/v1/*"))
                .build()
                .groupName("v1")
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "My Books Service API",
                "My Books Service API Description",
                "1.0",
                "http://roldan.com/terms",
                new Contact("Jorge", "https://roldan.com", "jorge.roldan@roldan.com"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList()
        );
    }
}
