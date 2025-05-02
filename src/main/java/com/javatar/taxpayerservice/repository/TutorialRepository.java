package com.javatar.taxpayerservice.repository;


import com.javatar.taxpayerservice.domain.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
