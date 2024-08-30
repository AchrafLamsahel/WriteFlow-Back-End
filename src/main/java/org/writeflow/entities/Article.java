package org.writeflow.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Article {
    @Id
    private Long articleId;
    private String title;
    private String content;
    private String summary;
    private String articleImage;
    @CreationTimestamp
    private LocalDateTime creationTimestamp;
    @UpdateTimestamp
    private LocalDateTime updateTimestamp;
    private Long userId;
    private Date publishedAt;
}
