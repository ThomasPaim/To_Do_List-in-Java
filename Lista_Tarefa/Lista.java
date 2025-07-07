package Lista_Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

    Tarefa tarefa;

    Scanner scanner = new Scanner(System.in);
    List<Tarefa> listaTarefa = new ArrayList<>();

    Status status;

    public void criarTarefa() {
        System.out.println("Criar tarefa: ");
        String tarefaString = scanner.nextLine();

        System.out.println("Digite 0 para não iniciado, digite 1 para em andamento, digite 2 para concluído ");
        int statusNew = scanner.nextInt();
 
        if (statusNew == 0) {
            status = Status.NAOCOMECO;
        } else if (statusNew == 1) {
            status = Status.EMADAMENTO;
        } else if (statusNew == 2) {
            status = Status.CONCLUIDO;
        }

        tarefa = new Tarefa(tarefaString, status);

        listaTarefa.add(tarefa);

        display();
    }

    public void excluirTarefa() {
        System.out.println("Digite o índice da tarefa que deseja excluir: ");
        int indiceTarefaExcluir = scanner.nextInt();

        listaTarefa.remove(indiceTarefaExcluir);

        display();

    }

    public void statusTarefa() {

        System.out.println("Digite o índice que deseja alterar o status: ");
        display();

        int statusIndice = scanner.nextInt();
        scanner.nextLine();

        if (statusIndice >= 0 && statusIndice <= listaTarefa.size()) {

            Tarefa tarefa = listaTarefa.get(statusIndice);

            System.out.println("A tarefa concluída C, tarefa em andamento A, não iniciada N");
            String statusString = scanner.nextLine();

            if (statusString.equalsIgnoreCase("C")) {
                status = Status.CONCLUIDO;

            } else if (statusString.equalsIgnoreCase("N")) {
                status = Status.NAOCOMECO;

            } else if (statusString.equalsIgnoreCase("A")) {
                status = Status.EMADAMENTO;
            }

            tarefa.setStatus(status);
            display();

        }

    }

    public void display() {

        for (int i = 0; i < listaTarefa.size(); i++) {
            System.out.println(i + " | " + listaTarefa.get(i));
        }
    }

}
