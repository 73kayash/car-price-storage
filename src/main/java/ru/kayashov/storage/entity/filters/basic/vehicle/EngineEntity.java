package ru.kayashov.storage.entity.filters.basic.vehicle;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import ru.kayashov.storage.entity.AbstractEntity;

@Table(name = "engine")
@Entity
@Getter
@Setter
public class EngineEntity extends AbstractEntity {
    Double capacity;
    String transmission;
    Integer power;

    @OneToMany(mappedBy = "engine")
    List<RemainFilter> remainFilters;
}
