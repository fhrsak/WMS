package hr.hrsak.wms;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class WmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmsApplication.class, args);
    }

    @Bean
    public OpenAPI openApiConfig(){
        return new OpenAPI().info(apiInfo());
    }

    private Info apiInfo(){
        Info info = new Info();
        info
                .title("WMS api")
                .description("WMS system api")
                .version("v1.0.0.");
        return info;
    }



}
