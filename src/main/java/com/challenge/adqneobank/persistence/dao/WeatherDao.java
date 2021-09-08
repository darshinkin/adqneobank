package com.challenge.adqneobank.persistence.dao;

import com.challenge.adqneobank.persistence.repositories.WeatherRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WeatherDao {

    private final WeatherRepository weatherRepository;
}
