package geometria.figurasplanas;

public class Circulo {
    private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double perimetro() {
        return Math.PI * 2 * this.radio;
    }

    public double area() {
        return Math.PI * this.radio * this.radio;
    }
}
