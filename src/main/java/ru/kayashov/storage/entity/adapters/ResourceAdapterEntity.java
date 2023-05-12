package ru.kayashov.storage.entity.adapters;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "resource_adapters")
@Entity
@Getter
@Setter
public class ResourceAdapterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Short id;

    String name;

    LocalDateTime timeout;
}