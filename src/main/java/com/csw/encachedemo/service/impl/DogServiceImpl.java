package com.csw.encachedemo.service.impl;

import com.csw.encachedemo.dao.DogDao;
import com.csw.encachedemo.entity.Dog;
import com.csw.encachedemo.service.DogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "myCache")/*必须用同一个缓存空间，多表联查才不会出错*/
public class DogServiceImpl implements DogServices {
    //这里的单引号不能少，否则会报错，被识别是一个对象
    @Autowired
    private DogDao dogDao;

    //保存用户数据
    @CacheEvict(allEntries = true)/*true标示清空所有，不清空所有，单表单条数据删除或更新或添加对查询集合中的缓存是不更新的*/
    public void save(Dog dog) {
        dogDao.save(dog);
    }

    //更新用户数据
    @CacheEvict(allEntries = true)/*true标示清空所有，不清空所有，单表单条数据删除或更新或添加对查询集合中的缓存是不更新的*/
    public void update(Dog dog) {
        dogDao.update(dog);
    }

    //查找用户数据
    @Cacheable
    public Dog findByUuid(String uuid) {/*只有查询的时候才缓存*/
        //若找不到缓存将打印出提示语句
        System.out.println("没有走缓存！" + uuid);
        return dogDao.findByUuid(uuid);
    }

    //删除用户数据
    @CacheEvict(allEntries = true)/*true标示清空所有，不清空所有，单表单条数据删除或更新或添加对查询集合中的缓存是不更新的*/
    public void delete(String uuid) {
        dogDao.delete(uuid);
    }

    @Override
    @Cacheable
    public List selectAll() {/*只有查询的时候才缓存*/
        List list = dogDao.selectAll();
        return list;
    }
}
