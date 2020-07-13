package com.softplan.api.domain.entities;

import lombok.Data;

@Data
public class UserPermission {
    private Integer id;
    private String type;
    private User user;
}
