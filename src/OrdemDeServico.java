public abstract class OrdemDeServico implements Imprimivel {
    private final int numeroOrdem;
    private String descricao;
    private String status;

    public OrdemDeServico(int numeroOrdem, String descricao, String status) {
        this.numeroOrdem = numeroOrdem;
        this.descricao = descricao;
        this.status = status;
    }

    public void AtualizarStatus(String novoStatus) {
        setStatus(novoStatus);
    }

    public int getNumeroOrdem() {
        return numeroOrdem;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }
}