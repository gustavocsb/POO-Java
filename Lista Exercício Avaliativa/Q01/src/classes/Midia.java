package classes;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    Scanner sc = new Scanner(System.in);
    
    public Midia() {
    }

    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }
    
    public String getTipo() { //Retorna uma String com o nome da classe.
        return this.getClass().getSimpleName();
    }
    
    public String getDetalhes() { //Retorna uma String com as informações contidas nos campos.
        return "Código: "+getCodigo()
                + "\nPreço: "+getPreco()
                + "\nNome: "+getNome();
    }
    
    /*
    printDados:
    Imprime as informações contidas nos campos da classe. Para tanto, usa dois métodos para recuperar estas informações:
    getTipo() e getDetalhes(). Estas funções por sua vez são polimórficas, ou seja, seu tipo retorno varia de acordo com
    a classe escolhida, tal que este método é sobreposto nas subclasses.
    */
    public void printDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println(getDetalhes());
    }
    
    /*
    inserirDados:
    Insere os dados necessários para se preencher os campos de um objeto de uma dada classe. 
    Seu comportamento é polimórfico.
    */
    public void inserirDados() {
        System.out.print("Informe o código: ");
        this.codigo = sc.nextInt();
        System.out.print("Informe o preço: ");
        this.preco = sc.nextDouble();
        sc.nextLine();
        System.out.print("Informe o nome: ");
        this.nome = sc.nextLine();
    }

    /*
    Além dos métodos descritos na Tabela 1.1, deverão ser criados os métodos get e set correspondentes para retornar e 
    modificar o conteúdo dos campos, respectivamente, bem como os construtores com e sem parâmetros de cada classe. 
    Criar um programa que simule o uso de um cadastro de CD e DVDs.
    */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
