package com.openbootcamp.demo.repositories;

import java.util.List;

public interface IRepository<T> {

    boolean add(T t);

    T findOne(int id);

    List<T> findAll();

    boolean remove(int id);

    boolean update(int id, T t);

}
