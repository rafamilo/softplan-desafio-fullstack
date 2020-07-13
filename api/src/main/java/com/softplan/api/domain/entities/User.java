package com.softplan.api.domain.entities;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;
    private String email;
    private String password;
    private List<UserPermission> userPermissions;
    private List<Process> processes;
}
