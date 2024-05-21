public class Filme extends ServicosPrestados{
    private String titulo;
    private int minutos;
    private int codigo;
    private double preco;
    private String descricao;

    private static int contadorFilmes = 0;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        //FEITO TRATAMENTO DE EXCECOES
        if(titulo.isEmpty()){
            throw new IllegalArgumentException("Titulo precisa ser preenchido");
        } else{
            this.titulo = titulo;
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        //FEITO TRATAMENTO DE EXCECOES
        if(minutos<=0){
            throw new IllegalArgumentException("Duracao em minutos precisa ser preenchido");
        } else{
            this.minutos = minutos;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        //FEITO TRATAMENTO DE EXCECOES
        if(codigo<0){
            throw new IllegalArgumentException("Código não pode ser negativo");
        } else{
            this.minutos = minutos;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        //FEITO TRATAMENTO DE EXCECOES
        if(preco<0){
            throw new IllegalArgumentException("Preco não pode ser negativo");
        } else{
            this.preco= preco;
        }
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
