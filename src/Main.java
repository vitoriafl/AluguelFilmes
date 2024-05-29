

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner input =new Scanner(System.in);
    Cliente c = new Cliente();

    public static void main(String[] args) {
        //cadastrando clientes p nao nos matarmos
        Cliente c1 = new Cliente("Ana", 65, 1001001001, 1999901, "Rua 1", "ana@gmail.com");
        Cliente c2 = new Cliente("Bernardo", 34, 1001001002, 1999902, "Rua 2", "bernardo@gmail.com");
        Cliente c3 = new Cliente("Carlos", 45, 1001001003L, 1999903, "Rua 3", "carlos@gmail.com");
        Cliente c4 = new Cliente("Daniela", 28, 1001001004, 1999904, "Rua 4", "daniela@gmail.com");
        Cliente c5 = new Cliente("Eduardo", 55, 1001001005, 1999905, "Rua 5", "eduardo@gmail.com");
        Cliente c6 = new Cliente("Fernanda", 22, 1001001006, 1999906, "Rua 6", "fernanda@gmail.com");
        Cliente c7 = new Cliente("Gabriel", 39, 1001001007, 1999907, "Rua 7", "gabriel@gmail.com");
        Cliente c8 = new Cliente("Helena", 31, 1001001008, 1999908, "Rua 8", "helena@gmail.com");
        Cliente c9 = new Cliente("Igor", 27, 1001001009, 1999909, "Rua 9", "igor@gmail.com");
        Cliente c10 = new Cliente("Juliana", 52, 1001001010, 1999910, "Rua 10", "juliana@gmail.com");
        Cliente c11 = new Cliente("Kleber", 60, 1001001011, 1999911, "Rua 11", "kleber@gmail.com");
        Cliente c12 = new Cliente("Larissa", 33, 1001001012 ,1999912, "Rua 12", "larissa@gmail.com");
        Cliente c13 = new Cliente("Marina", 12, 1001001013, 1999913, "Rua 13", "marina@gmail.com");
        Cliente c14 = new Cliente("Lucas", 15, 1001001014, 1999914, "Rua 14", "lucas@gmail.com");
        Cliente c15 = new Cliente("Paula", 17, 1001001015, 1999915, "Rua 15", "paula@gmail.com");
        Cliente c16 = new Cliente("Sofia", 82, 1001001016, 1999916, "Rua 16", "sofia@gmail.com");
        Cliente c17 = new Cliente("Tomás", 74, 1001001017, 1999917, "Rua 17", "tomas@gmail.com");
        Cliente c18 = new Cliente("Beatriz", 90, 1001001018, 1999918, "Rua 18", "beatriz@gmail.com");
        Cliente c19 = new Cliente("Vinícius", 26, 1001001019, 1999919, "Rua 19", "vinicius@gmail.com");
        Cliente c20 = new Cliente("Júlio", 42, 1001001020, 1999920, "Rua 20", "julio@gmail.com");
        Cliente c21 = new Cliente("Renata", 53, 1001001021, 1999921, "Rua 21", "renata@gmail.com");
        Cliente c22 = new Cliente("André", 38, 1001001022, 1999922, "Rua 22", "andre@gmail.com");
        Cliente c23 = new Cliente("Clara", 47, 1001001023, 1999923, "Rua 23", "clara@gmail.com");
        Cliente c24 = new Cliente("Rafael", 29, 1001001024, 1999924, "Rua 24", "rafael@gmail.com");
        Cliente c25 = new Cliente("Bruna", 36, 1001001025, 1999925, "Rua 25", "bruna@gmail.com");

        //cadastrando funcionários p não nos matarmos
        Funcionario f1 = new Funcionario("Joaquim", 56, 2002002001, 2000, "joaquimf@empresa.br", "Rua A", 19989001);
        Funcionario f2 = new Funcionario("Joana", 39, 2002002002, 1000, "joanaf@empresa.br", "Rua B", 19989002);
        Funcionario f3 = new Funcionario("Mariana", 45, 2002002003, 1500, "marianaf@empresa.br", "Rua C", 19989003);
        Funcionario f4 = new Funcionario("Ricardo", 48, 2002002004, 1800, "ricardof@empresa.br", "Rua D", 19989004);
        Funcionario f5 = new Funcionario("Patrícia", 33, 2002002005, 1200, "patriciaf@empresa.br", "Rua E", 19989005);
        Funcionario f6 = new Funcionario("Fernando", 50, 2002002006, 2200, "fernandof@empresa.br", "Rua F", 19989006);
        Funcionario f7 = new Funcionario("Carla", 41, 2002002007, 1900, "carlaf@empresa.br", "Rua G", 19989007);
        Funcionario f8 = new Funcionario("Roberto", 37, 2002002008, 1600, "robertof@empresa.br", "Rua H", 19989008);

        //cadastrando filmes p nao nos matarmos
        Filme.cadastrarFilme("Titanic", 1, 195, 15.0, "Drama/Romance");
        Filme.cadastrarFilme("Matrix", 2, 136, 12.5, "Ficção Científica/Ação");
        Filme.cadastrarFilme("O Poderoso Chefão", 3, 175, 18.0, "Crime/Drama");
        Filme.cadastrarFilme("Interestelar", 4, 169, 14.0, "Ficção Científica/Aventura");
        Filme.cadastrarFilme("Harry Potter e a Pedra Filosofal", 5, 152, 10.0, "Fantasia/Aventura");
        Filme.cadastrarFilme("Senhor dos Anéis: A Sociedade do Anel", 6, 178, 13.5, "Fantasia/Aventura");
        Filme.cadastrarFilme("Vingadores: Ultimato", 7, 181, 20.0, "Ação/Ficção Científica");
        Filme.cadastrarFilme("Pantera Negra", 8, 134, 18.0, "Ação/Aventura");
        Filme.cadastrarFilme("Frozen II", 9, 103, 15.0, "Animação/Aventura");
        Filme.cadastrarFilme("Joker", 10, 122, 16.0, "Drama/Thriller");
        Filme.cadastrarFilme("Toy Story 4", 11, 100, 14.0, "Animação/Comédia");
        Filme.cadastrarFilme("O Rei Leão", 12, 118, 17.0, "Animação/Aventura");
        Filme.cadastrarFilme("A Origem", 13, 148, 16.0, "Ação/Ficção Científica");
        Filme.cadastrarFilme("O Senhor dos Anéis: O Retorno do Rei", 14, 201, 18.0, "Fantasia/Aventura");
        Filme.cadastrarFilme("Homem-Aranha: Longe de Casa", 15, 129, 19.0, "Ação/Aventura");
        Filme.cadastrarFilme("Forrest Gump", 16, 142, 12.0, "Drama/Romance");


        Main o = new Main(); //instancia necessatia para usar metodos da classe main
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
            }
            else{
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
                    //eu vih, comecei a fazer o sistema de busca na classe cliente
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
                                int escolha2 = -1;

                                while (escolha2 != 0) {
                                    System.out.println("\n----------------------------------------------------\n");
                                    System.out.println("                   Busca de Clientes\n");
                                    System.out.println(" 1 : Busca por Nome");
                                    System.out.println(" 0 : Voltar");


                                    //mesma validaçao de la em cima
                                    if (input.hasNextInt()) {
                                        escolha2 = input.nextInt();
                                    } else {
                                        escolhaBusca = -1;
                                        input.nextLine();
                                    }

                                    switch (escolha) {
                                        case 1:
                                            try {
                                                System.out.println("Digite um nome... ");
                                                String palavra = input.nextLine();
                                                Cliente cliente = Cliente.buscaClienteNome(palavra);
                                                System.out.println("Resultados encontrados: ");
                                                cliente.exibir();

                                            } catch (Exception e) {
                                                System.out.println("Erro");
                                            }
                                            break;
                                        case 0:
                                            System.out.println("\nVoltando ao menu...");
                                            System.out.println("\n----------------------------------------------------\n");
                                            break;
                                        default:
                                            System.out.println("Escolha Inválida");
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("busca de funcionarios");
                                int escolha3 = -1;

                                while (escolha3 != 0) {
                                    System.out.println("\n----------------------------------------------------\n");
                                    System.out.println("                   Busca de Funcionários\n");
                                    System.out.println(" 1 : Busca por Nome");
                                    System.out.println(" 0 : Voltar");


                                    //mesma validaçao de la em cima
                                    if (input.hasNextInt()) {
                                        escolha3 = input.nextInt();
                                    } else {
                                        escolhaBusca = -1;
                                        input.nextLine();
                                    }

                                    switch (escolha) {
                                        case 1:
                                            try {
                                                System.out.println("Digite um nome... ");
                                                String palavra = input.nextLine();
                                                Funcionario funcionario = Funcionario.buscaFuncionarioNome(palavra);
                                                System.out.println("Resultados encontrados: ");
                                                funcionario.exibir();

                                            } catch (Exception e) {
                                                System.out.println("Erro");
                                            }
                                            break;
                                        case 0:
                                            System.out.println("\nVoltando ao menu...");
                                            System.out.println("\n----------------------------------------------------\n");
                                            break;

                                        default:
                                            System.out.println("Escolha Inválida");
                                            break;
                                    }
                                }
                                break;
                            case 3:

                                System.out.println("filmes por descricao");
                                try {
                                    System.out.println("Digite a descrição... ");
                                    String palavra = input.nextLine();
                                    Filme filme = Filme.buscaFilmeDesc(palavra);
                                    System.out.println("Resultados encontrados: ");
                                    filme.exibir();

                                } catch (Exception e) {
                                    System.out.println("Erro");
                                }
                                break;
                            case 4:
                                System.out.println("filmes por titulo");
                                try {
                                    System.out.println("Digite o título do filme... ");
                                    String palavra = input.nextLine();
                                    Filme filme = Filme.buscaFilmeNome(palavra);
                                    System.out.println("Resultados encontrados: ");
                                    filme.exibir();

                                } catch (Exception e) {
                                    System.out.println("Erro");
                                }
                                break;
                            case 5:
                                System.out.println("filmes por codigo");
                                try {
                                    System.out.println("Digite o código do filme... ");
                                    int codigo = input.nextInt();
                                    Filme filme = Filme.buscaFilmeCodigo(codigo);
                                    System.out.println("Resultados encontrados: ");
                                    filme.exibir();

                                } catch (Exception e) {
                                    System.out.println("Erro");
                                }
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
                                try {
                                    Cliente clienteVelho;
                                    clienteVelho = Cliente.buscaClienteMaiorIdade();
                                    clienteVelho.exibir();
                                }catch (Exception e){
                                    System.out.println("Erro");
                                }
                                break;
                            case 2:
                                try {
                                    Cliente clienteNovo;
                                    clienteNovo = Cliente.buscaClienteMenorIdade();
                                    clienteNovo.exibir();
                                }catch (Exception e){
                                    System.out.println("Erro");
                                }
                                break;
                            case 3:
                                System.out.println("Quantidade de Clientes acima de 60 anos: "+Cliente.qtdClientesIdosos());
                                break;
                            case 4:
                                System.out.println("Quantidade de Clientes abaixo de 18 anos: "+Cliente.qtdClientesJovens());
                                break;
                            case 5:
                                System.out.println("Idade Média dos Clientes: "+Cliente.mediaIdadeClientes());
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
                                try {
                                    System.out.println("Filme mais caro: ");
                                    Filme filme = Filme.buscaFilmeCaro();
                                    filme.exibir();
                                }catch (Exception e){
                                    System.out.println("Erro");
                                }
                                break;
                            case 2:
                                try {
                                    System.out.println("Filme mais barato: ");
                                    Filme filme2 = Filme.buscaFilmeBarato();
                                    filme2.exibir();
                                }catch (Exception e){
                                    System.out.println("Erro");
                                }
                                break;
                            case 3:
                                try {
                                    System.out.println("Média dos preços dos filmes: ");
                                    System.out.println("R$ "+Filme.mediaPrecoFilmes());
                                }catch (Exception e){
                                    System.out.println("Erro");
                                }
                                break;
                            case 4:
                                try {
                                    System.out.println("Quantidade de filmes com preço acima da média: "+Filme.qtdFilmesAcimaDaM());
                                }catch (Exception e){
                                    System.out.println("Erro");
                                }
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
                        }
                        else{
                            escolhaPessoa = -1;
                            input.nextLine();
                        }

                        switch (escolhaPessoa) {
                            case 1:
                                System.out.println("\n----------------------------------------------------\n");
                                System.out.println("                  Cadastro de clientes\n");
                                o.cadastroVariaveisCliente();
                                System.out.println("\n----------------------------------------------------\n");
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

    public void cadastroVariaveisCliente(){
        Cliente cliente = new Cliente();
        Scanner variaveis = new Scanner(System.in);

        //to com preguiça de explicar isso, eu acretido na sua capacidade de entender vih
        //eu mudei o metodo de cadastrar cliente pra isso, mas n mudei os de funcionario etc

        String nome = "abcde";
        while(nome.equals("abcde")){
            System.out.println("insira nome: ");
            if(variaveis.hasNext("[1234567890]")){
                System.out.println("amiginho isso não é seu nome não");
                variaveis.next();
                continue;
            }else if(variaveis.hasNextLine()){
                nome = variaveis.nextLine();
                cliente.setNome(nome);
            }
        }

        String endereco = "abcde";
        while(endereco.equals("abcde")){
            System.out.println("insira endereco: ");
            if(variaveis.hasNext("[1234567890]")){
                System.out.println("amiginho isso não é seu endereco não");
                variaveis.next();
                continue;
            }else if(variaveis.hasNextLine()){
                endereco = variaveis.nextLine();
                cliente.setEndereco(endereco);
            }
        }

        String email = "abcde";
        while(email.equals("abcde")){
            System.out.println("insira email: ");
            if(variaveis.hasNext("[1234567890]")){
                System.out.println("amiginho isso não é seu email não");
                variaveis.next();
                continue;
            }else if(variaveis.hasNextLine()){
                email = variaveis.nextLine();
                cliente.setEmail(email);
            }
        }

        int idade = -1;
        while(idade == -1){
            System.out.println("insira idade: ");
            if(variaveis.hasNextInt()){
                idade = variaveis.nextInt();
                cliente.setIdade(idade);
            } else {
                variaveis.next();
            }
        }

        long cpf = -1;
        while(cpf == -1){
            System.out.println("insira cpf: ");
            if(variaveis.hasNextLong()){
                cpf = variaveis.nextLong();
                cliente.setCpf(cpf);
            } else {
                variaveis.next();
            }
        }

        long telefone = -1;
        while(telefone == -1){
            System.out.println("insira telefone: ");
            if(variaveis.hasNextLong()){
                telefone = variaveis.nextLong();
                cliente.setTelefone(telefone);
            } else {
                variaveis.next();
            }
        }

        Cliente.cadastrarCliente(cliente);
    }
}