package com.wildcodeschool.wildandwizard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.wildandwizard.entity.School;

// Step 4: Transform the interface to an DAO, which is a link between the application and the database
@Repository
public interface SchoolRepository extends JpaRepository<School, Long>{
}
