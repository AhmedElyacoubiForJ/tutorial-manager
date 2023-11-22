package edu.yacoubi.tutorialmanager.repository;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    List<T> findAll();
    void create(T t);
    Optional<T> findById(Integer id);
    void update(T t, Integer id);
    void delete(Integer id);
}
