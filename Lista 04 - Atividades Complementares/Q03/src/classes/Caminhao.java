package classes;

public class Caminhao extends Veiculo{
    private float CargaMaximaT;
    private int AlturaMax;
    private int Comprimento;

    public Caminhao() {
        super();
        this.CargaMaximaT = 0.0f;
        this.AlturaMax = 0;
        this.Comprimento = 0;
    }

    public Caminhao(float CargaMaximaT, int AlturaMax, int Comprimento, int PesoKg, int VelMaxKmH, float Preco, int NumCilindro, int Potencia) {
        super(PesoKg, VelMaxKmH, Preco, NumCilindro, Potencia);
        this.CargaMaximaT = CargaMaximaT;
        this.AlturaMax = AlturaMax;
        this.Comprimento = Comprimento;
    }
    
    @Override
    public void InsertData(){
        System.out.println("Carga maxima (Toneladas): ");
        this.CargaMaximaT = sc.nextFloat();
        System.out.println("Altura maxima: ");
        this.AlturaMax = sc.nextInt();
        System.out.println("Comprimento: ");
        this.Comprimento = sc.nextInt();
        super.InsertData();
    }
    
    @Override
    public void Print(){
        System.out.println("Carga maxima (Toneladas): "+this.CargaMaximaT
                + "\nAltura maxima: "+this.AlturaMax
                + "\nComprimento: "+this.Comprimento);
        super.Print();
    }
}
