class Carro {

    String marca;
    String modelo;
    String cor;
    int ano;
    int velocidade;

    void ligar() {
        System.out.println("Carro ligado");
    }

    void acelerar(int valor) {
        velocidade += valor;
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    void frear(int valor) {
        velocidade -= valor;

        if (velocidade < 0) {
            velocidade = 0;
        }

        System.out.println("Freou para " + velocidade + " km/h");
    }

    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.marca = "Honda";
        carro1.modelo = "Civic";
        carro1.cor = "Preto";
        carro1.ano = 2020;

        carro1.ligar();
        carro1.acelerar(60);

        carro1.mostrarDados();

        System.out.println("-----");

        Carro carro2 = new Carro();

        carro2.marca = "Toyota";
        carro2.modelo = "Supra";
        carro2.cor = "Laranja";
        carro2.ano = 1998;

        carro2.ligar();
        carro2.acelerar(120);
        carro2.frear(20);

        carro2.mostrarDados();
    }
}