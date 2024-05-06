import java.util.*;
class Squad {
    String designacao;
    List<Desenvolvedor> membros = new ArrayList<>();
    List<Projeto> projetos = new ArrayList<>();

    public Squad(String designacao) {
        this.designacao = designacao;
    }

    public void adicionarMembro(Desenvolvedor desenvolvedor) {
        membros.add(desenvolvedor);
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public void listarMembros() {
        for (Desenvolvedor desenvolvedor : membros) {
            System.out.println(desenvolvedor.nome);
        }
    }

    public void listarProjetos() {
        for (Projeto projeto : projetos) {
            System.out.println(projeto.titulo);
        }
    }
}