package com.example.ecommerce.dto;

//Use this class to send back a Java object as JSON

import lombok.Data;
import lombok.NonNull;

@Data
public class PurchaseResponse {


    private final String orderTrackingNumber;
}
