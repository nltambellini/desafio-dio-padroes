public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String numeroConta) {
        super(numeroConta);
    }

    @Override
    protected void notificar(String mensagem) {
        super.notificar("Conta Poupança: " + mensagem);
    }
}