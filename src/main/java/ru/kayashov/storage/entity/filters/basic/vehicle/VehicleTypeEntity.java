package ru.kayashov.storage.entity.filters.basic.vehicle;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import ru.kayashov.storage.entity.AbstractEntity;

@Table(name = "vehicle_type")
@Entity
@Getter
@Setter
public class VehicleTypeEntity extends AbstractEntity {
    String bodyType;
    String drive;
    String engineType;

    @OneToMany(mappedBy = "vehicleType")
    List<RemainFilter> remainFilters;
}
