package com.ihjycc.demo.mapper;

import com.ihjycc.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    List<User> findAll();
    User findByName(String username);
    String findPswByName(String username);
    void save(User user);

}
