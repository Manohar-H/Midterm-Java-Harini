package model;

import java.time.LocalDate;
import java.util.Random;

public class Medication {
    private String id;
    private String name;
    private String dose;
    private int quantityInStock;
    private LocalDate expiryDate;

    public Medication(String id, String name, String dose, int quantityInStock) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantityInStock = quantityInStock;
        this.expiryDate = generateRandomExpiryDate();
    }

    private LocalDate generateRandomExpiryDate() {
        Random random = new Random();
        int days = random.nextInt(365 * 3) - (365);  // Random date within past year to 2 years in future
        return LocalDate.now().plusDays(days);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDose() { return dose; }
    public int getQuantityInStock() { return quantityInStock; }
    public LocalDate getExpiryDate() { return expiryDate; }

    public void restock(int amount) {
        this.quantityInStock += amount;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dose: " + dose + ", Stock: " + quantityInStock + ", Expiry: " + expiryDate;
    }
}