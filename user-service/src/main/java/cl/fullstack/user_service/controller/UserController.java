package cl.fullstack.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.fullstack.user_service.model.User;
import cl.fullstack.user_service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired UserService svc;

    @GetMapping
    public List<User> getAll() {
        return svc.findAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return svc.findById(id);
    }

    @PostMapping
    public void create(@RequestBody User p) {
        svc.save(p);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        svc.delete(id);
    }
}
