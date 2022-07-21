package model;

public class Volkswagen extends Carro {


    public Volkswagen(String modelo, String marca, String potencia, String cor) {
        super(modelo, marca, potencia, cor);
    }

    @Override
    public String toString() {
        return "Gol{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia='" + potencia + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
