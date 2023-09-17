package application;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String novaTarefa = scanner.nextLine();
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    if (!tarefas.isEmpty()) {
                        System.out.println("Tarefas disponíveis para remoção:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                        System.out.print("Digite o número da tarefa a ser removida: ");
                        int numeroTarefa = scanner.nextInt();
                        if (numeroTarefa >= 1 && numeroTarefa <= tarefas.size()) {
                            tarefas.remove(numeroTarefa - 1);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Número de tarefa inválido.");
                        }
                    } else {
                        System.out.println("Não há tarefas para remover.");
                    }
                    break;

                case 3:
                    if (!tarefas.isEmpty()) {
                        System.out.println("Lista de Tarefas:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    } else {
                        System.out.println("Não há tarefas disponíveis.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do aplicativo de gerenciamento de tarefas.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

