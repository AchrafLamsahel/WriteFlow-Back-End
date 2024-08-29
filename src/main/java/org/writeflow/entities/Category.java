package org.writeflow.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Category {
    private Long id;
    private String categoryName;
    private String categoryImage;
    private String categoryDescription;
}
