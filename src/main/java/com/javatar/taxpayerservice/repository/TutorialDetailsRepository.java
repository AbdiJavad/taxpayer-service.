package com.javatar.taxpayerservice.repository;

import com.javatar.taxpayerservice.domain.TutorialDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialDetailsRepository extends JpaRepository<TutorialDetails, Long> {
}
