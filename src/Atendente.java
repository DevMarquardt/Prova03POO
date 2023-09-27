public class Atendente extends Usuario {
    private final GerenciadorOrdens gerenciadorOrdens = new GerenciadorOrdens();

    public Atendente(String cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public void criarOrdem(OrdemDeServico ordem) {
        gerenciadorOrdens.criarOrdem(ordem);
    }

    public void editarOrdem(int numeroOrdem, OrdemDeServico ordem) {
        for (OrdemDeServico ordemDeServico : gerenciadorOrdens.getOrdemDeServicos()) {
            if (ordemDeServico.getNumeroOrdem() == numeroOrdem) {
                if (ordemDeServico instanceof OrdemManutencao) {
                    ((OrdemManutencao) ordemDeServico).setDataManutencao("10/10/2020");
                    ((OrdemManutencao) ordemDeServico).setEquipamento("atendente");
                } else {
                    ((OrdemInstalacao) ordemDeServico).setDataInstalacao("10/10/2024");
                    ((OrdemInstalacao) ordemDeServico).setCliente("atentedndet");
                }
            }
        }
    }

    @Override
    public void verOrdens() {
        for (OrdemDeServico ordemDeServico : gerenciadorOrdens.getOrdemDeServicos()) {
            System.out.println(ordemDeServico);
        }
    }

}