package org.writeflow.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class User {
    private Long id;
    private String userName;
    private String email;
    private String phoneNumber;
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
    private Set<Role> roles;
    private List<Article> articles;
}
