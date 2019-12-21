package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id //作为主键
    @GeneratedValue
    private Integer id;

    @Column(name = "name" ,nullable = true ,length = 20)
    // 对应数据库name字段,非空,长度20
    private String name;

    @Column(name = "age" ,nullable = true ,length = 4)
    // 对应数据库age字段,非空,长度4
    private Integer age;

}
