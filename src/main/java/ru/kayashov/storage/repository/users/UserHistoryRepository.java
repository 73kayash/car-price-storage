package ru.kayashov.storage.repository.users;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.kayashov.storage.entity.users.UserHistory;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
    List<UserHistory> findAllByUser_Telegram(Long telegram);
}