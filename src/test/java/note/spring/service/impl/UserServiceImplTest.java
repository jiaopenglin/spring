package note.spring.service.impl;

import note.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-application1.xml"})
public class UserServiceImplTest {

    @Autowired
    public UserService UserService;
    @Test
    public void addUser() throws Exception {
        UserService.update();
        Object f;

    }

    @Test
    public void update() throws Exception {
    }

}