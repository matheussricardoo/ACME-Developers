import java.util.*;
class Desenvolvedor {
    String nome;
    String area;
    List<Requisito> tarefas = new ArrayList<>();

    public Desenvolvedor(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }

    public void adicionarTarefa(Requisito requisito) {
        tarefas.add(requisito);
    }

    public void listarTarefas() {
        for (Requisito requisito : tarefas) {
            System.out.println(requisito.descricao);
        }
    }
}