package ru.kayashov.storage.repository.filter.basic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.kayashov.storage.entity.filters.basic.generation.CarGenerationEntity;
import ru.kayashov.storage.repository.AbstractRepository;

public interface CarGenerationEntityRepository extends AbstractRepository<CarGenerationEntity> {

    Page<CarGenerationEntity> findAllByCarModel_Id(Long id, Pageable pageable);
}