package com.food.ordering.system.domain.valuobject;

import java.util.UUID;

public class CustomerId extends BaseId<UUID> {
    public CustomerId(UUID value) {
        super(value);
    }
}
