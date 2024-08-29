package org.writeflow.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Role {
    private Long id;
    private String role;
    public Role(String role) {
        this.role = role;
    }
}
