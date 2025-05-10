package entities;

public class Product
{
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock () {
        return quantity * price;
    }

    public void addProductsQuantity (int quantity) {
        this.quantity += quantity;
    }

    public void removeProductsQuantity (int quantity) {
        this.quantity -= quantity;
    }

    public String toString() { // modifica a funcao padrao da classe Object (todas as classes fazem parte da classe Object)
        return name
                + ", $"
                + price
                + ", Quantity: "
                + quantity
                + ", Total: "
                + totalValueInStock();
    }
}
