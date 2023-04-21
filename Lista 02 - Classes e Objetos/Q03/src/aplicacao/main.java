package aplicacao;

import classes.pessoa;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pessoa p1 = new pessoa(14,3,1879,"Albert Einstein");
        pessoa p2 = new pessoa(4,1,1643,"Isaac Newton");
        
        //calculando a idade baseado no dia 21/04/2023 (entrega da atividade)
        p1.calculaIdade(21,4,2023);
        p2.calculaIdade(21,4,2023);
        
        System.out.println("Informacoes [Objeto 1] com a idade atual:\n"+p1.toString()
                + "\n\nInformacoes [Objeto 2] com a idade atual:\n"+p2.toString()
                );
        
    }
}
