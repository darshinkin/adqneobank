package com.challenge.adqneobank.presistence;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.challenge.adqneobank.persistence.repositories.WeatherRepository;
import com.challenge.adqneobank.persistence.domain.Weather;

@SpringBootTest
public class SpringBootJPAIntegrationTest {

    @Autowired
    private WeatherRepository weatherRepository;

    @Test
    public void givenWeatherRepository_whenSaveAndRetreiveEntity_thenOK() {
        Weather weather = Weather.builder().city("Moscow").build();
        Weather weatherEntity = weatherRepository.save(weather);
        Optional<Weather> foundEntity = weatherRepository.findById(weatherEntity.getId());

        assertTrue(foundEntity.isPresent());
        assertEquals(weatherEntity.getId(), foundEntity.get().getId());
        assertEquals(weatherEntity.getCity(), foundEntity.get().getCity());
    }

}