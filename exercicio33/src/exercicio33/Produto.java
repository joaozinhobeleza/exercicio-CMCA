package exercicio33;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;  
    }

   
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    
    public void aumentarQuantidade(int quantidadeAumentar) {
        if (quantidadeAumentar > 0) {
            this.quantidade += quantidadeAumentar;
        } else {
            System.out.println("A quantidade a aumentar deve ser positiva.");
        }
    }

   
    public void diminuirQuantidade(int quantidadeDiminuir) {
        if (quantidadeDiminuir > 0 && quantidadeDiminuir <= quantidade) {
            this.quantidade -= quantidadeDiminuir;
        } else {
            System.out.println("Quantidade inválida para diminuir.");
        }
    }

   
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}