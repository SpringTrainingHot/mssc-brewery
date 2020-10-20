package com.taranekoant.msscbrewery.web.service;

import com.taranekoant.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID berrId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID berrId, BeerDto beerDto);
}
