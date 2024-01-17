package com.example.itjobportal.repositories;

import com.example.itjobportal.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    // Dodaj metody dostępu do bazy danych, jeśli są potrzebne
}
