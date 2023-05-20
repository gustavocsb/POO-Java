package classes;

import java.util.Scanner;

public class Motor {
    private int NumCilindro;
    private int Potencia;
    Scanner sc = new Scanner(System.in);
    
    public Motor() {
        this.NumCilindro = 0;
        this.Potencia = 0;
    }
    
    public Motor(int NumCilindro, int Potencia) {
        this.NumCilindro = NumCilindro;
        this.Potencia = Potencia;
    }
    
    public void InsertData(){
        System.out.println("Numero de Cilindros: ");
        this.NumCilindro = sc.nextInt();
        System.out.println("Potencia: ");
        this.Potencia = sc.nextInt();
    }
    
    public void Print(){
        System.out.println("Numero de Cilindros: "+this.NumCilindro
                + "\nPotencia: "+this.Potencia);
    }
}
