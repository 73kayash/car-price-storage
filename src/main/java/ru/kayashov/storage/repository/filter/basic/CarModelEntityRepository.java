package ru.kayashov.storage.repository.filter.basic;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.kayashov.storage.entity.filters.basic.model.CarModelEntity;
import ru.kayashov.storage.repository.AbstractRepository;

public interface CarModelEntityRepository extends AbstractRepository<CarModelEntity> {

    List<CarModelEntity> findAllByCarMark_Id(Long id);

    Page<CarModelEntity> findAllByCarMark_Id(Long id, Pageable pageable);
}