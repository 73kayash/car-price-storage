package ru.kayashov.storage.repository.filter;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kayashov.storage.entity.filters.PriceEntity;

public interface PriceEntityRepository extends JpaRepository<PriceEntity, Long> {
}