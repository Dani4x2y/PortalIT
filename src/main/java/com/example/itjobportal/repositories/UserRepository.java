package com.example.itjobportal.repositories;

import com.example.itjobportal.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Dodaj metody dostępu do bazy danych, jeśli są potrzebne
    User findByName(String name);

    Optional<User> findByEmail(String email);
}
