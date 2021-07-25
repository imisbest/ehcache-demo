package com.csw.encachedemo.service;

import com.csw.encachedemo.entity.Dog;

import java.util.List;

public interface DogServices {
    public void save(Dog dog);

    public void update(Dog dog);

    public Dog findByUuid(String uuid);

    public void delete(String uuid);

    List selectAll();
}
