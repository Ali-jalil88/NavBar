package com.z3msandn.workfile.service.dto;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Objects;

public class OrderDTO {
    private Long id;
    private Long itemId;
    private String quantity;
    private String unitPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDTO dto = (OrderDTO) o;
        return itemId == dto.itemId &&
            Objects.equals(quantity, dto.quantity) &&
            Objects.equals(unitPrice, dto.unitPrice);
    }
    @Override
    public int hashCode() {
        return Objects.hash(itemId, quantity, unitPrice);
    }

    @Override
    public String toString() {
        return "Dto{" +
            "itemId=" + itemId +
            ", quantity='" + quantity + '\'' +
            ", unitPrice='" + unitPrice + '\'' +
            '}';
    }
}
