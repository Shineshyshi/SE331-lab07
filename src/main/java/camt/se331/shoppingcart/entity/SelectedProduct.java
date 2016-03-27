package camt.se331.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Dto on 2/7/2015.
 */
@Entity
public class SelectedProduct {
    @Id
            @GeneratedValue
            Long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SelectedProduct)) return false;

        SelectedProduct that = (SelectedProduct) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getProduct() != null ? !getProduct().equals(that.getProduct()) : that.getProduct() != null) return false;
        return getAmount() != null ? getAmount().equals(that.getAmount()) : that.getAmount() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getProduct() != null ? getProduct().hashCode() : 0);
        result = 31 * result + (getAmount() != null ? getAmount().hashCode() : 0);
        return result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @OneToOne
    Product product;
    Integer amount;

    public Double getTotalPrice(){
        return 0.0;
    }

    public SelectedProduct() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public SelectedProduct(Product product, Integer amount) {

        this.product = product;
        this.amount = amount;
    }
}
