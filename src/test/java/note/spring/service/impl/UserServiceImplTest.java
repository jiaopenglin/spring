package note.spring.service.impl;

import note.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-aop.xml"})
public class UserServiceImplTest {

    @Autowired
    public UserService userService;
    @Test
    public void addUser() throws Exception {
        userService.update();
        Object f;

    }

    @Test
    public void update() throws Exception {
    }

}