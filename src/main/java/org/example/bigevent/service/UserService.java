package org.example.bigevent.service;
import org.example.bigevent.pojo.PageBean;
import org.example.bigevent.pojo.User;

public interface UserService {
    //    根据用户名查询用户
    User findByUserName(String username);

    //注册
    void register(String username, String password);

    //更新
    void update(User user);
    void updateAvatar(String avatarUrl);
    void updatePwd(String newPwd);
    PageBean<User> list(Integer pageNum, Integer pageSize,  String username);
    void deleteUserById(Integer id);
}

