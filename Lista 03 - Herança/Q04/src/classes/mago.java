package classes;

public class mago extends suporte {
    private double penetracaoMagica;
    private double vampirismoMagico;

    public mago(String nome, String regiao, int vida, int danoAtaqueBase, double velocidadeAtaque, int velocidadeMovimento, int poderHabilidade, double regenMana, int mana, int reducaoRecargaHabilidade, double penetracaoMagica, double vampirismoMagico) {
        super(nome, regiao, vida, danoAtaqueBase, velocidadeAtaque, velocidadeMovimento, poderHabilidade, regenMana, mana, reducaoRecargaHabilidade);
        this.penetracaoMagica = penetracaoMagica;
        this.vampirismoMagico = vampirismoMagico;
    }

    public double getPenetracaoMagica() {
        return penetracaoMagica;
    }

    public void setPenetracaoMagica(double penetracaoMagica) {
        this.penetracaoMagica = penetracaoMagica;
    }

    public double getVampirismoMagico() {
        return vampirismoMagico;
    }

    public void setVampirismoMagico(double vampirismoMagico) {
        this.vampirismoMagico = vampirismoMagico;
    }
    
    public String toString(){
        return "Nome: "+getNome()
                + "\nRegiao: "+getRegiao()
                + "\nVida: "+getVida()
                + "\nDano de Ataque: "+getDanoAtaqueBase()
                + "\nVelocidade de Ataque: "+getVelocidadeAtaque()
                + "\nVelocidade de Movimento: "+getVelocidadeMovimento()
                + "\nPoder de Habilidade: "+getPoderHabilidade()
                + "\nRegeneracao de Mana: "+getRegenMana()
                + "\nMana: "+getMana()
                + "\nReducao Recarga abilidade: "+getReducaoRecargaHabilidade()
                + "\nPenetracao Magica: "+penetracaoMagica
                + "\nVampirismo Magico: "+vampirismoMagico;
    }
}
