package com.challenge.adqneobank.persistence.repositories;

import org.springframework.data.repository.CrudRepository;

import com.challenge.adqneobank.persistence.domain.Weather;

public interface WeatherRepository extends CrudRepository<Weather, Long> {
}
