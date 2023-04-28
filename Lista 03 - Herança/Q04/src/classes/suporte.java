package classes;

public class suporte extends champions {
    private int poderHabilidade;
    private double regenMana;
    private int mana;
    private int reducaoRecargaHabilidade;

    public suporte(String nome, String regiao, int vida, int danoAtaqueBase, double velocidadeAtaque, int velocidadeMovimento, int poderHabilidade, double regenMana, int mana, int reducaoRecargaHabilidade) {
        super(nome, regiao, vida, danoAtaqueBase, velocidadeAtaque, velocidadeMovimento);
        this.poderHabilidade = poderHabilidade;
        this.regenMana = regenMana;
        this.mana = mana;
        this.reducaoRecargaHabilidade = reducaoRecargaHabilidade;
    }

    public int getPoderHabilidade() {
        return poderHabilidade;
    }

    public void setPoderHabilidade(int poderHabilidade) {
        this.poderHabilidade = poderHabilidade;
    }

    public double getRegenMana() {
        return regenMana;
    }

    public void setRegenMana(double regenMana) {
        this.regenMana = regenMana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getReducaoRecargaHabilidade() {
        return reducaoRecargaHabilidade;
    }

    public void setReducaoRecargaHabilidade(int reducaoRecargaHabilidade) {
        this.reducaoRecargaHabilidade = reducaoRecargaHabilidade;
    }
    
    @Override
    public String toString(){
        return "Nome: "+getNome()
                + "\nRegiao: "+getRegiao()
                + "\nVida: "+getVida()
                + "\nDano de Ataque: "+getDanoAtaqueBase()
                + "\nVelocidade de Ataque: "+getVelocidadeAtaque()
                + "\nVelocidade de Movimento: "+getVelocidadeMovimento()
                + "\nPoder de Habilidade: "+poderHabilidade
                + "\nRegeneracao de Mana: "+regenMana
                + "\nMana: "+mana
                + "\nReducao Recarga Habilidade: "+reducaoRecargaHabilidade;
    }
}
