package com.example.appliances.model.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientResponse {
    Long id;
    String name;
    String surname;
    String patronymic;
    Integer age;
    String phoneNumber;
    DiscountCategoryResponse discountCategory;
    ClientTypeResponse clientTypeId;

    GenderResponse gender;
}
