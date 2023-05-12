package ru.kayashov.storage.entity.filters.basic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "avito_car_model")
public class AvitoModelEntity {
    @Id
    Long id;

    String name;
}
