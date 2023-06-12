package edu.miu.allinone.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String name;
    private String username;
    private String password;
    private String role;
    @Column(length = 500)
    private String token;


    @OneToMany
    @JoinColumn(name = "user_id")
    List<Post> posts;

}
