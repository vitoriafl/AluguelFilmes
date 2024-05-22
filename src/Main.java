import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int escolha = -1;

        while (escolha != 0){
            System.out.println("\n" +
                    " _______ _________ _        _______  _______  _______ \n" +
                    "(  ____ \\\\__   __/( \\      (       )(  ___  )(  ___  )\n" +
                    "| (    \\/   ) (   | (      | () () || (   ) || (   ) |\n" +
                    "| (__       | |   | |      | || || || (___) || |   | |\n" +
                    "|  __)      | |   | |      | |(_)| ||  ___  || |   | |\n" +
                    "| (         | |   | |      | |   | || (   ) || |   | |\n" +
                    "| )      ___) (___| (____/\\| )   ( || )   ( || (___) |\n" +
                    "|/       \\_______/(_______/|/     \\||/     \\|(_______)\n" +
                    "                                                      ");
            System.out.println("            |  1 : Busca              |");
            System.out.println("            |  2 : Idades             |");
            System.out.println("            |  3 : Preco de produtos  |");
            System.out.println("            |  0 : Sair               |");
            escolha = input.nextInt();

            switch (escolha){
                case 1:
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Escolha invalida");
                    break;
            }

        }
    }
}