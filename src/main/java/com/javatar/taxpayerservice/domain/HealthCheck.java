package com.javatar.taxpayerservice.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;


@Data
@Entity
public class HealthCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date publicationDate;
    @Temporal(TemporalType.TIME)
    private Date publicationTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date publicationTimestamp;


}
