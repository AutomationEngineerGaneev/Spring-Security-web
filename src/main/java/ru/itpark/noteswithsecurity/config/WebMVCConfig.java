package ru.itpark.noteswithsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {

    @Override // изменяем страничку логина на свою view'шку
    public void addViewControllers(ViewControllerRegistry registry) {
        registry
                .addViewController("/login")
                .setViewName("login");

        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
