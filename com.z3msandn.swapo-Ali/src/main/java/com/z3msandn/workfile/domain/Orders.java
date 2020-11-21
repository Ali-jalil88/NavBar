package com.z3msandn.workfile.domain;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "jhi-Order")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(max = 50)
    @Id
    @Column(length = 50)
    private Long id;

    @NotNull
    @Size(max = 50)
    @Column(length = 50)
    private Long itemId;

    @NotNull
    @Size(max = 50)
    @Column(length = 50)
    private String quantity;

    @NotNull
    @Size(max = 50)
    @Column(length = 50)
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
        Orders entity = (Orders) o;
        return id == entity.id &&
            itemId == entity.itemId &&
            Objects.equals(quantity, entity.quantity) &&
            Objects.equals(unitPrice, entity.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, itemId, quantity, unitPrice);
    }

    @Override
    public String toString() {
        return "Entity{" +
            "id=" + id +
            ", itemId=" + itemId +
            ", quantity='" + quantity + '\'' +
            ", unitPrice='" + unitPrice + '\'' +
            '}';
    }
}
