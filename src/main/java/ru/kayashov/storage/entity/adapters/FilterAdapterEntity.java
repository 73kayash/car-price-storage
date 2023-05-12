package ru.kayashov.storage.entity.adapters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "filter_adapters")
@Entity
@Getter
@Setter
public class FilterAdapterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Short id;

    String name;

    int queueNumber;
}
