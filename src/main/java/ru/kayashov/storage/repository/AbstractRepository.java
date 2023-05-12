package ru.kayashov.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.kayashov.storage.entity.AbstractEntity;

@NoRepositoryBean
public interface AbstractRepository<E extends AbstractEntity> extends JpaRepository<E, Long> {
}
