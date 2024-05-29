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

    //cadastra o cliente no array
    public static void cadastrarCliente(Cliente cliente) {
        try{
            listClientes.add(cliente);
            Cliente.contadorC++;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isEmpty()){
            throw new IllegalArgumentException("Nome precisa ser preenchido");
        } else if (isNumeric(nome)){
            throw new IllegalArgumentException("Nome não pode ser numero");
        } else {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade==0 | idade<0){
            throw new IllegalArgumentException("Idade precisa ser maior ou diferente de zero");
        } else{
            this.idade = idade;
        }
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        if(cpf==0 | cpf<0){
            throw new IllegalArgumentException("Cpf precisa ser maior ou diferente de zero");
        } else {
            this.cpf = cpf;
        }
    }

    public int getContadorFilmesAlugados() {
        return contadorFilmesAlugados;
    }

    public void setContadorFilmesAlugados(int contadorFilmesAlugados) {
        if(contadorFilmesAlugados<0){
            throw new IllegalArgumentException("Contador precisa ser maior ou igual a zero");
        } else {
            this.contadorFilmesAlugados = contadorFilmesAlugados;
        }
    }

    public static int getContadorC() {
        return contadorC;
    }

    public static void setContadorC(int contadorC) {
        if(contadorC<0){
            throw new IllegalArgumentException("Contador precisa ser maior ou igual a zero");
        } else {
            Cliente.contadorC = contadorC;
        }
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        if(telefone==0 | telefone<0){
            throw new IllegalArgumentException("Telefone precisa ser maior ou  diferente de zero");
        } else {
            this.telefone = telefone;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco.isEmpty()){
            throw new IllegalArgumentException("Endereço precisa ser preenchido");
        } else if (isNumeric(endereco)){
            throw new IllegalArgumentException("Endereço não pode ser numero");
        } else {
            this.endereco = endereco;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.isEmpty()){
            // tira esses throws
            throw new IllegalArgumentException("Email precisa ser preenchido");
        } else if (isNumeric(email)){
            throw new IllegalArgumentException("Email não pode ser numero");
        } else{
            //try{
            this.email = email;
            //} catch (e){
            //sout de cria
            //}
        }
    }
    //busca cliente com menor idade
    public static Cliente buscaClienteMenorIdade(){
        int maiorIdade=0;
        Cliente clienteMaisVelho;
        for(Cliente c: listClientes){
            if(c.getIdade()>=maiorIdade){
                maiorIdade=c.getIdade();
                clienteMaisVelho=c;
            }
        }
        clienteMaisVelho = new Cliente();
        return clienteMaisVelho;
    }

    //busca cliente com maior idade
    public static Cliente buscaClienteMaiorIdade(){
        int menorIdade= listClientes.get(0).getIdade();
        Cliente clienteMaisNovo;
        for(Cliente c: listClientes){
            if(c.getIdade()<=menorIdade){
                menorIdade=c.getIdade();
                clienteMaisNovo=c;
            }
        }
        clienteMaisNovo = new Cliente();
        return clienteMaisNovo;
    }

//busca cliente por nome
    public static Cliente buscaClienteNome(String parteNome){
        Cliente clienteProcurado;
        parteNome = parteNome.toLowerCase();
        for(Cliente c: listClientes){
            if(c.getNome().toLowerCase().contains(parteNome)){
                clienteProcurado = c;
            }
        }
        clienteProcurado = new Cliente();
        return clienteProcurado;
    }
}
