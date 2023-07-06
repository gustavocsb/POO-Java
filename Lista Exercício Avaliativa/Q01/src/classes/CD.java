package classes;

public class CD extends Midia {
    private int nMusicas;
    
    public CD() {
    }

    public CD(int c, double p, String n, int m) {
        super(c, p, n);
        this.nMusicas = m;
    }
    
    @Override
    public String getTipo() {
        return this.getClass().getSimpleName();
    }
    
    @Override
    public String getDetalhes() {
        return super.getDetalhes()+ "\nNúmero de Músicas: "+getnMusicas();
    }
    
    public void setMusica(int m) {
        this.nMusicas = m;
    }
    
    @Override
    public void inserirDados() {
        super.inserirDados();
        System.out.print("Informe o número de Músicas: ");
        this.nMusicas = sc.nextInt();
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setMusicas(int m) {
        this.nMusicas = m;
    }
    
}
