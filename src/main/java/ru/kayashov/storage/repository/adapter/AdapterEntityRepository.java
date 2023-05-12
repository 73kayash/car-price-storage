package ru.kayashov.storage.repository.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kayashov.storage.entity.adapters.AdapterEntity;

@Repository
public interface AdapterEntityRepository extends JpaRepository<AdapterEntity, Short> {
    AdapterEntity findByFilter_NameAndResource_Name(String filterName, String resourceName);
}