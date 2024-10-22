package com.example.appliances.model.request;

import com.example.appliances.entity.Field;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductCategoryRequest {
    String name;
    Long parentId;
    List<Field> fields;
}
