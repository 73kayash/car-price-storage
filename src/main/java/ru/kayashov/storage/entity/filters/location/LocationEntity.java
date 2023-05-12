package ru.kayashov.storage.entity.filters.location;

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

@Entity
@Getter
@Setter
@Table(name = "location")
public class LocationEntity extends AbstractEntity {

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    List<LocationEntity> childes;

    @ManyToOne(cascade = CascadeType.ALL)
    LocationEntity parent;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    AvitoLocationEntity avitoLocation;
}
