package com.javatar.taxpayerservice.service;


import com.javatar.taxpayerservice.domain.Product;
import com.javatar.taxpayerservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> products() {
        return productRepository.findAll();
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id).get();
    }

    public void deletedProductById(Long id) {
        productRepository.deleteById(id);
    }

    public Product updateProduct(Long id, Product product) {
        Product productData = productRepository.findById(id).get();
        if (product.getName() != null)
            productData.setName(product.getName());
        if (product.getUniqueIdentifier() != null)
            productData.setUniqueIdentifier(product.getUniqueIdentifier());
        if (product.getProductCode() != null)
            productData.setProductCode(product.getProductCode());
        if (product.getPrice() != null)
            productData.setPrice(product.getPrice());
        if (product.getValueAddedRate() != null)
            productData.setValueAddedRate(product.getValueAddedRate());
        if (product.getUnitOfMeasurement() != null)
            productData.setUnitOfMeasurement(product.getUnitOfMeasurement());
        if (product.getExportPattern() != null)
            productData.setExportPattern(product.getExportPattern());
        if (product.getExchangeRateWithRial() != null)
            productData.setExchangeRateWithRial(product.getExchangeRateWithRial());
        if (product.getProductCurrencyValue() != null)
            productData.setProductCurrencyValue(product.getProductCurrencyValue());
        if (product.getProductRialValue() != null)
            productData.setProductRialValue(product.getProductRialValue());
        if (product.getCurrencyType() != null)
            productData.setCurrencyType(product.getCurrencyType());
        if (product.getWeight() != null)
            productData.setWeight(product.getWeight());
        if (product.getSubjectOtherLegalFunds() != null)
            productData.setSubjectOtherLegalFunds(product.getSubjectOtherLegalFunds());
        if (product.getRateSubjectOtherLegalFunds() != null)
            productData.setRateSubjectOtherLegalFunds(product.getRateSubjectOtherLegalFunds());
        if (product.getAmountSubjectOtherLegalFunds() != null)
            productData.setAmountSubjectOtherLegalFunds(product.getAmountSubjectOtherLegalFunds());
        if (product.getSubjectOtherTaxesAndDuties() != null)
            productData.setSubjectOtherTaxesAndDuties(product.getSubjectOtherTaxesAndDuties());
        if (product.getRateSubjectOtherTaxesAndDuties() != null)
            productData.setRateSubjectOtherTaxesAndDuties(product.getRateSubjectOtherTaxesAndDuties());
        if (product.getAmountSubjectOtherTaxesAndDuties() != null)
            productData.setAmountSubjectOtherTaxesAndDuties(product.getAmountSubjectOtherTaxesAndDuties());
        return productRepository.save(productData);
    }
}
