package se.andaluscalendar.flywaydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.andaluscalendar.flywaydemo.model.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long> {
}
