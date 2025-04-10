package com.prop.app.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends Audit {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "full_name", length = 100)
    private String fullName;

    @Column(length = 150)
    private String email;

    @Column(name = "phone_number", length = 150)
    private String phoneNumber;

    @Column(name = "password_hash", length = 150)
    private String passwordHash;

    @Column(name = "last_login")
    private Date lastLogin;

    @Column(columnDefinition = "TEXT")
    private String address;

    @Column(name = "email_verified")
    private Boolean emailVerified;

    @Column(name = "phone_verified")
    private Boolean phoneVerified;

    @Column(name = "referral_code")
    private Integer referralCode;

    @Column(name = "auth_provider", length = 50)
    private String authProvider;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles = new ArrayList<>();
}
