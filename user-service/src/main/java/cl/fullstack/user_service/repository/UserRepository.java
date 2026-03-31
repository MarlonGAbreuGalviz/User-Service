package cl.fullstack.user_service.repository;
import cl.fullstack.user_service.model.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private List<User> lista = new ArrayList<>();
    public List<User> findAll() {
        return lista;
    }
    public User findById(Long id) {
        return lista.stream()
        .filter(p -> p.getIdUser().equals(id))
        .findFirst().orElse(null);
    }
    public void save(User p)  { lista.add(p); }
    public void delete(Long id)  {
        lista.removeIf(p -> p.getIdUser().equals(id));
    }

}
