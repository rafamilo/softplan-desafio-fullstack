package com.softplan.api.domain.usecases.admin.models;

import java.util.List;

public interface IAdminUser {
    public Integer getId();
    public void setId(Integer id);
    public String getEmail();
    public void setEmail(String email);
    public String getPassword();
    public void setPassword(String password);
    public List<IPermission> getPermissions();
    public void setPermissions(List<? extends AdminUser.Permission> permissions);

    public static interface IPermission {
        public Integer getId();
        public void setId(Integer id);
        public String getType();
        public void setType(String type);
    }
}
