package ru.kayashov.storage.abstracts;

import java.io.IOException;
import java.util.List;

public interface ApiAdapter {
    <T> List<T> findAllLocation();

    <T> List<T> findAllCarMark() throws IOException, InterruptedException;

    <T> List<T> findAllCarModel(Long carMark) throws IOException, InterruptedException;

    <T> List<T> findAllCarGeneration(Long carMarkId, Long carModelId) throws IOException, InterruptedException;

    <T> List<T> findAllOffer(Long markId, Long modelId, Long generationId, Long locationId);
}
