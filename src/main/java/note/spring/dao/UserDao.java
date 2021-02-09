package note.spring.dao;

import note.spring.model.User;

import java.util.List;

public interface UserDao {

   public User getUserById(int id);
   public List<User> getUsers();
   public int updateUser(User user);
   public int addUser(User user);
   public int addUsers(List<User> user);
   public Long count();
   public int delete(int id);

}
