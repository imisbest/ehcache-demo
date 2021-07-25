package com.csw.encachedemo.dao;

import com.csw.encachedemo.entity.Dog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DogDao {
    void delete(@Param("uuid") String uuid);

    Dog findByUuid(@Param("uuid") String uuid);

    void save(@Param("dog") Dog dog);

    void update(@Param("dog") Dog dog);

    List selectAll();
}
