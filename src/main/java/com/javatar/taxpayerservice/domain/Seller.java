package com.javatar.taxpayerservice.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@PrimaryKeyJoinColumn(name = "id")
public class Seller extends Person {

    private String publicKey;
    private String privateKey;
    private String CSR; //Certificate Signing Request
    private Boolean showLogo;
    //    private byte[] logo;
    private String logo;
}
