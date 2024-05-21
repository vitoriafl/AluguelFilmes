import java.util.ArrayList;

public class Cliente extends Pessoa implements IPessoa{
    //Variaveis

    private String nome;
    private int idade;
    private int cpf;
    private int telefone;
    private int contadorFilmesAlugados;//a ideia é q dps de 5 filmes alugados o sexto é de graça ou algo assim
    private String endereco;
    private String email;
    private static int contadorC; //contador de clientes

    private static ArrayList<Cliente> clientes = new ArrayList<>();

    //Construtores:

    public Cliente(String nome, int idade, int cpf, int telefone, int contadorFilmesAlugados, String endereco, String email) {
        //usei set pq ele ja vem com o tratamento de execoes
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
        setTelefone(telefone);
        setContadorFilmesAlugados(contadorFilmesAlugados);
        setEndereco(endereco);
        setEmail(email);
    }

    public Cliente() {
    }

    //Metodos:

    //cadastra o cliente no array
    public void cadastrarCliente(String nome, int idade, int cpf, int telefone, int contadorFilmesAlugados, String endereco, String email) {
        try{
            Cliente cliente = new Cliente(nome,idade,cpf,telefone,contadorFilmesAlugados,endereco,email);
            clientes.add(cliente);
            Cliente.contadorC++;
        }catch (IllegalArgumentException e){
            System.out.println("Um erro aconteceu, tente novamente");
            System.out.println(e.getMessage());
        }
    }

    public void removerCliente(int cpf){
        //Esse metodo deu erro no da Maria, testar dps pra ver se no nosso da certo
        for(Cliente C : Cliente.clientes){
            if(C.cpf == cpf){
                Cliente.clientes.remove(clientes.indexOf(C));
            }
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

    //Getters e Setters:

    //todos ja estao com tratamento de execoes
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isEmpty()){
            throw new IllegalArgumentException("Nome precisa ser preenchido");
        } else{
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
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
        } else{
            this.endereco = endereco;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.isEmpty()){
            throw new IllegalArgumentException("Email precisa ser preenchido");
        } else{
            this.email = email;
        }
    }
}
