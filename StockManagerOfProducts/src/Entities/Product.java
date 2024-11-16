package Entities;


import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private Scanner read;

    // Construtor para inicializar o produto com dados
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Calcula o valor total no estoque sem precisar de um atributo adicional
    public double totalValueInStock(){
        return price * quantity;
    }

    // Métodos para adicionar e remover produtos
    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }


    // toString para exibir o objeto de forma amigável
    @Override
    public String toString() {
        return "Product:" +
                "  \nname = '" + name + '\'' +
                ", \nprice = R$" + price +
                ", \nquantity = " + quantity +
                ", \ntotal Value In Stock = R$ " + totalValueInStock();
    }
}
