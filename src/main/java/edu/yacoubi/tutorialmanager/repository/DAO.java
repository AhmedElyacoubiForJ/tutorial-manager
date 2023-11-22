package edu.yacoubi.tutorialmanager.repository;

import java.util.List;
import java.util.Optional;

public interface DAO<T, ID_T> {
    List<T> findAll();
    void create(T t);
    Optional<T> findById(ID_T id);
    void update(T t, ID_T id);
    void delete(ID_T id);
}
