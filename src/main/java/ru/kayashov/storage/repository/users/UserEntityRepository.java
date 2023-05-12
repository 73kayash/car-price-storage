package ru.kayashov.storage.repository.users;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.kayashov.storage.entity.users.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByTelegram(Long telegram);
}