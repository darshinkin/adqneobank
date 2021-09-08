package com.challenge.adqneobank.services;

import com.challenge.adqneobank.persistence.dao.WeatherDao;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WeatherService {

    private final WeatherDao weatherDao;
}
