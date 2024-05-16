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

    //Construtores

    public Cliente(String nome, int idade, int cpf, int telefone, int contadorFilmesAlugados, String endereco, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.contadorFilmesAlugados = contadorFilmesAlugados;
        this.endereco = endereco;
        this.email = email;
    }

    public Cliente() {
    }

    //Metodos

    //Exibe todos os dados do Cliente
    @Override
    public void exibir() {
        System.out.println("Num de clientes: " + this.getCpf());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Num de filmes alugados: " + this.getContadorFilmesAlugados());
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //FEITO TRATAMENTO DE EXECOES
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
        //A FAZER TRATAMENTO DE EXEÇOES
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        //A FAZER TRATAMENTO DE EXEÇOES
        this.cpf = cpf;
    }

    public int getContadorFilmesAlugados() {
        return contadorFilmesAlugados;
    }

    public void setContadorFilmesAlugados(int contadorFilmesAlugados) {
        //A FAZER TRATAMENTO DE EXEÇOES
        this.contadorFilmesAlugados = contadorFilmesAlugados;
    }

    public static int getContadorC() {
        return contadorC;
    }

    public static void setContadorC(int contadorC) {
        //A FAZER TRATAMENTO DE EXEÇOES
        Cliente.contadorC = contadorC;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        //A FAZER TRATAMENTO DE EXEÇOES
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        //FEITO TRATAMENTO DE EXECOES
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
        //FEITO TRATAMENTO DE EXECOES
        if(email.isEmpty()){
            throw new IllegalArgumentException("Email precisa ser preenchido");
        } else{
            this.email = email;
        }
    }


}
