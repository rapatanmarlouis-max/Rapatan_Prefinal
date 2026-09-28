/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product_Inventory_Management_System;

/**
 *
 * @author User
 */


public class Product {
    private String productId;
    private String productName;
    private String category;
    private double price;
    private int quantity;

    public Product(String productId, String productName, String category, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double calculateInventoryValue() {
        return price * quantity;
    }

    public String getStockStatus() {
        if (quantity == 0) return "Out of Stock";
        else if (quantity <= 10) return "Low Stock";
        else if (quantity <= 50) return "Normal Stock";
        else return "High Stock";
    }

    public void displayProductInfo() {
        System.out.println("===== PRODUCT INFORMATION =====");
        System.out.println("ID: " + productId + "\nName: " + productName + "\nCategory: " + category);
        System.out.println("Price: P" + price + "\nQuantity: " + quantity);
        System.out.println("Inventory Value: P" + calculateInventoryValue());
        System.out.println("Status: " + getStockStatus());
    }
    
    public static void main(String[] args) {
        Product p = new Product("P001", "Mouse", "Electronics", 500, 45);
        p.displayProductInfo();
    }
}
