package com.softplan.api.repository.entities;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @ManyToMany(mappedBy="users")
    private List<Process> processes;

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    @Cascade(value = CascadeType.SAVE_UPDATE)
    private List<UserPermission> userPermission;
}