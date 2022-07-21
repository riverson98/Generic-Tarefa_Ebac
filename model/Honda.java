package model;

public class Honda extends Carro {

    public Honda(String modelo, String marca, String potencia, String cor) {
        super(modelo, marca, potencia, cor);
    }

    @Override
    public String toString() {
        return "Civic{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia='" + potencia + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
