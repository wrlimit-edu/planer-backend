package com.wrlimit.planerbackend.dao;

import java.util.List;

public interface IGenericDao<T> {
    T create(T t);
    T get(Integer id);
    T update(T t);
    T delete(Integer id);
    List<T> getAll();
}
