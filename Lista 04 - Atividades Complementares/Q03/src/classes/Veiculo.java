package classes;

import java.util.Scanner;

public class Veiculo extends Motor{
    private int PesoKg;
    private int VelMaxKmH;
    private float Preco;
    Scanner sc = new Scanner(System.in);
    
    public Veiculo() {
        super();
        this.PesoKg = 0;
        this.VelMaxKmH = 0;
        this.Preco = 0.0f;
        
    }

    public Veiculo(int PesoKg, int VelMaxKmH, float Preco, int NumCilindro, int Potencia) {
        super(NumCilindro, Potencia);
        this.PesoKg = PesoKg;
        this.VelMaxKmH = VelMaxKmH;
        this.Preco = Preco;
    }
    
    @Override
    public void InsertData(){
        System.out.println("Peso (em Kg): ");
        this.PesoKg = sc.nextInt();
        System.out.println("Velocidade Máxima (em Km/h): ");
        this.VelMaxKmH = sc.nextInt();
        super.InsertData();
        System.out.println("Preco: ");
        this.Preco = sc.nextFloat();
    }
    
    @Override
    public void Print(){
        System.out.println("Peso (em Kg): "+this.PesoKg
                + "\nVelocidade Máxima (em Km/h): "+this.VelMaxKmH);
        super.Print();
        System.out.println("Preco: "+this.Preco);
    }
    
}
