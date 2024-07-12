package com.PratikRestApi.demo.configuration;

import com.PratikRestApi.demo.DB;
import com.PratikRestApi.demo.ProdDB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DB getDBBean(){
        return new ProdDB();
    }
}
