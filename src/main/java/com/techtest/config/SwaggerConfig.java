package com.techtest.config;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket apiDocket() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(getApiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.techtest.controller"))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo getApiInfo() {
    return new ApiInfoBuilder()
        .title("Servicio de Usuarios API")
        .description("Esta API gestiona la creación, actualización y eliminación de usuarios.")
        .version("1.0.0")
        .contact(new Contact("Nombre del Desarrollador", "URL del Desarrollador", "email@delDesarrollador.com"))
        .license("Licencia de API")
        .licenseUrl("URL de la Licencia")
        .termsOfServiceUrl("Términos del Servicio")
        .build();
  }
}


