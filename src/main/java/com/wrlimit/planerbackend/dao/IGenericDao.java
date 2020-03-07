package com.wrlimit.planerbackend.dao;

import java.util.List;

public interface IGenericDao<T> {
    T create(T t);
    T get(String id);
    T update(T t);
    T delete(String id);
    List<T> getAll();
}
