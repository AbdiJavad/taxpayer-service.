package com.javatar.taxpayerservice.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.javatar.taxpayerservice.domain.data.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@Entity
//@NoArgsConstructor
//@AllArgsConstructor
public class Factor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "factor_seq")
    @SequenceGenerator(name = "factor_seq", sequenceName = "factor_seq", allocationSize = 1)
    private Long id;
    @Enumerated(EnumType.STRING)
    private FactorType factorType;
    private String date;
    private Long invoiceNO;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    private String description;
    private String sellerContractID;
    private Double totalPrice;
//    @OneToOne(fetch = FetchType.LAZY)
//    @MapsId
//    @JoinColumn(name = "seller_id")
//    @OneToOne(mappedBy = "seller_id")
    @Embedded
    private Seller seller;
    //    @OneToOne(fetch = FetchType.LAZY)
//    @MapsId
//    @JoinColumn(name = "customer_id")
//    @OneToOne(mappedBy = "customer_id")
    @Embedded
    private Customer customer;

    @OneToMany
    @JoinColumn(name = "factor_id")
    private List<Product> products = new ArrayList<>();
}
