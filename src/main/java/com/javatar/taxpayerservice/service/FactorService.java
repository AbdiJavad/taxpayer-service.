package com.javatar.taxpayerservice.service;

import com.javatar.taxpayerservice.domain.Customer;
import com.javatar.taxpayerservice.domain.Factor;
import com.javatar.taxpayerservice.domain.Product;
import com.javatar.taxpayerservice.domain.Seller;
import com.javatar.taxpayerservice.repository.FactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FactorService {

    @Autowired
    private FactorRepository factorRepository;
    @Autowired
    private SellerService sellerService;
    @Autowired
    private CustomerService customerService;

    public Factor save(Long customerid, Long sellerid, Factor factor) {
        Customer customer = customerService.findCustomerById(customerid);
        Seller seller = sellerService.findSellerById(sellerid);
        factor.setCustomer(customer);
        factor.setSeller(seller);
        return factorRepository.save(factor);
    }

    public List<Factor> factors() {
        return factorRepository.findAll();
    }

    public Factor findById(Long id) {
        return factorRepository.findById(id).get();
    }

    public void deletedFactor(Long factorId) {
        factorRepository.deleteById(factorId);
    }

    public Factor updateFactor(Long factorId, Long customerid, Long sellerid, Factor factor) {
        Factor factorData = factorRepository.findById(factorId).get();
//        Seller seller = sellerService.findSellerById(sellerid);
        Customer customer = customerService.findCustomerById(customerid);
        // TODO: 7/12/23 | Code refactoring
        List<Product> products = factor.getProducts();
        if (products.size() > 0) {

        }

//        if (factor.getSeller() ! = null)
//            sellerService.updateSeller(factor.getSeller().getId(), factor.getSeller());
//        if (factor.getCustomer() != null)
//            customerService.updateCustomer(factor.getCustomer().getId(), factor.getCustomer());
//
        if (factor.getDate() != null)
            factorData.setDate(factor.getDate());
        if (factor.getInvoiceNO() > 0)
            factorData.setId(factor.getId());
        if (factor.getFactorType() != null)
            factorData.setFactorType(factor.getFactorType());
        if (factor.getPaymentType() != null)
            factorData.setPaymentType(factor.getPaymentType());
        if (factor.getDescription() != null)
            factorData.setDescription(factor.getDescription());
        if (factor.getSellerContractID() != null)
            factorData.setSellerContractID(factor.getSellerContractID());
        if (factor.getTotalPrice() != null)
            factorData.setTotalPrice(factor.getTotalPrice());

        return factorRepository.save(factorData);
    }
}
