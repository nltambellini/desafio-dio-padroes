import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private List<Observer> observadores;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.observadores = new ArrayList<>();
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        notificar("Depósito de: " + valor);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            notificar("Saque de: " + valor);
        } else {
            notificar("Saldo insuficiente para saque de: " + valor);
        }
    }

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    protected void notificar(String mensagem) {
        for (Observer observador : observadores) {
            observador.atualizar(mensagem);
        }
    }
}


