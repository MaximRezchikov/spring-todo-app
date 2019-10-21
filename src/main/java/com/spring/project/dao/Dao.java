package com.spring.project.dao;

public interface Dao<T> {
    T add(T t);

    T findById(Long id);

    T update(Long id);

    void deleteById(Long id);
}
