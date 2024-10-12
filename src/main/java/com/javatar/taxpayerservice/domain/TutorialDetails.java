package com.javatar.taxpayerservice.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
@Entity
public class TutorialDetails {
    @Id
    private Long id;
    private Date createdOn;
    private String createdBy;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "tutorial_id")
    private Tutorial tutorial;
}