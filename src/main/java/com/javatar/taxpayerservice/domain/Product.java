package com.javatar.taxpayerservice.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @SequenceGenerator(name = "product_seq", sequenceName = "product_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String uniqueIdentifier;
    private String productCode;
    private Double price;
    private Double valueAddedRate;
    private String unitOfMeasurement;
    private Boolean exportPattern;
    private String exchangeRateWithRial;
    private String productCurrencyValue;
    private String productRialValue;
    private String currencyType;
    private Double weight;
    private String subjectOtherLegalFunds;
    private String rateSubjectOtherLegalFunds;
    private String amountSubjectOtherLegalFunds;
    private String subjectOtherTaxesAndDuties;
    private String rateSubjectOtherTaxesAndDuties;
    private String amountSubjectOtherTaxesAndDuties;
    private String description;
}
