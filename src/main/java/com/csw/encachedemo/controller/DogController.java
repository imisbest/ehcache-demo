package com.csw.encachedemo.controller;

import com.csw.encachedemo.entity.Dog;
import com.csw.encachedemo.service.DogServices;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("dog")
public class DogController {
    @Autowired
    private DogServices dogService;

    //保存用户数据
   @RequestMapping("save")
    public void save(Dog dog) {
       /* Dog dog = new Dog();
        dog.setName("小黑");
        dog.setAge(1);*/
        dog.setId(UUID.randomUUID().toString().replace("-", ""));
        dogService.save(dog);
    }

    //更新用户数据
    @RequestMapping("update")
    public void update(Dog dog) {
        /*String uuid = "929968742a06435b866f952af902cb9d";
        Dog dog = dogService.findByUuid(uuid);
        dog.setAge(3);*/
        dogService.update(dog);
    }

    //查找用户数据
    @RequestMapping("find")
    public Dog findByUuid(String id) {
       /* String uuid = "929968742a06435b866f952af902cb9d";//大黄*/
       return dogService.findByUuid(id);
    }

    //删除用户数据
    @RequestMapping("delete")
    public void delete(String id) {
       /* String uuid = "929968742a06435b866f952af902cb9d";*/
        dogService.delete(id);
    }
    @RequestMapping("selectAll")
    public List selectAll() {
        /* String uuid = "929968742a06435b866f952af902cb9d";*/
       return dogService.selectAll();
    }
}
