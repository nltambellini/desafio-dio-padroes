public class Main {
    public static void main(String[] args) {
        Banco banco = Banco.getInstance();

        ContaBancaria conta1 = ContaFactory.criarConta("corrente", "12345");
        ContaBancaria conta2 = ContaFactory.criarConta("poupanca", "67890");

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        Cliente cliente1 = new Cliente("Alice");
        Cliente cliente2 = new Cliente("Bob");

        conta1.adicionarObservador(cliente1);
        conta1.adicionarObservador(cliente2);

        conta1.depositar(1000);
        conta1.sacar(500);

        conta2.adicionarObservador(cliente1);
        conta2.depositar(2000);
        conta2.sacar(3000);
    }
}
