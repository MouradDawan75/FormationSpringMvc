package fr.dawan.demoapirest.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Supplier extends BaseEntity{

    private String name;

    //supplier_id est une clé de jointure: gestion de la suppression en cascade
    @ManyToMany(cascade = CascadeType.REMOVE)
    private Set<Product> products;

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
