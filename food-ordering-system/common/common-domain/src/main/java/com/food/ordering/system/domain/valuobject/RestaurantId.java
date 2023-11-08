package com.food.ordering.system.domain.valuobject;

import java.util.UUID;

public class RestaurantId extends BaseId<UUID> {
    public RestaurantId(UUID value) {
        super(value);
    }
}
