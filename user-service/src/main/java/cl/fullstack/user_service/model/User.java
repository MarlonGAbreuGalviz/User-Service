package cl.fullstack.user_service.model;

//import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private Long idUser;
    private String user;
    private String email;
    private String password;
    private String direction;
    //private List<Order> orders;
}
