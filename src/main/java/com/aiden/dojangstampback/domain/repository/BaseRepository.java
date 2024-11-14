package com.aiden.dojangstampback.domain.repository;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<T, Id> {

    Optional<T> findById(Long id);

    List<T> findAll();

    T save(T t);

    void deleteById(Long id);

}
