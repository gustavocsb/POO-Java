package classes;

public class Carro extends Veiculos {
    private double km;

    public Carro() {
    }

    public Carro(String n, double p, double k) {
        super(n, p);
        this.km = k;
    }
    
    @Override
    public double getPreco() {
        return super.getPreco();
    }

    public double getKm() {
        return km;
    }
    
    public void setKm(double km) {
        if (km > 100000) {
            double precoAtualizado = getPreco() * 0.92;
            setPreco(precoAtualizado);
        }
        this.km = km;
    }
    
    @Override
    public void insertData() {
        System.out.println("----- CARRO -----");
        super.insertData();
        System.out.print("Informe o km: ");
        this.km = sc.nextDouble();
    }
    
    @Override
    public void printDados() {
        System.out.println("--- INFORMAÇÕES DO CARRO ---");
        super.printDados();
        System.out.println("Km: "+getKm());
    }
}
