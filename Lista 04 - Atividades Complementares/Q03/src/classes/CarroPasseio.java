package classes;

import java.util.Scanner;

public class CarroPasseio extends Veiculo{
    private String Cor;
    private String Modelo;
    Scanner sc = new Scanner(System.in);

    public CarroPasseio() {
        super();
        this.Cor = "";
        this.Modelo = "";
    }

    public CarroPasseio(String Cor, String Modelo, int PesoKg, int VelMaxKmH, float Preco, int NumCilindro, int Potencia) {
        super(PesoKg, VelMaxKmH, Preco, NumCilindro, Potencia);
        this.Cor = Cor;
        this.Modelo = Modelo;
    }
    
    @Override
    public void InsertData(){
        System.out.println("Cor: ");
        this.Cor = sc.nextLine();
        System.out.println("Modelo: ");
        this.Modelo = sc.nextLine();
        super.InsertData();
    }
    
    @Override
    public void Print(){
        System.out.println("Cor: "+this.Cor
                + "\nModelo: "+this.Modelo);
        super.Print();
    }
    
}
