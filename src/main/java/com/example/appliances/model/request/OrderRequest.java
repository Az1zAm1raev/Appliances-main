package com.example.appliances.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderRequest {

    List<OrderItemRequest> orderItems;

    String address;
    String phoneNumber;
    String name;
    String comment;

    Long clientId;

    String numberNakladnoy;

    Double totalAmount;

    Long managerId;

}
