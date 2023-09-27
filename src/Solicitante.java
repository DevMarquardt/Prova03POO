public class Solicitante extends Usuario {

    private final GerenciadorOrdens gerenciadorOrdens = new GerenciadorOrdens();

    public Solicitante(String cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public void criarOrdem(OrdemDeServico ordem) {
        Usuario.getOrdemDeServicos().add(ordem);
        getGerenciadorOrdens().criarOrdem(ordem);
    }

    @Override
    public void editarOrdem(int numeroOrdem, OrdemDeServico ordem) {
        for (OrdemDeServico ordemDeServico : getGerenciadorOrdens().getOrdemDeServicos()) {
            if (ordemDeServico.getNumeroOrdem() == numeroOrdem) {
                if (ordemDeServico instanceof OrdemManutencao) {
                    ((OrdemManutencao) ordemDeServico).setDataManutencao("10/10/2020");
                    ((OrdemManutencao) ordemDeServico).setEquipamento("Bobina");
                    ordemDeServico.setDescricao("asdasdasdasda");
                } else {
                    ((OrdemInstalacao) ordemDeServico).setDataInstalacao("10/10/2024");
                    ((OrdemInstalacao) ordemDeServico).setCliente("Rodinei");
                    ordemDeServico.setDescricao("fdf4asd21");
                }
            }
        }
    }

    public GerenciadorOrdens getGerenciadorOrdens() {
        return gerenciadorOrdens;
    }

    @Override
    public void verOrdens() {
        gerenciadorOrdens.mostrarDados();
    }
}