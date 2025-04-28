package com.javatar.taxpayerservice.service;


import com.javatar.taxpayerservice.domain.Seller;
import com.javatar.taxpayerservice.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public Seller save(Seller seller) {
        return sellerRepository.save(seller);
    }

    public List<Seller> sellers() {
        return sellerRepository.findAll();
    }

    public Seller findSellerById(Long sellerId) {
        return sellerRepository.findById(sellerId).get();
    }

    public void deleteSeller(Long id) {
        sellerRepository.deleteById(id);
    }

    public Seller updateSeller(Long id, Seller seller) {
        Seller sellerData = sellerRepository.findById(id).get();
        if (seller.getPersonType() != null)
            sellerData.setPersonType(seller.getPersonType());
        if (seller.getPersonUse() != null)
            sellerData.setPersonUse(seller.getPersonUse());
        if (seller.getName() != null)
            sellerData.setName(seller.getName());
        if (seller.getProvince() != null)
            sellerData.setProvince(seller.getProvince());
        if (seller.getCity() != null)
            sellerData.setCity(seller.getCity());
        if (seller.getAddress() != null)
            sellerData.setAddress(seller.getAddress());
        if (seller.getPostalCode() != null)
            sellerData.setPostalCode(seller.getPostalCode());
        if (seller.getPhone() != null)
            sellerData.setPhone(seller.getPhone());
        if (seller.getFax() != null)
            sellerData.setFax(seller.getFax());
        if (seller.getDescription() != null)
            sellerData.setDescription(seller.getDescription());
        if (seller.getNationalCode() != null)
            sellerData.setNationalCode(seller.getNationalCode());
        if (seller.getNewEconomicCode() != null)
            sellerData.setNewEconomicCode(seller.getNewEconomicCode());
        if (seller.getUniqueMemoryIdentifier() != null)
            sellerData.setUniqueMemoryIdentifier(seller.getUniqueMemoryIdentifier());
        if (seller.getRegistrationNo() != null)
            sellerData.setRegistrationNo(seller.getRegistrationNo());
        if (seller.getPublicKey() != null)
            sellerData.setPublicKey(seller.getPublicKey());
        if (seller.getPrivateKey() != null)
            sellerData.setPrivateKey(seller.getPrivateKey());
        if (seller.getCSR() != null)
            sellerData.setCSR(seller.getCSR());
        if (seller.getShowLogo() != null)
            sellerData.setShowLogo(seller.getShowLogo());
        if (seller.getLogo() != null)
            sellerData.setLogo(seller.getLogo());
        return sellerRepository.save(sellerData);
    }

}
