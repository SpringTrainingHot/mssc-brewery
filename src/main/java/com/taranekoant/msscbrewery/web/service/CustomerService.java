package com.taranekoant.msscbrewery.web.service;

import com.taranekoant.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);
}
