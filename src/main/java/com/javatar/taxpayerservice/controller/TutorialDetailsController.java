package com.javatar.taxpayerservice.controller;

import com.javatar.taxpayerservice.domain.Tutorial;
import com.javatar.taxpayerservice.domain.TutorialDetails;
import com.javatar.taxpayerservice.repository.TutorialDetailsRepository;
import com.javatar.taxpayerservice.repository.TutorialRepository;
import org.hibernate.metamodel.model.domain.TupleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TutorialDetailsController {


    
    @Autowired
    private TutorialDetailsRepository detailsRepository;

    @Autowired
    private TutorialRepository tutorialRepository;

    @PostMapping("/tutorials/{tutorialId}/details")
    public ResponseEntity<TutorialDetails> createDetails(@PathVariable(value = "tutorialId") Long tutorialId,
                                                         @RequestBody TutorialDetails detailsRequest) {
        Tutorial tutorial = tutorialRepository.findById(tutorialId).get();

        detailsRequest.setCreatedOn(new java.util.Date());
        detailsRequest.setTutorial(tutorial);
        TutorialDetails details = detailsRepository.save(detailsRequest);

        return new ResponseEntity<>(details, HttpStatus.CREATED);
    }
}
