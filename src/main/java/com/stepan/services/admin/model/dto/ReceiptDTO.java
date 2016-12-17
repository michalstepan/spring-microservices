package com.stepan.services.admin.model.dto;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;

/**
 * Created by Michal on 17.12.2016.
 */
@JsonRootName("Receipt")
public class ReceiptDTO {

    private Integer id;

    private String issuedBy;

    private BigDecimal price;

    public ReceiptDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
