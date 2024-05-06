import java.util.*;
class Requisito {
    int id;
    String descricao;
    Date dataPrevista;
    String status;
    Desenvolvedor responsavel;

    public Requisito(int id, String descricao, Date dataPrevista, String status) {
        this.id = id;
        this.descricao = descricao;
        this.dataPrevista = dataPrevista;
        this.status = status;
    }

    public void atribuirResponsavel(Desenvolvedor responsavel) {
        this.responsavel = responsavel;
    }

    public void concluir() {
        this.status = "Concluído";
    }
}