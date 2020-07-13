package com.softplan.api.domain.usecases.triator;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class TriatorProcess implements ITriatorProcess {
    private Integer id;
    private String description;
    private List<? extends User> users;

    @Data
    @Service
    public static class User implements IUser {
        private Integer id;
        private String email;
        private List<? extends Permission> permissions;

        @Data
        @Service
        public static class Permission implements IPermission {
            private Integer id;
            private String type;
        }
    }
}
