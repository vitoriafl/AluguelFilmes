import java.util.Scanner;

public class Main {
    private static Scanner input =new Scanner(System.in);

    public static void main(String[] args) {
        int escolha = -1;

        //o while(true) é só um loop infinito, ai o usuario sai usando o System.exit() no lugar de quebrar o loop
        while (true) {
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
            System.out.println("\n               1 : Buscar");
            System.out.println("               2 : Idades");
            System.out.println("               3 : Preço de produtos");
            System.out.println("               4 : Cadastrar pessoas");
            System.out.println("               5 : Cadastrar filmes");
            System.out.println("               0 : Sair\n");

            //isso aqui serve como uma validaçao do input basicamente
            //o hasNextInt vê se tem algum int disponivel pra n dar mismatchExeption
            if (input.hasNextInt()) {
                escolha = input.nextInt();
            }else{
                //ai aqui ele só reseta a variavel
                escolha = -1;
                //e isso aqui É CRUCIAL
                //o codigo n tava funcionando sem isso e ele só ficava em loop infinito
                //funciona tipo ele ngc de clear buffer em C
                input.nextLine();
            }

            switch (escolha) {
                case 1:
                    //toda a estrutura ta pronta só falta fazer os metodos
                    //dps eu qro destrinchar tudo isso aqui dps, pq esse codigo ta mto feioooo senhor amado
                    int escolhaBusca = -1;

                    //loop normal msm, pra n sair da opçao de busca
                    while (escolhaBusca != 0) {
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.println("                    Busca\n");
                        System.out.println("             1 : Clientes");
                        System.out.println("             2 : Funcionarios");
                        System.out.println("             3 : Filmes por descrição");
                        System.out.println("             4 : Filmes por titulo");
                        System.out.println("             5 : Filmes por código\n");;
                        System.out.println("                 0 : Voltar\n");

                        //mesma validaçao de la em cima
                        if (input.hasNextInt()) {
                            escolhaBusca = input.nextInt();
                        }else{
                            escolhaBusca = -1;
                            input.nextLine();
                        }

                        switch (escolhaBusca) {
                            case 1:
                                System.out.println("busca de clientes");
                                break;
                            case 2:
                                System.out.println("busca de funcionarios");
                                break;
                            case 3:
                                System.out.println("filmes por descricao");
                                break;
                            case 4:
                                System.out.println("filmes por titulo");
                                break;
                            case 5:
                                System.out.println("filmes por codigo");
                            case 0:
                                System.out.println("\nVoltando ao menu...");
                                System.out.println("\n----------------------------------------------------\n");
                                break;
                            default:
                                System.out.println("Escolha invalida");
                                break;
                        }

                    }
                    break;
                case 2:
                    System.out.println("\n----------------------------------------------------\n");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\n----------------------------------------------------\n");
                    break;
                case 0:
                    System.out.println("\n\n");
                    System.out.println("Saindo...");
                    //sai do programa
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\n");
                    System.out.println("Escolha invalida");
                    break;
            }
        }

    }
}