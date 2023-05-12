package ru.kayashov.storage.repository.filter.vehicle;

import java.util.Optional;
import ru.kayashov.storage.entity.filters.basic.vehicle.EngineEntity;
import ru.kayashov.storage.repository.AbstractRepository;

public interface EngineEntityRepository extends AbstractRepository<EngineEntity> {
    Optional<EngineEntity> findByName(String name);
}