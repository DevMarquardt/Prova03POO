public class Administrador extends Usuario implements RemovedorOrdem {

    private final GerenciadorOrdens gerenciadorOrdens = new GerenciadorOrdens();

    public Administrador(String cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public void criarOrdem(OrdemDeServico ordem) {
        gerenciadorOrdens.criarOrdem(ordem);
    }

    @Override
    public void editarOrdem(int numeroOrdem, OrdemDeServico ordem) {
        for (OrdemDeServico ordemDeServico : gerenciadorOrdens.getOrdemDeServicos()) {
            if (ordemDeServico.getNumeroOrdem() == numeroOrdem) {
                if (ordemDeServico instanceof OrdemManutencao) {
                    ((OrdemManutencao) ordemDeServico).setDataManutencao("1231230");
                    ((OrdemManutencao) ordemDeServico).setEquipamento("admin");
                } else {
                    ((OrdemInstalacao) ordemDeServico).setDataInstalacao("312123");
                    ((OrdemInstalacao) ordemDeServico).setCliente("admin2222");
                }
            }
        }
    }

    @Override
    public void deletarOrdem(int numeroOrdem) {
        gerenciadorOrdens.removerOrdem(gerenciadorOrdens.procurarOrdem(numeroOrdem));
    }

    @Override
    public void verOrdens() {
        for (OrdemDeServico ordemDeServico : gerenciadorOrdens.getOrdemDeServicos()) {
            System.out.println(ordemDeServico);
        }
    }
}