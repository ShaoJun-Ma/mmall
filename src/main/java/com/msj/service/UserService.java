package com.msj.service;

import com.msj.common.ServerResponse;
import com.msj.pojo.User;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {
//    门户
    ServerResponse login(String username,String password, HttpSession session);
    ServerResponse Register(User user);
    ServerResponse checkValid(String str,String type);
    ServerResponse getUserInfo(HttpSession session);
    ServerResponse getQuestion(String username);
    ServerResponse resetPassword(String passwordOld,String passwordNew,HttpSession session);
    User getAnswer(@Param("username")String username,@Param("question")String question);
    Integer getUpdatePassword(@Param("username")String username,@Param("password")String password);
    ServerResponse updateInformation(User user,HttpSession session);

//    后台
    List<User> getUserList();
}
