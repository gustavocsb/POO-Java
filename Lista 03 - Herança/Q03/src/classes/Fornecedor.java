package classes;

public class Fornecedor extends Pessoa {
    
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }    
    
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public double obterSaldo(){
        return this.valorCredito - this.valorDivida;
    }
    
    @Override
    public String toString(){
        return "\n\n--- FORNECEDOR ---\n\nNome: "+getNome()
                + "\nEndereco: "+getEndereco()
                + "\nTelefone: "+getTelefone()
                + "\nCredito: "+valorCredito
                + "\nDivida: "+valorDivida
                + "\nSaldo: "+obterSaldo();
    }
}
