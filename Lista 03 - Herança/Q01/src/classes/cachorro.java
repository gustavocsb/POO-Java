package classes;

public class cachorro extends animal {
    private String raca;

    public cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public String toString(){
        return super.toString()
                + "\nRaca: " +raca;
    }
}
