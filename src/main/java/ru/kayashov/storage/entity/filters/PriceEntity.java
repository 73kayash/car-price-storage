package ru.kayashov.storage.entity.filters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.kayashov.storage.entity.filters.basic.BasicFilterEntity;
import ru.kayashov.storage.entity.filters.basic.vehicle.RemainFilter;
import ru.kayashov.storage.entity.filters.location.LocationEntity;

@Table(name = "price")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PriceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long minIn;
    Long priceTo;
    Long priceFrom;
    Long mileage;
    Integer countOffer;

    @ManyToOne
    LocationEntity location;

    @ManyToOne
    BasicFilterEntity basicFilter;

    @ManyToOne
    RemainFilter remainFilter;
}
