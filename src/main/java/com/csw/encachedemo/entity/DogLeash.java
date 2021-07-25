package com.csw.encachedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class DogLeash implements Serializable {
    private String id;
    private String color;
    private String variety;
    private String dogId;
}
