package ru.kayashov.storage.entity.filters.basic.mark;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import ru.kayashov.storage.entity.AbstractEntity;
import ru.kayashov.storage.entity.filters.basic.model.CarModelEntity;

@Entity
@Getter
@Setter
@Table(name = "car_mark")
public class CarMarkEntity extends AbstractEntity {

    String cirilicName;

    @OneToMany(mappedBy = "carMark")
    List<CarModelEntity> models;

    @OneToOne(fetch = FetchType.EAGER)
    AvitoMarkEntity avitoMark;
}
