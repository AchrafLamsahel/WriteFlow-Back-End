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
    @ManyToMany(fetch = FetchType.EAGER , cascade=CascadeType.ALL)
    private Collection<Role> roles = new ArrayList<>();
    @OneToMany(fetch = FetchType.EAGER , cascade=CascadeType.ALL)
    private List<Article> articles;
}
