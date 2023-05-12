package ru.kayashov.storage.entity.users;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import ru.kayashov.storage.entity.filters.location.LocationEntity;

@Entity
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long telegram;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "user")
    private List<UserHistory> history;
    @ManyToOne
    private LocationEntity location;
}
