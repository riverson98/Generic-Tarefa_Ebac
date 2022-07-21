package service;

import model.Carro;

public class CriaCarroServiceImpl {

    public static Carro criaCarro(String modelo, String marca, String potencia, String cor) {
        return new Carro(
                modelo,
                marca,
                potencia,
                cor
        ) {
        };
    }
}
