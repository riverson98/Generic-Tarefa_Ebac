package model;

public class Citroen extends Carro{

    public Citroen(String modelo, String marca, String potencia, String cor) {
        super(modelo, marca, potencia, cor);
    }

    @Override
    public String toString() {
        return "model.Citroen{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia='" + potencia + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
