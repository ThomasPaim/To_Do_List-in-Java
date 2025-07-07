package Lista_Tarefa;

public enum Status {
    CONCLUIDO(1), NAOCOMECO(2), EMADAMENTO(3);

    int statusTarefa;

    Status(int statusTarefa){
        this.statusTarefa = statusTarefa;
    }

    public int getStatusTarefa() {
        return statusTarefa;
    }
    
}
