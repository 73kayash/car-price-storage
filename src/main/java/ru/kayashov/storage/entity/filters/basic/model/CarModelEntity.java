package ru.kayashov.storage.entity.filters.basic.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import ru.kayashov.storage.entity.AbstractEntity;
import ru.kayashov.storage.entity.filters.basic.generation.CarGenerationEntity;
import ru.kayashov.storage.entity.filters.basic.mark.CarMarkEntity;

@Entity
@Getter
@Setter
@Table(name = "car_model")
public class CarModelEntity extends AbstractEntity {

    String cirilicName;

    @OneToMany(mappedBy = "carModel", cascade = CascadeType.ALL)
    List<CarGenerationEntity> generationEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    CarMarkEntity carMark;

    @OneToOne(fetch = FetchType.EAGER)
    AvitoModelEntity avitoModel;
}
