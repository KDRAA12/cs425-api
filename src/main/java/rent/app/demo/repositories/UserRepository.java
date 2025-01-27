package rent.app.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rent.app.demo.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
