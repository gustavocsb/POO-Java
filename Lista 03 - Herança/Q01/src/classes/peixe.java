package classes;

public class peixe extends animal {
    private String tipoHabitat;

    public peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
    
    @Override
    public String toString(){
        return super.toString()
                + "\nTipo Habitat: " +tipoHabitat;
    }
}
