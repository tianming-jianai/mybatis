package com.hkd.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: 张世罡
 * @Date： 2019/7/29
 * @Description: com.hkd.entity
 * @version: 1.0
 */
@Setter
@Getter
@ToString
public class Employee {
    private int id;
    private String lastName;
    private String gender;
    private String email;
    private Department dept;
}
