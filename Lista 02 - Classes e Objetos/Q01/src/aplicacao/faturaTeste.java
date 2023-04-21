package aplicacao;

import classes.fatura;
import java.util.Scanner;

public class faturaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fatura f1 = new fatura (50);
        
        f1.setNumero("8451924");
        f1.setDesc("Descricao lorem ipsum");
        f1.setQtdItem(72);
        f1.setPrecoItem(55);
        
        System.out.println("--- FATURA ---\nNumero: "+f1.getNumero()
                + "\nDescricao: "+f1.getDesc()
                + "\nQuantidade de Itens: "+f1.getQtdItem()
                + "\nPreco do item: "+f1.getPrecoItem()
                + "\nFatura Total: "+f1.getTotalFatura());
    }
}
