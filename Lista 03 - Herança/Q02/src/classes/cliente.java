package classes;

public class cliente extends pessoa{
    
    private double valorDivida;
    private int anoNasc;

    public cliente(String nome, int idade, String sexo, double valorDivida, int anoNasc) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNasc = anoNasc;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    @Override
    public String toString(){
        return "\n--- CLIENTE ---\nNome: "+nome
                + "\nIdade: "+idade
                + "\nSexo: "+sexo
                + "\nValor Divida: "+valorDivida
                + "\nAno de Nascimento: "+anoNasc;
    }
}
