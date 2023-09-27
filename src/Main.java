//Nome: Gabriel Fellipe Marquardt
//Turma: MI-72

public class Main {

    static Usuario solicitante = new Solicitante("1", "Pedro");

    static Usuario atendente = new Atendente("1", "Pedro");

    static Usuario administrador = new Administrador("1", "Pedro");

    static OrdemDeServico ordemDeInstalacao = new OrdemInstalacao(1, "Instalar placa mãe", "Finalizado", "José", "22/08/2005");

    static OrdemDeServico ordemDeManutencao = new OrdemManutencao(2, "Fazer a asda da asda asd", "Em andamento", "Placa mãe", "23/08/2005");

    static OrdemDeServico ordemDeManutencao2 = new OrdemManutencao(3, "teste 2", "aaaa", "aaaa", "2a");

    static Relatorio relatorio = new Relatorio();

    static GerenciadorOrdens gerenciadorOrdens = new GerenciadorOrdens();

    public static void main(String[] args) {

//        ordemDeInstalacao.AtualizarStatus("acabouacabouacabouacabou");
//        atendente.criarOrdem(ordemDeInstalacao);
//        atendente.criarOrdem(ordemDeManutencao);
//        atendente.criarOrdem(ordemDeManutencao2);
//        gerenciadorOrdens.mostrarDados();
//        relatorio.gerarRelatorio(ordemDeInstalacao);
//        solicitante.criarOrdem(ordemDeInstalacao);
//        solicitante.verOrdens();
//        solicitante.editarOrdem(1, ordemDeInstalacao);
//        solicitante.verOrdens();
//
//        atendente.criarOrdem(ordemDeManutencao);
//        atendente.verOrdens();
//        atendente.editarOrdem(2, ordemDeManutencao);
//        atendente.verOrdens();
//        administrador.verOrdens();
//        administrador.editarOrdem(1, ordemDeInstalacao);
//        administrador.verOrdens();
//
//        administrador.criarOrdem(ordemDeInstalacao);
//        administrador.verOrdens();
//        relatorio.gerarRelatorio(ordemDeInstalacao);
//        relatorio.gerarRelatorio(ordemDeManutencao);
//        atendente.criarOrdem(ordemDeManutencao2);
//        solicitante.criarOrdem(ordemDeInstalacao);
//        solicitante.criarOrdem(ordemDeManutencao);
//
//        solicitante.verOrdens();
//        solicitante.editarOrdem(1, ordemDeInstalacao);
//        solicitante.verOrdens();
//        solicitante.editarOrdem(3, ordemDeManutencao);
//        solicitante.verOrdens();
//
//
//        atendente.criarOrdem(ordemDeInstalacao);
//        atendente.criarOrdem(ordemDeManutencao2);
//        atendente.verOrdens();
//        atendente.editarOrdem(3, ordemDeManutencao2);
//
//        atendente.criarOrdem(ordemDeInstalacao);
//        atendente.criarOrdem(ordemDeManutencao2);
//        solicitante.verOrdens();

    }
}