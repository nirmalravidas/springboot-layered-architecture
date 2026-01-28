package com.nirmalravidas.SpringBootApplication.repository;

import com.nirmalravidas.SpringBootApplication.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
