package ru.kayashov.storage.repository.filter.basic;

import java.time.LocalDateTime;
import java.util.List;
import ru.kayashov.storage.entity.filters.basic.BasicFilterEntity;
import ru.kayashov.storage.repository.AbstractRepository;

public interface BasicFilterEntityRepository extends AbstractRepository<BasicFilterEntity> {
    BasicFilterEntity findByCarGeneration_Id(Long id);
    List<BasicFilterEntity> findAllByExpiredIsNullOrExpiredBefore(LocalDateTime now);
}