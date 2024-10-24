package com.example.Second.Week.entities;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;

@Data
public class Client {
    @JsonTypeId
    private String id;
    private String clientId;
    private String address;
}
