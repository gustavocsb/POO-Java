package classes;

public class assassino extends champions {
    private int danoAtaqueAdicional;
    private int letalidade;
    private double penetracaoArmadura;

    public assassino(String nome, String regiao, int vida, int danoAtaqueBase, double velocidadeAtaque, int velocidadeMovimento, int danoAtaqueAdicional, int letalidade, double penetracaoArmadura) {
        super(nome, regiao, vida, danoAtaqueBase, velocidadeAtaque, velocidadeMovimento);
        this.danoAtaqueAdicional = danoAtaqueAdicional;
        this.letalidade = letalidade;
        this.penetracaoArmadura = penetracaoArmadura;
    }

    public int getDanoAtaqueAdicional() {
        return danoAtaqueAdicional;
    }

    public void setDanoAtaqueAdicional(int danoAtaqueAdicional) {
        this.danoAtaqueAdicional = danoAtaqueAdicional;
    }

    public int getLetalidade() {
        return letalidade;
    }

    public void setLetalidade(int letalidade) {
        this.letalidade = letalidade;
    }

    public double getPenetracaoArmadura() {
        return penetracaoArmadura;
    }

    public void setPenetracaoArmadura(double penetracaoArmadura) {
        this.penetracaoArmadura = penetracaoArmadura;
    }
    
    public int calcularDanoAtaque(){
        return getDanoAtaqueBase() + danoAtaqueAdicional;
    }
    
    @Override
    public String toString(){
        return "Nome: "+getNome()
                + "\nRegiao: "+getRegiao()
                + "\nVida: "+getVida()
                + "\nDano de Ataque: "+calcularDanoAtaque()
                + "\nVelocidade de Ataque: "+getVelocidadeAtaque()
                + "\nVelocidade de Movimento: "+getVelocidadeMovimento()
                + "\nLetalidade: "+letalidade
                + "\nPenetracao de Armadura"+penetracaoArmadura;
    }
}
