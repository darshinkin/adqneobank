package com.challenge.adqneobank.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.challenge.adqneobank.persistence.dao.WeatherDao;
import com.challenge.adqneobank.persistence.repositories.WeatherRepository;
import com.challenge.adqneobank.services.WeatherService;

@Configuration
public class WeatherConfig {

    @Autowired
    private WeatherRepository weatherRepository;

    @Bean
    WeatherService weatherService() {
        return new WeatherService(weatherDao());
    }

    @Bean
    WeatherDao weatherDao() {
        return new WeatherDao(weatherRepository);
    }
}
