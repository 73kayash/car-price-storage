package ru.kayashov.storage.entity.filters.basic.vehicle;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import ru.kayashov.storage.entity.AbstractEntity;
import ru.kayashov.storage.entity.filters.PriceEntity;

@Entity
@Getter
@Setter
public class RemainFilter extends AbstractEntity {
    Long year;

    @ManyToOne
    EngineEntity engine;

    @ManyToOne
    VehicleTypeEntity vehicleType;

    @OneToMany(mappedBy = "remainFilter")
    List<PriceEntity> prices;
}
