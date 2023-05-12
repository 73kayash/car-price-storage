package ru.kayashov.storage.repository.filter.location;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import ru.kayashov.storage.entity.filters.location.LocationEntity;
import ru.kayashov.storage.repository.AbstractRepository;

@Repository
public interface LocationRepository extends AbstractRepository<LocationEntity> {
    Optional<LocationEntity> findByAvitoLocationId(Long id);
    Page<LocationEntity> findAllByParent_Id (Long id, Pageable pageable);
}
