package aplicacao;

import classes.livro;
import classes.cd;
import classes.dvd;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        livro l1 = new livro("Java para Iniciantes",117.99,"Herbert Schildt");
        livro l2 = new livro("Código limpo: Habilidades práticas do Agile Software",89.90,"Robert C. Martin");
        cd c1 = new cd("CD PINK FLOYD - THE DIVISIONS BELL",34.99,11);
        cd c2 = new cd("Iowa-Special Edition",208.95,18);
        dvd d1 = new dvd("Her",64.90,2,6);
        dvd d2 = new dvd("Taxi Driver",59.90,1,54);
        
        System.out.println("-------- LOJA --------\nCATALOGO\n\nLivros:\n"+l1.toString()
                + "\n\n"+l2.toString()
                + "\n\n\nCDs:\n"+c1.toString()
                + "\n\n"+c2.toString()
                + "\n\n\nDVDs:\n"+d1.toString()
                + "\n\n"+d2.toString()
                + "\n\n------------------------");
        
    }
}
