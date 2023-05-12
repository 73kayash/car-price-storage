package ru.kayashov.storage.pojo;

import lombok.Getter;
import lombok.Setter;
import ru.kayashov.storage.entity.filters.basic.BasicFilterEntity;
import ru.kayashov.storage.entity.filters.basic.vehicle.EngineEntity;
import ru.kayashov.storage.entity.filters.basic.vehicle.VehicleTypeEntity;
import ru.kayashov.storage.entity.filters.location.LocationEntity;

@Getter
@Setter
public class Offer {
    String url;
    Long price;
    Long mileage;
    Long year;
    EngineEntity engine;
    VehicleTypeEntity vehicleType;
    LocationEntity location;
    BasicFilterEntity basicFilter;

    public Long getLocationId() {
        return location.getId();
    }

    public String getRemainFiltersString() {
        return year + ", " + engine.getName() + ", " + vehicleType.getName();
    }
}
