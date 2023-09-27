import java.util.ArrayList;

public abstract class Usuario implements CriadorOrdem, EditorOrdem, VisualizadorOrdem {
    private final String cpf;
    private final String nome;
    private static ArrayList<OrdemDeServico> ordemDeServicos = new ArrayList<>();

    public Usuario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public static ArrayList<OrdemDeServico> getOrdemDeServicos() {
        return ordemDeServicos;
    }
}