package ru.kayashov.storage.entity.adapters;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "adapters")
@Entity
@Getter
@Setter
public class AdapterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Short id;

    @ManyToOne(fetch = FetchType.EAGER)
    FilterAdapterEntity filter;

    @ManyToOne(fetch = FetchType.EAGER)
    ResourceAdapterEntity resource;

    LocalDateTime expired;
}