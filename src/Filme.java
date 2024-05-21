public class Filme extends ServicosPrestados{
    private String titulo;
    private int minutos;
    private int codigo;
    private double preco;

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
