package entities;

public class Product
{
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock () {
        return quantity * price;
    }

    public void AddProductsQuantity (int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProductsQuantity (int quantity) {
        this.quantity -= quantity;
    }
}
