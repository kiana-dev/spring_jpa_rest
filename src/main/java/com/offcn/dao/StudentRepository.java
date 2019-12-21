package com.offcn.dao;

import com.offcn.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// 请求路径默认实体类名小写
// 使用注解设置指定请求路径
@RepositoryRestResource(path = "student")
public interface StudentRepository extends JpaRepository<Student,Integer> {


}
