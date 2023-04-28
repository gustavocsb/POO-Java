package aplicacao;

import java.util.Scanner;
import classes.animal;
import classes.peixe;
import classes.cachorro;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        animal a1 = new animal("Macaco",65.9);
        peixe p1 = new peixe("Salmao",3.8,"agua salgada");
        cachorro c1 = new cachorro("Makeda",30.5,"Leao da Rodesia");
        
        System.out.println("Animal:\n"+a1.toString()
                + "\n\nPeixe:\n"+p1.toString()
                + "\n\nCachorro:\n"+c1.toString());
        
    }
}
