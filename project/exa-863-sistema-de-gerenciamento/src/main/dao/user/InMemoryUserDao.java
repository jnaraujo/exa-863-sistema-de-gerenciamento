package main.dao.user;

import main.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryUserDao implements UserDao{
    private HashMap<String, User> users = new HashMap<>();
    @Override
    public void save(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        users.remove(user.getId());
    }

    @Override
    public void update(User user) {
        users.replace(user.getId(), user);
    }

    @Override
    public User findById(int id) {
        return users.get(id);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users.values());
    }
}
