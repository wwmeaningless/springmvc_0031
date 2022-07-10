package com.ww.mapper;


import com.ww.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
//根据条件查询
    List<User> selectUser(@Param("username") String username,
                          @Param("sex") String sex,
                          @Param("startRow") int startRow);//分页的起始行

//添加用户
    int createUser(User user);

//    删除用户
    int deleteUserById(Integer id);

//    获取总行数
    int getRowCount(@Param("username") String username,
                    @Param("sex") String sex);

}
