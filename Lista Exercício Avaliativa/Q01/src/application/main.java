package application;

import classes.CD;
import classes.DVD;

public class main {
    public static void main(String[] args) {
        DVD dvd1 = new DVD();
        CD cd1 = new CD();
        
        dvd1.inserirDados();
        cd1.inserirDados();
        dvd1.printDados();
        cd1.printDados();
    }
}
