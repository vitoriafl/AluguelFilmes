import java.util.ArrayList;
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
        if(titulo.isBlank()){
            System.out.println("Titulo precisa ser preenchido");
        } else if (isNumeric(titulo)) {
            System.out.println("Titulo não pode ser numerico");
        }else{
            try{
                this.titulo = titulo;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        //FEITO TRATAMENTO DE EXCECOES
        if(minutos<=0){
            System.out.println("Minutos precisam ser maiores ou diferentes de zero");
        } else{
            try {
                this.minutos = minutos;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo<=0){
            System.out.println("Codigo precisa ser maior ou diferente de zero");
        } else{
            try {
                this.codigo = codigo;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<0){
            System.out.println("Preço precisa ser maior ou diferente de zero");
        }else{
            try{
                this.preco = preco;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        //FEITO TRATAMENTO DE EXCECOES
        if(descricao.isBlank()){
            System.out.println("Descrição precisa ser preenchida");
        } else if (isNumeric(descricao)) {
            System.out.println("Descrição não pode ser numerica");
        }else{
            try{
                this.descricao = descricao;
            } catch (Exception e){
                System.out.println("Um erro inesperado aconteceu, tente novamente ");
            }
        }
    }

    public static int getContadorFilmes() {
        return contadorFilmes;
    }

    public static void setContadorFilmes(int contadorFilmes) {
        Filme.contadorFilmes = listFilmes.size();
    }

    public Filme(String titulo, int minutos, int codigo, double preco, String descricao) {
        setTitulo(titulo);
        setMinutos(minutos);
        setCodigo(codigo);
        setPreco(preco);
        setDescricao(descricao);
        cadastrarFilme(this);
    }

    public Filme() {
    }

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


    public void exibir() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Duracao: " + this.getMinutos());
    }

    public static void cadastrarFilme(Filme filme) {
        try{
            //Filme filme = new Filme(titulo, minutos, codigo, preco, descricao);
            listFilmes.add(filme);
            Filme.contadorFilmes = listFilmes.size();
            System.out.println("Filme cadastrado com sucesso");
        }catch (IllegalArgumentException e){
            System.out.println("Um erro aconteceu, tente novamente");
            System.out.println(e.getMessage());
        }
    }

    public static void removerFilme(int codigo){
        try {
            boolean foiRemovido = false;
            for(Filme f: listFilmes){
                if(f.getCodigo() == codigo){
                    listFilmes.remove(f);
                    System.out.println("Filme removido com sucesso");
                    Filme.contadorFilmes = listFilmes.size();
                    foiRemovido = true;
                    break;
                }
            }
            if(!foiRemovido){
                System.out.println("Filme com este codigo não foram achados");
            }
        }catch(IllegalArgumentException e){
            System.out.println("Um erro aconteceu, tente novamente");
            System.out.println(e.getMessage());
        }
    }

    //busca filme por nome
    //melhorei esse metodo, olha no do cliente pra ver as anotaçoes bonitinhas

    public static ArrayList<Filme> buscaFilmeNome(String parteNome){
        ArrayList<Filme> filmesEncontrados = new ArrayList<>();
        Filme filmeProcurado = new Filme();
        boolean foiAchado = false;


        parteNome = parteNome.toLowerCase();

        for(Filme f: listFilmes){
            //aqui tava tentando pegar o getDescricao aí n tava dando certo mas ta tudo joia agr
            if(f.getTitulo().toLowerCase().contains(parteNome)){
                filmeProcurado = f;
                filmesEncontrados.add(filmeProcurado);
                foiAchado = true;
            }
        }

        if (foiAchado) {
            return filmesEncontrados;
        } else {
            return null;
        }
    }

    //busca filme por descricao
    //melhorei esse metodo, olha no do cliente pra ver as anotaçoes bonitinhas
    public static ArrayList<Filme> buscaFilmeDesc(String parteDesc){
        ArrayList<Filme> filmesEncontrados = new ArrayList<>();
        Filme filmeProcurado = new Filme();
        boolean foiAchado = false;


        parteDesc = parteDesc.toLowerCase();

        for(Filme f: listFilmes){
            if(f.getDescricao().toLowerCase().contains(parteDesc)){
                filmeProcurado = f;
                filmesEncontrados.add(filmeProcurado);
                foiAchado = true;
            }
        }

        if (foiAchado) {
            return filmesEncontrados;
        } else {
            return null;
        }
    }

    //busca filme mais barato
    public static Filme buscaFilmeBarato() {
        if (listFilmes == null || listFilmes.isEmpty()) {
            return null; // ou lançar uma exceção se preferir
        }

        //Descobri q da p fazer essa linha debaixo mas n to afim de usar pq mt dificil as sintaxes e explicar fica paia
        //Filme filmeMaisBarato = Collections.min(listFilmes, Comparator.comparingDouble(Filme::getPreco));
        Filme filmeMaisBarato = listFilmes.get(0);
        for (Filme filme : listFilmes) {
            if (filme.getPreco() <= filmeMaisBarato.getPreco()) {
                filmeMaisBarato = filme;
            }
        }
        return filmeMaisBarato;
    }

    //busca filme mais caro
    public static Filme buscaFilmeCaro() {
        if (listFilmes == null || listFilmes.isEmpty()) {
            return null; // ou lançar uma exceção se preferir
        }

        //Filme filmeMaisCaro= Collections.max(listFilmes, Comparator.comparingDouble(Filme::getPreco));
        Filme filmeMaisCaro = listFilmes.getFirst();
        for (Filme filme : listFilmes) {
            if (filme.getPreco() > filmeMaisCaro.getPreco()) {
                filmeMaisCaro = filme;
            }
        }
        return filmeMaisCaro;
    }

    // esses 2 metodo debaixo eu fiz por graça mesmo, se quiser pode implementar eles, mas sla
    //listar filmes do mais barato ao mais caro
    public static ArrayList<Filme> listarFilmesPorPrecoCrescente() {
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

        for (Filme f : Filme.listFilmes){
            if(codigo == f.getCodigo()){
                Filme filmeProcurado = f;
                System.out.println(codigo);
                return filmeProcurado;
            }
        }
        return null;
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
