package org.zbb.mapper;

import org.zbb.pojo.Users;

import java.util.List;

/**
 * @Auther: 翟兵兵
 * @Date: 2022/11/25
 * @Description: IntelliJ IDEA
 * @version: 1.0
 */
public interface UserMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
