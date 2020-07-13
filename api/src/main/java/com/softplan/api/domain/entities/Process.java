package com.softplan.api.domain.entities;

import lombok.Data;

import java.util.List;

@Data
public class Process {
    private Integer id;
    private String description;
    private List<User> user;
}
