package org.example.bigevent.mapper;

import org.apache.ibatis.annotations.*;
import org.example.bigevent.pojo.User;

import java.util.List;

@Mapper
public interface UserMapper {
//    根据用户名查询用户
    @Select("select * from user where username=#{username}")
    User findByUserName(String username);
//    添加
    @Insert("insert into user(username,password,create_time,update_time)"+" values (#{username},#{password},now(),now())")
    void add(String username, String password);
    @Update("update user set nickname=#{nickname},email=#{email},update_time=#{updateTime} where id=#{id}")
    void update(User user);

    @Update("update user set user_pic=#{avatarUrl},update_time=now() where id=#{id}")
    void updateAvatar(String avatarUrl,Integer id);
    @Update("update user set password=#{md5String},update_time=now() where id=#{id}")
    void updatePwd(String md5String, Integer id);
    List<User> list(String username);
    @Delete("delete from user where id=#{id}")
    void deleteUserById(Integer id);

}
