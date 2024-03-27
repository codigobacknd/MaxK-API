package com.inclusioncloud.interview.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configures cross-origin resource sharing (CORS) settings for the application.
 * This configuration allows the frontend, running on a different origin,
 * to communicate with the backend API without facing CORS restrictions.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * Customizes the CORS configuration for the API.
     * @param registry the CorsRegistry to be used to configure CORS.
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*");
    }
}
