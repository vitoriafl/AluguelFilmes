import java.util.ArrayList;

public class Cliente extends Pessoa implements IPessoa{
    //Variaveis

    private String nome;
    private int idade;
    private long cpf;
    private long telefone;
    private int contadorFilmesAlugados;//a ideia é q dps de 5 filmes alugados o sexto é de graça ou algo assim
    private String endereco;
    private String email;
    private static int contadorC; //contador de clientes

    public static ArrayList<Cliente> listClientes = new ArrayList<>(); //Array que contem todos os cliente cadastrados

    //Construtores:

    public Cliente(String nome, int idade, long cpf, long telefone, String endereco, String email) {
        //usei set pq ele ja vem com o tratamento de execoes
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
        setTelefone(telefone);
        setContadorFilmesAlugados(0);
        setEndereco(endereco);
        setEmail(email);
        cadastrarCliente(this);
    }

    public Cliente() {
    }

    //Metodos:

    //pra ajudar a validaçao de strings
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
            int i =  Integer.parseInt(strNum);
            float f = Float.parseFloat(strNum);
            long l = Long.parseLong(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    //busca cliente com maior idade
    //esse metodo tava com uns erros, mas eu consertei
    //acho q vc trocou o nome dele com o de menor idade sem qrer
    //e eu achei mto bom pq eu fui testar e apareceu q a cliente mais velha era a Marina de 12 anos
    public static Cliente buscaClienteMaiorIdade(){
        int maiorIdade=0;
        Cliente clienteMaisVelho = new Cliente();

        if (listClientes == null || listClientes.isEmpty()) {
            return null; // ou lançar uma exceção se preferir
        }

        for(Cliente c : listClientes){
            if(c.getIdade()>=maiorIdade){
                maiorIdade=c.getIdade();
                clienteMaisVelho=c;
            }
        }

        return clienteMaisVelho;
    }

    //busca cliente com menor idade
    public static Cliente buscaClienteMenorIdade(){
        int menorIdade= listClientes.get(0).getIdade();
        Cliente clienteMaisNovo = new Cliente();

        if (listClientes == null || listClientes.isEmpty()) {
            return null; // ou lançar uma exceção se preferir
        }

        for(Cliente c: listClientes){
            if(c.getIdade()<=menorIdade){
                menorIdade=c.getIdade();
                clienteMaisNovo=c;
            }
        }

        return clienteMaisNovo;
    }

    //busca cliente por nome
    //eu adicionei o foi achado pra caso n acharem nada
    //esse aqui tava com o msm erro do de buscaClienteMaiorIdade
    //no lugar de retornar só um cliente eu vou fazer um array, desse jeito ele retorna varios
    public static ArrayList<Cliente> buscaClienteNome(String parteNome){
        ArrayList<Cliente> clientesEncontrados = new ArrayList<>();
        Cliente clienteProcurado = new Cliente();
        boolean foiAchado = false;


        parteNome = parteNome.toLowerCase();

        for(Cliente c: listClientes){
            if(c.getNome().toLowerCase().contains(parteNome)){
                clienteProcurado = c;
                clientesEncontrados.add(clienteProcurado);
                foiAchado = true;
            }
        }

        if (foiAchado) {
            return clientesEncontrados;
        } else {
            return null;
        }
    }

    //quantidade de cliente >60
    public static int qtdClientesIdosos(){
        int qtd = 0;
        for(Cliente c: listClientes){
            if(c.getIdade()>=60){
                qtd++;
            }
        }
        return qtd;
    }

    //quantidade de cliente <18
    public static int qtdClientesJovens(){
        int qtd = 0;
        for(Cliente c: listClientes){
            if(c.getIdade()<=18){
                qtd++;
            }
        }
        return qtd;
    }

    //idadeMediaClientes
    public static double mediaIdadeClientes(){
        double soma = 0;
        for(Cliente c: listClientes){
            soma+=c.getIdade();
        }
        double media = soma / (listClientes.size());
        return media;
    }

    //cadastra o cliente no array
    public static void cadastrarCliente(Cliente cliente) {
        try{
            listClientes.add(cliente);
            //troquei pra .size
            Cliente.contadorC=listClientes.size();
            System.out.println("Cliente cadastrado com sucesso!");
        }catch (IllegalArgumentException e){
            System.out.println("Um erro aconteceu, tente novamente");
            System.out.println(e.getMessage());
        }
    }

    //remove um cliente do array
    public static void removerCliente(long cpf){
        //Esse metodo deu erro no da Maria, testar dps pra ver se no nosso da certo
        try {
            for(Cliente C : Cliente.listClientes){
                if(C.cpf == cpf){
                    Cliente.listClientes.remove(listClientes.indexOf(C));
                    System.out.println("Cliente removido com sucesso");
                    Cliente.contadorC--;
                    break;
                }
            }
        }catch(IllegalArgumentException e){
            System.out.println("Um erro aconteceu, tente novamente");
            System.out.println(e.getMessage());
        }
    }

    //exibe todos os dados do Cliente
    @Override
    public void exibir() {
        System.out.println("Num de clientes: " + this.getCpf());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Num de filmes alugados: " + this.getContadorFilmesAlugados());
    }

    //exibe todos os clientes
    public void exibirClientes(){
        for (Cliente C : listClientes){
            System.out.println("---------------------------------");
            C.exibir();
        }
    }

    //Getters e Setters:

    //todos ja estao com tratamento de execoes
    //eu mudei todos os tratamentos aqui pra oq eu te falei n wpp, pq fica melhor na hr do cadastro

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isBlank()){
            System.out.println("Nome precisa ser preenchido");
        } else if (isNumeric(nome)){
            System.out.println("Nome não pode ser numerico");
        } else {
            try{
                this.nome = nome;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade==0 | idade<0){
            System.out.println("Idade precisa ser maior ou diferente de zero");
        }else{
            try{
                this.idade = idade;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        if(cpf==0 | cpf<0){
            System.out.println("Cpf precisa ser maior ou diferente de zero");
        } else {
            try{
                this.cpf = cpf;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public int getContadorFilmesAlugados() {
        return contadorFilmesAlugados;
    }

    public void setContadorFilmesAlugados(int contadorFilmesAlugados) {
        if(contadorFilmesAlugados<0){
            System.out.println("Contador precisa ser maior ou igual a zero");
        } else {
            try{
                this.contadorFilmesAlugados = contadorFilmesAlugados;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public static int getContadorC() {
        return contadorC;
    }

    public static void setContadorC(int contadorC) {
        if(contadorC<0){
            System.out.println("Contador precisa ser maior ou igual a zero");
        } else {
            try{
                Cliente.contadorC = contadorC;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        if(telefone==0 | telefone<0){
            System.out.println("Telefone precisa ser maior ou  diferente de zero");
        } else {
            try{
                this.telefone = telefone;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco.isEmpty()){
            System.out.println("Endereço precisa ser preenchido");
        } else if (isNumeric(endereco)){
            System.out.println("Endereço não pode ser numero");
        } else {
            try{
                this.endereco = endereco;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.isEmpty()){
            // tira esses throws
            System.out.println("Email precisa ser preenchido");
        } else if (isNumeric(email)){
            System.out.println("Email não pode ser numero");
        } else{
            try{
                this.email = email;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

}
