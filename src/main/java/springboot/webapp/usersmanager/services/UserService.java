package springboot.webapp.usersmanager.services;

import springboot.webapp.usersmanager.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();

    User put(User user);

    Optional<User> get(int id);

    boolean deleteWithThrowingException(int id);

    long deleteWithCount(int id);
}
