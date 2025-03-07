package com.javatar.taxpayerservice.controller;


import com.javatar.taxpayerservice.domain.Factor;
import com.javatar.taxpayerservice.service.FactorService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("factor")
@Tag(name = "Factor", description = "Factor APIs")
public class FactorController {
    @Autowired
    private FactorService factorService;

    @PostMapping("/{customerid}/{sellerid}")
    public Factor save(
            @PathVariable(value = "customerid") Long customerid,
            @PathVariable(value = "sellerid") Long sellerid,
            @RequestBody Factor factor) {
        return factorService.save(customerid, sellerid, factor);
    }

    @GetMapping
    public List<Factor> factors() {
        return factorService.factors();
    }

    @GetMapping("/{id}")
    public Factor findById(@PathVariable(value = "id") Long id) {
        return factorService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletedFactor(@PathVariable(value = "id") Long factorId) {
        factorService.deletedFactor(factorId);
    }

    @PutMapping("/{id}/customer/{customerid}/seller/{sellerid}")
    public Factor updateFactor(
            @PathVariable(value = "id") Long factorId,
            @PathVariable(value = "customerid") Long customerid,
            @PathVariable(value = "sellerid") Long sellerid,
            @RequestBody Factor factor) {
        return factorService.updateFactor(factorId, customerid, sellerid, factor);
    }

}
