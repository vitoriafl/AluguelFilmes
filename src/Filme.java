import java.util.ArrayList;

public class Filme{
    private String titulo;
    private int minutos;
    private int codigo;
    private double preco;
    //Variaveis de produto
    private String nome;
    private int id;
    private String descricao;
    private double preco;

    private static int contadorP=0; //Contador de Produtos

    private static ArrayList<Filme> produtos = new ArrayList<>();


    private static int contadorFilmes = 0;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Filme(String titulo, int minutos, int codigo, double preco) {
        this.titulo = titulo;
        this.minutos = minutos;
        this.codigo = codigo;
        this.preco = preco;
    }

    @Override
    public void exibir() {
        System.out.println(this.getTitulo());
        System.out.println(this.getMinutos());
        System.out.println(this.getCodigo());
        System.out.println(this.getPreco());
    }
}
