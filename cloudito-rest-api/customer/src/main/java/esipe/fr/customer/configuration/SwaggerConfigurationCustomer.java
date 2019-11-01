package esipe.fr.customer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfigurationCustomer {
    @Bean
    public Docket api2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Customer")
                .select()
                .apis(RequestHandlerSelectors.basePackage("esipe.fr.customer.controllers"))
                .paths(PathSelectors.any())
                .build()
                .tags(new Tag("Customer","CRUD for customer"));
    }
}