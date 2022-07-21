package model;

public abstract class Carro {
    String modelo;
    String marca;
    String potencia;
    String cor;

    public Carro(String modelo, String marca, String potencia, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
