package Lista_Tarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        String continuar;

        Scanner scanner = new Scanner(System.in);

        do{
            
            System.out.println("O que deseja fazer: ");
            System.out.println("[0] criar | [1] remover | [2] Visualizar | [3] Mudar Status");
            int indice = scanner.nextInt();
            scanner.nextLine();

            switch (indice) {
                case 0:
                    lista.criarTarefa();
                    break;
                case 1:
                    lista.excluirTarefa();
                    break;
                case 2:
                    lista.display();
                    break; 
                case 3:
                    lista.statusTarefa();
                    break; 
            
                default:
                System.out.println("Ação não encontrada! Digite um índice válido");
                    break;
            }

            System.out.println();
            System.out.println("Deseja continuar? [S/N]");
            continuar = scanner.nextLine();

        }while(!continuar.equalsIgnoreCase("n"));

        lista.display();

        scanner.close();
    }
}
