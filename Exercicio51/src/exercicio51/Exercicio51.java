package exercicio51;

public class Exercicio51 {

    public static void main(String[] args) {
        // TODO code application logic here
        ContaBancaria conta1 = new ContaBancaria("123456", "João Silva");

        
        conta1.exibirInformacoes();

        
        conta1.depositar(500.0);
        conta1.exibirInformacoes();

        
        conta1.sacar(200.0);
        conta1.exibirInformacoes();

        
        conta1.sacar(400.0);
        conta1.exibirInformacoes();
    }
}