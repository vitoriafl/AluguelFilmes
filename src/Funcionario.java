public class Funcionario implements IPessoa extends Pessoa{

    //Variaveis

    private String nome;
    private int idade;
    private int cpf;
    private double salario;
    private String email;
    private String endereco;
    private String telefone;

    private static int contadorF;

    //Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Construtores

    public Funcionario(String nome, int idade, int cpf, double salario, String email, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
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
