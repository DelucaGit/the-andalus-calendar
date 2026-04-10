package se.andaluscalendar.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "calendar_users")
@Data
@NoArgsConstructor
public class CalendarUser {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "selected_city")
    private String selectedCity;

    @Column(unique = true, nullable = false)
    private String email;
}
