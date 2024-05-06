import java.util.*;
class Projeto {
    String titulo;
    String status;
    List<Requisito> requisitos = new ArrayList<>();

    public Projeto(String titulo, String status) {
        this.titulo = titulo;
        this.status = status;
    }

    public void adicionarRequisito(Requisito requisito) {
        requisitos.add(requisito);
    }

    public void listarRequisitos() {
        for (Requisito requisito : requisitos) {
            System.out.println(requisito.descricao);
        }
    }
}
