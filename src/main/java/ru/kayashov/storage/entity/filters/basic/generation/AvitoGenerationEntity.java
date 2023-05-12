package ru.kayashov.storage.entity.filters.basic.generation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "avito_car_generation")
public class AvitoGenerationEntity {
    @Id
    Long id;

    String name;
}
