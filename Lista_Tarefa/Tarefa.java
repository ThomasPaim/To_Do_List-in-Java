package Lista_Tarefa;



public class Tarefa {
    private String tarefa;
    private String data;



    Status status;

    Tarefa(String tarefa, Status status){
        this.tarefa = tarefa;
        this.status = status;
      
    }
   
   public String getTarefa() {
       return tarefa;
   }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data =  data;
    }


    public String display(){
        return " Tarefa : " + tarefa + " | Status : " + status;
    }

    @Override
    public String toString() {
        return display();
    }
    
}
