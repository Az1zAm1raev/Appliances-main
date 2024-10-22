package com.example.appliances.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientRequest {
    String name;
    String surname;
    String patronymic;
    Integer age;
    String phoneNumber;
    Long discountCategoryId;
    Long clientTypeId;
    Long genderId;
}
