import java.util.ArrayList;

public class GerenciadorOrdens implements Imprimivel {
    private static ArrayList<OrdemDeServico> ordemDeServicos = new ArrayList<>();

    public void criarOrdem(OrdemDeServico ordem) {
        getOrdemDeServicos().add(ordem);
    }

    public void removerOrdem(OrdemDeServico ordem) {
        getOrdemDeServicos().remove(ordem);
    }

    public OrdemDeServico procurarOrdem(int numeroOrdem) {
        for (OrdemDeServico ordemDeServico : getOrdemDeServicos()) {
            if (ordemDeServico.getNumeroOrdem() == numeroOrdem) {
                return ordemDeServico;
            }
        }
        return null;
    }

    public ArrayList<OrdemDeServico> getOrdemDeServicos() {
        return ordemDeServicos;
    }

    @Override
    public void mostrarDados() {
        for (OrdemDeServico ordemDeServico : getOrdemDeServicos()) {
                ordemDeServico.mostrarDados();
            }
    }
}
