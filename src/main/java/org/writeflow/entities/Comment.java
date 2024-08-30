package org.writeflow.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Comment {
    private Long commentId;
    private String content;
    private Long userId;
}
