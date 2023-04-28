package classes;

public class tanque extends champions {
    private int armadura;
    private int resistenciaMagica;
    private double regeneracaoVida;
    private int vidaAdicional;

    public tanque(String nome, String regiao, int vida, int danoAtaqueBase, double velocidadeAtaque, int velocidadeMovimento, int armadura, int resistenciaMagica, double regeneracaoVida, int vidaAdicional) {
        super(nome, regiao, vida, danoAtaqueBase, velocidadeAtaque, velocidadeMovimento);
        this.armadura = armadura;
        this.resistenciaMagica = resistenciaMagica;
        this.regeneracaoVida = regeneracaoVida;
        this.vidaAdicional = vidaAdicional;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getResistenciaMagica() {
        return resistenciaMagica;
    }

    public void setResistenciaMagica(int resistenciaMagica) {
        this.resistenciaMagica = resistenciaMagica;
    }

    public double getRegeneracaoVida() {
        return regeneracaoVida;
    }

    public void setRegeneracaoVida(double regeneracaoVida) {
        this.regeneracaoVida = regeneracaoVida;
    }

    public int getVidaAdicional() {
        return vidaAdicional;
    }

    public void setVidaAdicional(int vidaAdicional) {
        this.vidaAdicional = vidaAdicional;
    }
    
    public int calcularVida(){
        return getVida() + vidaAdicional;
    }
    
    @Override
    public String toString(){
        return "Nome: "+getNome()
                + "\nRegiao: "+getRegiao()
                + "\nVida: "+calcularVida()
                + "\nDano de Ataque: "+getDanoAtaqueBase()
                + "\nVelocidade de Ataque: "+getVelocidadeAtaque()
                + "\nVelocidade de Movimento: "+getVelocidadeMovimento()
                + "\nArmadura: "+armadura
                + "\nResistencia Magica: "+resistenciaMagica
                + "\nRegeneracao de Vida: "+regeneracaoVida;
    }
}
