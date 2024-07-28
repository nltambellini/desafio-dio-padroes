import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static Banco instanciaUnica;
    private List<ContaBancaria> contas;

    private Banco() {
        contas = new ArrayList<>();
    }

    public static Banco getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Banco();
        }
        return instanciaUnica;
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }
}
