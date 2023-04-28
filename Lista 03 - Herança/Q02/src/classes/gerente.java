package classes;

public class gerente extends empregado{
    private String nomeGerencia;

    public gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    
    @Override
    public String toString(){
        return "\n--- GERENTE ---\nNome: "+nome
                + "\nIdade: "+idade
                + "\nMatricula: "+matricula
                + "\nNome Gerencia: "+nomeGerencia
                + "\nValor INSS: "+valorInss();
    }
}
