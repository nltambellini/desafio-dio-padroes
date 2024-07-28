public class ContaFactory {
    public static ContaBancaria criarConta(String tipo, String numeroConta) {
        switch (tipo) {
            case "corrente":
                return new ContaCorrente(numeroConta);
            case "poupanca":
                return new ContaPoupanca(numeroConta);
            default:
                throw new IllegalArgumentException("Tipo de conta desconhecido.");
        }
    }
}