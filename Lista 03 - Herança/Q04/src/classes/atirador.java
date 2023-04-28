package classes;

public class atirador extends assassino {
    private double chanceCritico;
    private int danoCritico;
    private double rouboVida;

    public atirador(String nome, String regiao, int vida, int danoAtaqueBase, double velocidadeAtaque, int velocidadeMovimento, int danoAtaqueAdicional, int letalidade, double penetracaoArmadura, double chanceCritico, int danoCritico, double rouboVida) {
        super(nome, regiao, vida, danoAtaqueBase, velocidadeAtaque, velocidadeMovimento, danoAtaqueAdicional, letalidade, penetracaoArmadura);
        this.chanceCritico = chanceCritico;
        this.danoCritico = danoCritico;
        this.rouboVida = rouboVida;
    }

    public double getChanceCritico() {
        return chanceCritico;
    }

    public void setChanceCritico(double chanceCritico) {
        this.chanceCritico = chanceCritico;
    }

    public int getDanoCritico() {
        return danoCritico;
    }

    public void setDanoCritico(int danoCritico) {
        this.danoCritico = danoCritico;
    }

    public double getRouboVida() {
        return rouboVida;
    }

    public void setRouboVida(double rouboVida) {
        this.rouboVida = rouboVida;
    }
    
    @Override
    public String toString(){
        return "Nome: "+getNome()
                + "\nRegiao: "+getRegiao()
                + "\nVida: "+getVida()
                + "\nDano de Ataque: " +calcularDanoAtaque()
                + "\nVelocidade de Ataque: " +getVelocidadeAtaque()
                + "\nVelocidade de Movimento: "+getVelocidadeMovimento()
                + "\nLetalidade: "+getLetalidade()
                + "\nPenetracao de Armadura: "+getPenetracaoArmadura()
                + "\nChance de Critico: "+chanceCritico
                + "\nDano Critico: "+danoCritico
                + "\nRoubo de Vida: "+rouboVida;
    }
}
