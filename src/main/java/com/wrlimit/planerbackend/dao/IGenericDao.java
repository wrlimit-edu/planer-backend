package com.wrlimit.planerbackend.dao;

import java.util.List;

public interface IGenericDao<T> {
    T create(T t);
    T get(Long id);
    T update(T t);
    T delete(Long id);
    List<T> getAll();
}
