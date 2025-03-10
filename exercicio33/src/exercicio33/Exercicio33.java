package exercicio33;

public class Exercicio33 {

    public static void main(String[] args) {
        // TODO code application logic here
        Produto produto1 = new Produto("Camiseta", 29.90);

        produto1.exibirInformacoes();  
        produto1.aumentarQuantidade(10);
        produto1.exibirInformacoes();  
        produto1.diminuirQuantidade(3);
        produto1.exibirInformacoes();  
    }

    }
    

