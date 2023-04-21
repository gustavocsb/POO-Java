package classes;

public class cd {
    private String nome;
    private double preco;
    private int numFaixas;

    public cd(String nome, double preco, int numFaixas) {
        this.nome = nome;
        this.preco = preco;
        this.numFaixas = numFaixas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome
                + "\nPreco: "+preco
                + "\nTotal de Faixas: "+numFaixas;
    }
    
}
