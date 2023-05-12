package ru.kayashov.storage.repository.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kayashov.storage.entity.adapters.ResourceAdapterEntity;

public interface ResourceAdapterEntityRepository extends JpaRepository<ResourceAdapterEntity, Short> {
    ResourceAdapterEntity findByName(String name);
}