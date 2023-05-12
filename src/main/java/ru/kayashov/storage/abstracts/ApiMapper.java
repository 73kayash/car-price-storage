package ru.kayashov.storage.abstracts;

import ru.kayashov.storage.entity.filters.basic.BasicFilterEntity;
import ru.kayashov.storage.entity.filters.basic.generation.CarGenerationEntity;
import ru.kayashov.storage.entity.filters.basic.mark.CarMarkEntity;
import ru.kayashov.storage.entity.filters.basic.model.CarModelEntity;
import ru.kayashov.storage.entity.filters.location.LocationEntity;
import ru.kayashov.storage.pojo.Offer;

import java.util.List;

public interface ApiMapper {
    <T> List<LocationEntity> toLocationEntities(List<T> allLocation);

    <T> List<CarMarkEntity> toCarMarkEntities(List<T> allCarMark);

    <T> List<CarModelEntity> toCarModelEntities(List<T> allCarModel, CarMarkEntity carMark);

    <T> List<CarGenerationEntity> toCarGenerationEntities(List<T> allCarGeneration, CarModelEntity carModel);

    <T> List<Offer> toOfferEntities(List<T> allOffer, BasicFilterEntity filter);

    Long toResMarkId(CarMarkEntity carMark);

    Long toResMarkId(CarModelEntity carModel);

    Long toResModelId(CarModelEntity carModel);

    Long toResModelId(BasicFilterEntity filter);

    Long toResMarkId(BasicFilterEntity filter);

    Long toResGenId(BasicFilterEntity filter);

    Long toResLocationId(LocationEntity location);
}
