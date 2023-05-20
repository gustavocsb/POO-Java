package classes;

import java.util.Scanner;

public class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;
    Scanner sc = new Scanner(System.in);
    
    public Empresa(){
    }
    
    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    public void insert(){
        System.out.println("Nome: ");
        this.nome = sc.nextLine();
        System.out.println("Endereco: ");
        this.endereco = sc.nextLine();
        System.out.println("Cidade: ");
        this.cidade = sc.nextLine();
        System.out.println("Estado: ");
        this.estado = sc.nextLine();
        System.out.println("CEP: ");
        this.cep = sc.nextLine();
        System.out.println("Fone: ");
        this.fone = sc.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getFone() {
        return fone;
    }
    
    public void print(){
        System.out.println("\nNome: "+getNome()
                + "\nEndereco: "+getEndereco()
                + "\nCidade: "+getCidade()
                + "\nEstado: "+getEstado()
                + "\nCEP: "+getCep()
                + "\nFone: "+getFone());
    }
}
