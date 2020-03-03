package com.wrlimit.planerbackend.service;

import java.util.List;

public interface IGenericService<T> {
    T create(T t);
    T get(Long id);
    T update(T t);
    T delete(Long id);
    List<T> getAll();
}
