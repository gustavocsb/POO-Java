package classes;

public class Moto extends Veiculos {
    private int ano;

    public Moto() {
    }
    
    public Moto(String n, double p, int a) {
        super(n, p);
        this.ano = a;
    }
    
    @Override
    public double getPreco() {
        return super.getPreco();
    }

    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        if (ano >= 2008) {
            double precoAtualizado = getPreco() * 1.1;
            setPreco(precoAtualizado);
        }
        this.ano = ano;
    }
    
    @Override
    public void insertData() {
        System.out.println("----- MOTO -----");
        super.insertData();
        System.out.print("Informe o ano: ");
        this.ano = sc.nextInt();
    }
    
    @Override
    public void printDados() {
        System.out.println("--- INFORMAÇÕES DA MOTO ---");
        super.printDados();
        System.out.println("Ano: "+getAno());
    }
}
