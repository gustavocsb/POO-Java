package classes;

import java.util.Scanner;

public class Veiculos {
    private String modelo;
    private double preco;

    Scanner sc = new Scanner (System.in);
    
    public Veiculos() {
    }

    public Veiculos(String name, double preco) {
        this.modelo = name;
        this.preco = preco;
    }

    public static double calcularTotalPreco(Veiculos[] veiculos) {
        double total = 0.0;
        for (Veiculos veiculo : veiculos) {
            total += veiculo.getPreco();
        }
        return total;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void printDados() {
        System.out.println("Modelo: "+getModelo()
                + "Preço: "+getPreco());
    }

    public void insertData() {
        System.out.print("Informe o modelo: ");
        this.modelo = sc.nextLine();
        System.out.print("Informe o preço: ");
        this.preco = sc.nextDouble();
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
