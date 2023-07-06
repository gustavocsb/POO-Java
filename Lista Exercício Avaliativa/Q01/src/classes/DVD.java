package classes;

public class DVD extends Midia {
    private int nFaixas;

    public DVD() {
    }
    
    public DVD(int c, double p, String n, int f) {
        super(c, p, n);
        this.nFaixas = f;
    }
    
    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }
    
    @Override
    public String getDetalhes() {
        return super.getDetalhes()+ "\nNúmero de Faixas: "+getnFaixas();
    }
    
    public void setFaixas(int f) {
        this.nFaixas = f;
    }
    
    @Override
    public void inserirDados() {
        super.inserirDados();
        System.out.print("Informe o número de Faixas: ");
        this.nFaixas = sc.nextInt();
    }

    public int getnFaixas() {
        return nFaixas;
    }
    
}
