public class OrdemInstalacao extends OrdemDeServico {
    private String cliente;
    private String dataInstalacao;

    public OrdemInstalacao(int numeroOrdem, String descricao, String status, String cliente, String dataInstalacao) {
        super(numeroOrdem, descricao, status);
        this.cliente = cliente;
        this.dataInstalacao = dataInstalacao;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Numero de ordem = " + getNumeroOrdem() + " Descrição = " + getDescricao() + " Status = " + getStatus() +" Cliente = " + getCliente() + " Data de Instalacão = " + getDataInstalacao());
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setDataInstalacao(String dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }

    @Override
    public String toString() {
        return "OrdemInstalacao{" +
                "cliente='" + cliente + '\'' +
                ", dataInstalacao='" + dataInstalacao + '\'' +
                '}';
    }

    public String getCliente() {
        return cliente;
    }

    public String getDataInstalacao() {
        return dataInstalacao;
    }
}