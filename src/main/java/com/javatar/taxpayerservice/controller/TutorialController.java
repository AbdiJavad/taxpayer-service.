package com.javatar.taxpayerservice.controller;

import com.javatar.taxpayerservice.domain.Tutorial;
import com.javatar.taxpayerservice.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TutorialController {


    @Autowired
    TutorialRepository tutorialRepository;

    @PostMapping("/tutorials")
    public Tutorial createTutorial(@RequestBody Tutorial tutorial) {
        return tutorialRepository.save(tutorial);
    }
}
