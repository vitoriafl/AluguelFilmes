import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Filme{
    private String titulo;
    private int minutos;
    private int codigo;
    private double preco;
    private String descricao;

    private static int contadorFilmes = 0;

    private static ArrayList<Filme> listFilmes = new ArrayList<>();

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

    public static void cadastrarFilme(String titulo, int codigo, int minutos, double preco, String descricao) {
        try{
            Filme filme = new Filme(titulo, minutos, codigo, preco, descricao);
            listFilmes.add(filme);
            Filme.contadorFilmes++;
        }catch (IllegalArgumentException e){
            System.out.println("Um erro aconteceu, tente novamente");
            System.out.println(e.getMessage());
        }
    }

    public static void removerFilme(int codigo){
        //Esse metodo deu erro no da Maria, testar dps pra ver se no nosso da certo ; ok
        try {
            for(Filme f: listFilmes){
                if(f.getCodigo() == codigo){
                    listFilmes.remove(f);
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

    //busca filme por nome
    public static Filme buscaFilmeNome(String parteNome){
        Filme filmeProcurado;
        parteNome = parteNome.toLowerCase();
        for(Filme f: listFilmes){
            if(f.getTitulo().toLowerCase().contains(parteNome)){
                filmeProcurado = f;
            }
        }
        filmeProcurado = new Filme();
        return filmeProcurado;
    }

    //busca filme por descricao
    public static Filme buscaFilmeDesc(String parteDesc){
        Filme filmeProcurado;
        parteDesc = parteDesc.toLowerCase();
        for(Filme f: listFilmes){
            if(f.getDescricao().toLowerCase().contains(parteDesc)){
                filmeProcurado = f;
            }
        }
        filmeProcurado = new Filme();
        return filmeProcurado;
    }

    //busca filme mais barato
    public static Filme buscaFilmeBarato(ArrayList<Filme> listFilmes) {
        if (listFilmes == null || listFilmes.isEmpty()) {
            return null; // ou lançar uma exceção se preferir
        }

        Filme filmeMaisBarato = Collections.min(listFilmes, Comparator.comparingDouble(Filme::getPreco));
        return filmeMaisBarato;
    }

    //busca filme mais caro
    public static Filme buscaFilmeCaro(ArrayList<Filme> listFilmes) {
        if (listFilmes == null || listFilmes.isEmpty()) {
            return null; // ou lançar uma exceção se preferir
        }

        Filme filmeMaisCaro= Collections.max(listFilmes, Comparator.comparingDouble(Filme::getPreco));
        return filmeMaisCaro;
    }

    //listar filmes do mais barato ao mais caro
    public static ArrayList<Filme> listarFilmesPorPrecoCrescente(ArrayList<Filme> listFilmes) {
        ArrayList<Filme> filmesOrdenados = new ArrayList<>(listFilmes);
        filmesOrdenados.sort(Comparator.comparingDouble(Filme::getPreco));
        return filmesOrdenados;
    }

    //listar filmes do mais caro ao mais barato
    public static ArrayList<Filme> listarFilmesPorPrecoDecrescente(ArrayList<Filme> listFilmes) {
        ArrayList<Filme> filmesOrdenados = new ArrayList<>(listFilmes);
        filmesOrdenados.sort(Comparator.comparingDouble(Filme::getPreco).reversed());
        return filmesOrdenados;
    }

    //busca filme por codigo
    public static Filme buscaFilmeCodigo(int codigo){
        Filme filmeProcurado = new Filme();
        for(Filme f: listFilmes){
            if(f.getCodigo()==codigo){
                filmeProcurado = f;
            }
        }
        if(filmeProcurado == null){
            System.out.printf("Filme não encontrado");
        }
         return filmeProcurado;
    }


    //media dos preços dos filmes
    public static double mediaPrecoFilmes(){
        double soma = 0;
        for(Filme f: listFilmes){
            soma+=f.getPreco();
        }
        double media = soma / (listFilmes.size());
        return media;
    }

    //quantidade de filmes com preço acima da media
    public static int qtdFilmesAcimaDaM(){
        int qtd = 0;
        for(Filme f: listFilmes){
            if(f.getPreco()>mediaPrecoFilmes()){
                qtd++;
            }
        }
        return qtd;
    }

}
