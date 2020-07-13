package com.softplan.api.domain.usecases.triator;

import java.util.List;

public interface ITriatorProcess {
    public Integer getId();
    public void setId(Integer id);
    public String getDescription();
    public void setDescription(String description);
    public List<TriatorProcess.User> getUsers();
    public void setUsers(List<? extends TriatorProcess.User> users);

    public static interface IUser {
        public Integer getId();
        public void setId(Integer id);
        public String getEmail();
        public void setEmail(String email);
        public List<IPermission> getPermissions();
        public void setPermissions(List<? extends TriatorProcess.User.Permission> permissions);

        public static interface IPermission {
            public Integer getId();
            public void setId(Integer id);
            public String getType();
            public void setType(String type);
        }
    }
}
