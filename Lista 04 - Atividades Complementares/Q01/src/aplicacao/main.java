package aplicacao;

import classes.rectangle;

public class main {
    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle(10,9);
        
        System.out.println("Length: "+rectangle1.getLength() 
                + "\nWidth: "+rectangle1.getWidth()
                + "\nPerimetro: "+rectangle1.perimetro()
                + "\nArea: "+rectangle1.area());
    }
}
