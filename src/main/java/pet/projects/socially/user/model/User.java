package pet.projects.socially.user.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    Long id;
    String name;
    String surname;
    String email;
    String nickname;
    String password;
    @Temporal(TemporalType.TIMESTAMP)
    Date registrationDate;

    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }
}


