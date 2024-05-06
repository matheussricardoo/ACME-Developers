import java.util.*;
public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev1 = new Desenvolvedor("Jorge", "Desenvolvedor");
        Desenvolvedor dev2 = new Desenvolvedor("Maria", "Desenvolvedor");
        Desenvolvedor dev3 = new Desenvolvedor("Joana", "Desenvolvedor");

        Squad squad = new Squad("Squad 1");
        squad.adicionarMembro(dev1);
        squad.adicionarMembro(dev2);
        squad.adicionarMembro(dev3);

        Projeto projeto = new Projeto("Projeto Final da Disciplina", "Iniciado");
        String[] tarefasDescricoes = {
                "Criar a estrutura do banco de dados",
                "Desenvolver a interface do usuário",
                "Implementar a lógica de negócios",
                "Testar a aplicação",
                "Corrigir bugs",
                "Documentar o projeto"
        };
        for (int i = 0; i < tarefasDescricoes.length; i++) {
            Requisito requisito = new Requisito(i+1, tarefasDescricoes[i], new Date(), "Não iniciado");
            projeto.adicionarRequisito(requisito);
            if (i % 3 == 0) {
                dev1.adicionarTarefa(requisito);
            } else if (i % 3 == 1) {
                dev2.adicionarTarefa(requisito);
            } else {
                dev3.adicionarTarefa(requisito);
            }
        }
        squad.adicionarProjeto(projeto);
        System.out.println("Situação do projeto: " + projeto.status);
        for (Desenvolvedor dev : squad.membros) {
            if (dev.nome.equals("Maria") || dev.nome.equals("Joana")) {
                System.out.println("\nAgenda da " + dev.nome + ":");
            } else {
                System.out.println("\nAgenda do " + dev.nome + ":");
            }
            dev.listarTarefas();
        }
    }
}


