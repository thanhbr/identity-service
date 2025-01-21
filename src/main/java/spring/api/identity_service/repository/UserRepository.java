package spring.api.identity_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.api.identity_service.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
