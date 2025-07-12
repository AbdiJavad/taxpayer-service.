package com.javatar.taxpayerservice.controller;

import com.javatar.taxpayerservice.domain.HealthCheck;
import com.javatar.taxpayerservice.repository.HealthCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.Date;
import java.util.List;
import java.util.Timer;


@RestController
@RequestMapping("health")
@Tag(name = "Health", description = "Health APIs")
public class HealthCheckController {

    @Autowired
    private HealthCheckRepository healthCheckRepository;

    @GetMapping
    public List<HealthCheck> healthChecks() {
        HealthCheck check = new HealthCheck();
        check.setPublicationDate(new Date());
        check.setPublicationTime(new Date());
        check.setPublicationTimestamp(new Date());
        healthCheckRepository.save(check);
        return healthCheckRepository.findAll();
    }
}
