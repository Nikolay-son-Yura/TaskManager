package ru.gb.user.model;


import jakarta.persistence.*;
import lombok.*;
import ru.gb.task.model.Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "users", uniqueConstraints = {
//        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})
})

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String userName;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "enabled")
    private boolean isEnabled;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Set<Role> roles;


    @OneToMany(mappedBy = "assignee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Task> assignedTasks = new ArrayList<>();

//    public User(String email, String password) {
//        this.email = email;
//        this.password = password;
//    }
//
//    public User(String userEmail, String userPassword, boolean isEnabled) {
//        this.email = userEmail;
//        this.password = userPassword;
//        this.isEnabled = isEnabled;
//    }
}
