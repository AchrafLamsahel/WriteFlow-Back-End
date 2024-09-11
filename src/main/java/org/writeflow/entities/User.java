package org.writeflow.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import java.util.*;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String email;
    private String password;
    @CreationTimestamp
    private LocalDateTime creationAt;
    @UpdateTimestamp
    private LocalDateTime updateAt;
    private boolean isEnabled;
    private Date verifiedAt;
    private String confirmationToken;
    private String resetPasswordToken;
    private Date resetPasswordTokenExpiryDate;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Role> roles = new ArrayList<>();
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Article> articles;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Like> likes;
}
