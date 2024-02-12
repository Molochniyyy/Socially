package pet.projects.socially.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pet.projects.socially.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
