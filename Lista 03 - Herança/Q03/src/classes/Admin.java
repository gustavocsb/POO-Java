package classes;

public class Admin extends Empregado{
    private double ajudaDeCusto;

    public Admin(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    @Override
    public double calcularSalario(){
        return super.calcularSalario() + ajudaDeCusto;
    }
    
    @Override
    public String toString(){
        return "\n\n--- ADMIN ---\n\nNome: "+getNome()
                + "\nEndereco: "+getEndereco()
                + "\nTelefone:"+getTelefone()
                + "\nCodigo de Setor: "+getCodigoSetor()
                + "\nSalario: "+calcularSalario();   
    }
}
