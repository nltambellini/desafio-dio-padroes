public class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void atualizar(String mensagem) {
        System.out.println("Cliente " + nome + " recebeu notificação: " + mensagem);
    }
}