package ru.kayashov.storage.entity.users;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import ru.kayashov.storage.entity.filters.basic.BasicFilterEntity;

@Entity
@Getter
@Setter
public class UserHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private BasicFilterEntity filter;

    private LocalDateTime dateTime;
}
