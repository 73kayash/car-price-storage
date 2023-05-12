package ru.kayashov.storage.entity.filters.basic.generation;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import ru.kayashov.storage.entity.AbstractEntity;
import ru.kayashov.storage.entity.filters.basic.model.CarModelEntity;

@Entity
@Getter
@Setter
@Table(name = "car_generation")
public class CarGenerationEntity extends AbstractEntity {

    Integer yearFrom;

    Integer yearTo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    AvitoGenerationEntity avitoGeneration;

    @ManyToOne(fetch = FetchType.EAGER)
    CarModelEntity carModel;
}
