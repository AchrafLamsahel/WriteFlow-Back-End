package org.writeflow.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    @OneToMany( fetch = FetchType.EAGER , cascade= CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();
    //TODO suggestions
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Like> likes;
}
