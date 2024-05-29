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
                    int escolhaIdade = -1;

                    while (escolhaIdade != 0){
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.println("                    Idades\n");
                        System.out.println("             1 : Cliente mais velho");
                        System.out.println("             2 : Cliente mais jovem");
                        System.out.println("      3 : Quantidade de cliente acima de 60 anos");
                        System.out.println("     4 : Quantidade de clientes abaixo de 18 anos");
                        System.out.println("           5 : Idade média dos clientes\n");;
                        System.out.println("                 0 : Voltar\n");

                        //mesma validaçao de la em cima
                        if (input.hasNextInt()) {
                            escolhaIdade = input.nextInt();
                        }else{
                            escolhaBusca = -1;
                            input.nextLine();
                        }

                        switch (escolhaIdade) {
                            case 1:
                                System.out.println(" ");
                                break;
                            case 2:
                                System.out.println(" ");
                                break;
                            case 3:
                                System.out.println(" ");
                                break;
                            case 4:
                                System.out.println(" ");
                                break;
                            case 5:
                                System.out.println(" ");
                                break;
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
                case 3:
                    int escolhaProduto = -1;

                    while (escolhaProduto != 0){
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.println("                    Produtos\n");
                        System.out.println("             1 : Produto mais caro");
                        System.out.println("            2 : Produto mais barato");
                        System.out.println("              3 : Média de preços");
                        System.out.println("       4 : Produtos acima da média de preço\n");
                        System.out.println("                  0 : Voltar\n");

                        //mesma validaçao de la em cima
                        if (input.hasNextInt()) {
                            escolhaProduto = input.nextInt();
                        }else{
                            escolhaProduto = -1;
                            input.nextLine();
                        }

                        switch (escolhaProduto) {
                            case 1:
                                System.out.println(" ");
                                break;
                            case 2:
                                System.out.println(" ");
                                break;
                            case 3:
                                System.out.println(" ");
                                break;
                            case 4:
                                System.out.println(" ");
                                break;
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
                case 4:
                    int escolhaPessoa = -1;

                    while (escolhaPessoa != 0){
                        System.out.println("\n----------------------------------------------------\n");
                        System.out.println("                  Cadastro de pessoas\n");
                        System.out.println(" 1 : Cadastrar clientes         2 : Cadastrar Funncionarios\n");
                        System.out.println("                    0 : Voltar\n");

                        //mesma validaçao de la em cima
                        if (input.hasNextInt()) {
                            escolhaPessoa = input.nextInt();
                        }else{
                            escolhaPessoa = -1;
                            input.nextLine();
                        }

                        switch (escolhaPessoa) {
                            case 1:
                                System.out.println(" ");
                                break;
                            case 2:
                                System.out.println(" ");
                                break;
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
                case 5:
                    System.out.println("\n----------------------------------------------------\n");
                    System.out.println("                  Cadastro de filmes\n");
                    break;
                case 0:
                    System.out.println("\nSaindo...");
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