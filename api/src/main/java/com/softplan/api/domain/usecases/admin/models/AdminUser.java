package com.softplan.api.domain.usecases.admin.models;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class AdminUser implements IAdminUser {
    private Integer id;
    private String email;
    private String password;
    private List<? extends Permission> permissions;

    @Data
    @Service
    public static class Permission implements IAdminUser.IPermission {
        private Integer id;
        private String type;
    }
}
