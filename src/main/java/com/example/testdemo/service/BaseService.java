package com.example.testdemo.service;

public interface BaseService<T, ID> {
    T getById(ID id);
    T save(T t);
    void delete(ID id);
}
