package classes;

import java.util.Scanner;

public class Restaurante extends Empresa{
    private String tipoComida;
    private float precoComida;
    Scanner sc = new Scanner(System.in);
    
    public Restaurante(){
    }

    public Restaurante(String tipoComida, float precoComida, String nome, String endereco, String cidade, String estado, String cep, String fone) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.tipoComida = tipoComida;
        this.precoComida = precoComida;
    }
    
    public void insertData(){
        super.insert();
        System.out.println("Tipo de Comida: ");
        this.tipoComida = sc.nextLine();
        System.out.println("Preco da Comida: ");
        this.precoComida = sc.nextFloat();
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public float getPrecoComida() {
        return precoComida;
    }
    
    public void Print(){
        super.print();
        System.out.println("Tipo de Comida: "+getTipoComida()
                + "\nPreco da Comida: "+getPrecoComida());
    }
}
