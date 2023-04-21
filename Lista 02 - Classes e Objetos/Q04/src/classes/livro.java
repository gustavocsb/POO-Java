package classes;

public class livro {
    private String nome;
    private double preco;
    private String autor;

    public livro(String nome, double preco, String autor) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome
                + "\nPreco: "+preco
                + "\nAutor: "+autor;
    }
    
}
