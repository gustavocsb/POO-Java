package classes;

public class champions {
    private String nome;
    private String regiao;
    private int vida;
    private int danoAtaqueBase;
    private double velocidadeAtaque;
    private int velocidadeMovimento;

    public champions(String nome, String regiao, int vida, int danoAtaqueBase, double velocidadeAtaque, int velocidadeMovimento) {
        this.nome = nome;
        this.regiao = regiao;
        this.vida = vida;
        this.danoAtaqueBase = danoAtaqueBase;
        this.velocidadeAtaque = velocidadeAtaque;
        this.velocidadeMovimento = velocidadeMovimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDanoAtaqueBase() {
        return danoAtaqueBase;
    }

    public void setDanoAtaqueBase(int danoAtaqueBase) {
        this.danoAtaqueBase = danoAtaqueBase;
    }

    public double getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public void setVelocidadeAtaque(double velocidadeAtaque) {
        this.velocidadeAtaque = velocidadeAtaque;
    }

    public int getVelocidadeMovimento() {
        return velocidadeMovimento;
    }

    public void setVelocidadeMovimento(int velocidadeMovimento) {
        this.velocidadeMovimento = velocidadeMovimento;
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome
                + "\nRegiao: "+regiao
                + "\nVida: "+vida
                + "\nDano de Ataque Base: "+danoAtaqueBase
                + "\nVelocidade de Ataque: "+velocidadeAtaque
                + "\nVelocidade de Movimento: "+velocidadeMovimento;
    }
}
