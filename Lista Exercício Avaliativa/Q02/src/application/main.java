package application;

import classes.Carro;
import classes.Moto;
import classes.Veiculos;

public class main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Moto m1 = new Moto();
        
        c1.insertData();
        m1.insertData();
        
        Veiculos[] veiculos = {c1, m1};
        
        double total = Veiculos.calcularTotalPreco(veiculos);
        for (Veiculos veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                moto.setAno(moto.getAno());
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                carro.setKm(carro.getKm());
            }
        }
        double totalNovo = Veiculos.calcularTotalPreco(veiculos);
        
        System.out.println("Preço total pré-ajustes: "+total);
        System.out.println("Preço total pós-ajustes: "+totalNovo);
    }
}
