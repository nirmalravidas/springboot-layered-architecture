package com.nirmalravidas.SpringBootApplication.repository;

import com.nirmalravidas.SpringBootApplication.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
