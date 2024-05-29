import java.util.ArrayList;

public class Filme{
    private String titulo;
    private int minutos;
    private int codigo;
    private double preco;
    private String descricao;

    private static int contadorFilmes = 0;

    private static ArrayList<Filme> filmes = new ArrayList<>();

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
            throw new IllegalArgumentException("Duracao em minutos nao pode ser negativo");
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        //FEITO TRATAMENTO DE EXCECOES
        if(descricao.isEmpty()){
            throw new IllegalArgumentException("Titulo precisa ser preenchido");
        } else{
            this.descricao = descricao;
        }
    }

    public static int getContadorFilmes() {
        return contadorFilmes;
    }

    public static void setContadorFilmes(int contadorFilmes) {
        Filme.contadorFilmes = contadorFilmes;
    }

    public Filme(String titulo, int minutos, int codigo, double preco, String descricao) {
        setTitulo(titulo);
        setMinutos(minutos);
        setCodigo(codigo);
        setPreco(preco);
        setDescricao(descricao);
    }

    public Filme() {
    }

    public void exibir() {
        System.out.println(this.getTitulo());
        System.out.println(this.getMinutos());
        System.out.println(this.getCodigo());
        System.out.println(this.getPreco());
    }

    public void cadastrarFilme(String titulo, int codigo, int minutos, double preco, String descricao) {
        try{
            Filme filme = new Filme(titulo, minutos, codigo, preco, descricao);
            filmes.add(filme);
            Filme.contadorFilmes++;
        }catch (IllegalArgumentException e){
            System.out.println("Um erro aconteceu, tente novamente");
            System.out.println(e.getMessage());
        }
    }

    public void removerFilme(int codigo){
        //Esse metodo deu erro no da Maria, testar dps pra ver se no nosso da certo ; ok
        try {
            for(Filme f: filmes){
                if(f.getCodigo() == codigo){
                    filmes.remove(f);
                    System.out.println("Cliente removido com sucesso");
                    Filme.contadorFilmes--;
                    break;
                }
            }
        }catch(IllegalArgumentException e){
            System.out.println("Um erro aconteceu, tente novamente");
            System.out.println(e.getMessage());
        }
    }
}
