package ru.kayashov.storage.repository.filter.vehicle;

import java.util.Optional;
import ru.kayashov.storage.entity.filters.basic.vehicle.VehicleTypeEntity;
import ru.kayashov.storage.repository.AbstractRepository;

public interface VehicleTypeEntityRepository extends AbstractRepository<VehicleTypeEntity> {
    Optional<VehicleTypeEntity> findByName(String vehicleTypeName);
}