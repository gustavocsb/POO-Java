package classes;

public class rectangle {
    private float length =1;
    private float width = 1;

    public rectangle() {
    }
    
    public rectangle(float length, float width){
        setLength(length);
        setWidth(width);
    }
    
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length > 0.0f && length < 20.0f){
            this.length = length;
        }else System.out.println("Length tem que ser um numero de ponto flutuante maior que 0.0 ou menor que 20.0");
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width > 0.0f && width < 20.0f){
        this.width = width;
        }else System.out.println("Width tem que ser um numero de ponto flutuante maior que 0.0 ou menor que 20.0");
    }
    
    //perimetro = 2 lenght + 2 width
    public float perimetro(){
        return 2*(length+width);
    }
    
    public float area(){
        return length*width;
    }

}
