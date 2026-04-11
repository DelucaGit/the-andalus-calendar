package se.andaluscalendar.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.andaluscalendar.backend.model.CalendarUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<CalendarUser, Long> {

    Optional<CalendarUser> findByEmail(String email);
}
