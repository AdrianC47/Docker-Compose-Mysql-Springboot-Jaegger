package ec.edu.ups.ServiceForDocker;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SwaggerConfig {


    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("API Documentation")
                        .version("1.0")
                        .description("API documentacion para la App de Clientes en Sistemas Distribuidos")
                        .contact(new Contact()
                                .name("Adrian Cabrera")
                                .email("lcabrerab@est.ups.edu.ec")));
    }



}
