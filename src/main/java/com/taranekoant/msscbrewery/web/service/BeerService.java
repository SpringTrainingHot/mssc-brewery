package com.taranekoant.msscbrewery.web.service;

import com.taranekoant.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID berrId);
}
