package ru.kayashov.storage.entity.filters.location;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "avito_location")
public class AvitoLocationEntity {
    @Id
    Long id;

    String name;
}
