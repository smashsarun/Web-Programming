/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second.model;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class Product {
    private double price;
    private String name;
    private double weight;

    public Product() {
    }

    public Product(double weight) {
        this.weight = weight;
    }

    public Product(double price, String name, double weight) {
        this.price = price;
        this.name = name;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" + "price=" + price + ", name=" + name + ", weight=" + weight + '}';
    }
    
    
}
