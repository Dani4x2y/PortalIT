package com.example.itjobportal.repositories;

import com.example.itjobportal.models.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface JobOfferRepository extends JpaRepository<JobOffer, Long> {
    // Dodaj metody dostępu do bazy danych, jeśli są potrzebne

    List<JobOffer> findAll(); // Dodaj tę metodę, aby pobrać wszystkie oferty pracy

    List<JobOffer> findByLocation(String location);

    List<JobOffer> findBySalaryGreaterThan(BigDecimal salary);

    List<JobOffer> findByCreationDateAfter(LocalDateTime creationDate);

    List<JobOffer> findByProvince(String province);

    List<JobOffer> findBySalaryBetween(BigDecimal minSalary, BigDecimal maxSalary);

}
