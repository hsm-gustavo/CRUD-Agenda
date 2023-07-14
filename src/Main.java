import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        boolean controle = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Agenda de Contatos\n1 - Criar\n2 - Ler\n3 - Atualizar contato\n4 - Remover contato\n0 - Sair\n");
            int opt = Integer.parseInt(scanner.nextLine());
            
            switch (opt) {
                case 1 -> {

                    System.out.println("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o telefone de " + nome + ":");
                    String phone = scanner.nextLine();
                    System.out.println("Digite a idade de " + nome + ":");
                    String ageString = scanner.nextLine();
                    int age = ageString.isEmpty() ? 0 : Integer.parseInt(ageString);
                    System.out.println("Digite o endereço de " + nome + ":");
                    String addr = scanner.nextLine();

                    agenda.create(nome, phone, age, addr);


                }
                case 2 -> {
                    agenda.read();

                }
                case 3 -> {
                    System.out.println("Digite o índice do contato que deseja atualizar: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    System.out.println("Digite o novo nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o novo telefone: ");
                    String phone = scanner.nextLine();
                    System.out.println("Digite a nova idade: ");
                    String ageString = scanner.nextLine();
                    int age = ageString.isEmpty() ? 0 : Integer.parseInt(ageString);
                    System.out.println("Digite o novo endereço: ");
                    String addr = scanner.nextLine();
                    
                    agenda.update(index, nome, phone, age, addr);

                }

                case 4 -> {
                    System.out.println("Digite o índice do contato que deseja remover: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    agenda.delete(index);
                }

                default -> {
                    scanner.close();
                    System.out.println("Até logo!");
                    controle = false;

                }
            }

        } while (controle);

    }
       
}