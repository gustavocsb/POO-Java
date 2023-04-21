package classes;

public class dvd {
    private String nome;
    private double preco;
    private int horaDuracao;
    private int minDuracao;

    public dvd(String nome, double preco, int horaDuracao, int minDuracao) {
        this.nome = nome;
        this.preco = preco;
        this.horaDuracao = horaDuracao;
        this.minDuracao = minDuracao;
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

    public int getHoraDuracao() {
        return horaDuracao;
    }

    public void setHoraDuracao(int horaDuracao) {
        this.horaDuracao = horaDuracao;
    }

    public int getMinDuracao() {
        return minDuracao;
    }

    public void setMinDuracao(int minDuracao) {
        this.minDuracao = minDuracao;
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome
                + "\nPreco: "+preco
                + "\nDuracao: "+horaDuracao
                + "h"+minDuracao
                + "min";
    }
    
}
