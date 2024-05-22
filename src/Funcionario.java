public class Funcionario extends Pessoa implements IPessoa
{

    //Variaveis

    private String nome;
    private int idade;
    private long cpf;
    private double salario;
    private String email;
    private String endereco;
    private long telefone;

    private static int contadorF;

    //Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        //FEITO TRATAMENTO DE EXCECOES
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
        //FEITO TRATAMENTO DE EXCECOES
        if(idade<=0){
            throw new IllegalArgumentException("Idade não pode ser negativa e nem zero");
        } else{
            this.idade = idade;
        }
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        //FAZER TRATAMENTO DE EXCECOES
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getContadorF() {
        return contadorF;
    }

    public static void setContadorF(int contadorF) {
        Funcionario.contadorF = contadorF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //FEITO TRATAMENTO DE EXCECOES
        if(email.isEmpty()){
            throw new IllegalArgumentException("Email precisa ser preenchido");
        } else{
            this.email = email;
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

    //Construtores

    public Funcionario(String nome, int idade, long cpf, double salario, String email, String endereco, long telefone) {
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
        setTelefone(telefone);
        setEndereco(endereco);
        setEmail(email);
        setSalario(salario);
    }

    public Funcionario() {
    }

    //Metodos
    //Exibe os dados do funcionário
    public void exibir(){
        System.out.println(this.getCpf());
        System.out.println(this.getNome());
        System.out.println(this.getIdade());
        System.out.println(this.getSalario());
        System.out.println(this.getTelefone());
        System.out.println(this.getEmail());
        System.out.println(this.getEndereco());
    }
}
