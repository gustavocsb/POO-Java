package classes;

public class vendedor extends empregado{
    private double valorVendas;
    private int qtdVendas;

    public vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int qtdVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qtdVendas = qtdVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    @Override
    public String toString(){
        return "\n--- VENDEDOR ---\nNome: "+nome
                + "\nSalario: "+salario
                + "\nValor das Vendas: "+valorVendas
                + "\nQuantidade de Vendas: "+qtdVendas;
    }
    
}
