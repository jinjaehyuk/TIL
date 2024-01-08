package com.example.io;

import java.util.Iterator;
import java.util.List;

public interface UserService {
    //회원정보를 등록
    public void addUser(User user);
    //회원정보를 수정 - user.getEmail()
    public boolean updateUser(User user);
    //회원정보를 삭제
    public boolean deleteUser(String email);
    //모든 회원정보를 반환
    public Iterator<User> getUsers();
    public boolean exists(String email);
}
