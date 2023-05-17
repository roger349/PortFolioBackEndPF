package com.rer.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortFolioBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortFolioBackEndApplication.class, args);
	}
        @EnableWebMvc
        @Configuration
        public class WebConfiguracion implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
               registry.addMapping("/**").allowedOrigins("/**")
                       .allowedMethods("*").allowedHeaders("*");
        }
}        
}
        

