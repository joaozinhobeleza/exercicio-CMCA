package exercicio1;

public class Carro {
    String marca;
    String modelo;
    int ano;
    double preco;

    
    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    
    public void exibirInformacoes() {
        System.out.println(marca + " " + modelo + " (" + ano + ") - R$" + preco);
    }
}