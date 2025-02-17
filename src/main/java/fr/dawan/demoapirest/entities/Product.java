package fr.dawan.demoapirest.entities;

public class Product {

    private long id;
    private String description;
    private double price;
    //private byte[] productImage; //stocker le binaire de l'image dans la BD
    private String imagePath; // la BD contient uniquement le chemin du fichier

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
