package aplicacao;

import classes.assassino;
import classes.atirador;
import classes.suporte;
import classes.mago;
import classes.tanque;

public class main {
    public static void main(String[] args) {
        
        assassino ass1 = new assassino("Qiyana", "Ixtal", 550, 80, 1.15, 340, 150, 35, 20.5);
        atirador adc1 = new atirador("Jinx", "Zaun", 490, 68, 1.48, 325, 110, 0, 35, 80, 180, 15);
        suporte sup1 = new suporte("Yuumi", "Bandopolis", 430, 50, 0.98, 300, 200, 10.5, 1200, 80);
        mago mago1 = new mago("Syndra", "Ionia", 505, 59, 1.06, 330, 520, 7.5, 1400, 100, 55, 0);
        tanque tanq1 = new tanque("Ornn", "Freljord", 630, 69, 1.01, 330, 450, 300, 12, 3500);
        
        System.out.println("-- Assassino --\n"+ass1.toString()
                + "\n\n-- Atirador --\n"+adc1.toString()
                + "\n\n-- Suporte --\n"+sup1.toString()
                + "\n\n-- Mago --\n"+mago1.toString()
                + "\n\n-- Tanque --\n"+tanq1.toString());
    }
}
