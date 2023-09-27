public class OrdemManutencao extends OrdemDeServico {
    private String equipamento;
    private String dataManutencao;

    public OrdemManutencao(int numeroOrdem, String descricao, String status, String equipamento, String dataManutencao) {
        super(numeroOrdem, descricao, status);
        this.equipamento = equipamento;
        this.dataManutencao = dataManutencao;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Numero de ordem = " + getNumeroOrdem() + " Descrição = " + getDescricao() + " Status = " + getStatus() + " Equipamento = " + getEquipamento() + " Data de Manutenção = " + getDataManutencao());
    }

    @Override
    public String toString() {
        return "OrdemManutencao{" +
                "equipamento='" + equipamento + '\'' +
                ", dataManutencao='" + dataManutencao + '\'' +
                '}';
    }

    public String getEquipamento() {
        return equipamento;
    }

    public String getDataManutencao() {
        return dataManutencao;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public void setDataManutencao(String dataManutencao) {
        this.dataManutencao = dataManutencao;
    }
}