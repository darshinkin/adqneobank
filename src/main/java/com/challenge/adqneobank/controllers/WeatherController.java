package com.challenge.adqneobank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.adqneobank.services.WeatherService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    @Autowired
    private final WeatherService weatherService;
}
