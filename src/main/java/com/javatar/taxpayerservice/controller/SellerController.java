package com.javatar.taxpayerservice.controller;

import com.javatar.taxpayerservice.domain.Seller;
import com.javatar.taxpayerservice.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("seller")
@Tag(name = "Seller", description = "Seller APIs")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @PostMapping
    public Seller save(@RequestBody Seller seller) {
        return sellerService.save(seller);
    }


    @GetMapping
    public List<Seller> sellers() {
        return sellerService.sellers();
    }


    @GetMapping("/{id}")
    public Seller findSellerById(@PathVariable(value = "id") Long id) {
        return sellerService.findSellerById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSeller(@PathVariable(value = "id") Long id) {
        sellerService.deleteSeller(id);
    }

    @PutMapping("/{id}")
    public Seller updateSeller(@PathVariable(value = "id") Long id,
                               @RequestBody Seller seller) {
        return sellerService.updateSeller(id, seller);
    }
}