package ru.kayashov.storage.entity.filters.basic;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.kayashov.storage.entity.AbstractEntity;
import ru.kayashov.storage.entity.filters.basic.generation.CarGenerationEntity;
import ru.kayashov.storage.entity.filters.basic.mark.CarMarkEntity;
import ru.kayashov.storage.entity.filters.basic.model.CarModelEntity;

@Table(name = "basic_filter")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BasicFilterEntity extends AbstractEntity {

    @ManyToOne
    CarMarkEntity carMark;

    @ManyToOne
    CarModelEntity carModel;

    @ManyToOne
    CarGenerationEntity carGeneration;

    LocalDateTime expired;
}
