public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String numeroConta) {
        super(numeroConta);
    }

    @Override
    protected void notificar(String mensagem) {
        super.notificar("Conta Corrente: " + mensagem);
    }
}