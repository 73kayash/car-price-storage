package ru.kayashov.storage.repository.filter.vehicle;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.kayashov.storage.entity.filters.basic.vehicle.EngineEntity;
import ru.kayashov.storage.entity.filters.basic.vehicle.RemainFilter;
import ru.kayashov.storage.entity.filters.basic.vehicle.VehicleTypeEntity;

public interface RemainFilterRepository extends JpaRepository<RemainFilter, Long> {
    Optional<RemainFilter> findByYearAndEngineAndVehicleType(Long year, EngineEntity engine, VehicleTypeEntity vehicleType);
}