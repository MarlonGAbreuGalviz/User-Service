package cl.fullstack.user_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fullstack.user_service.model.User;
import cl.fullstack.user_service.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
    public User findById(Long id) {
        return repo.findById(id);
    }
    public void save(User p)   { repo.save(p); }
    public void delete(Long id)   { repo.delete(id); }
}
