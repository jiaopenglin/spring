package note.spring.service.impl;

import note.spring.annotation.SystemLog;
import note.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }
    @SystemLog
    public void update() {
        System.out.println("更新用户");
    }

}
