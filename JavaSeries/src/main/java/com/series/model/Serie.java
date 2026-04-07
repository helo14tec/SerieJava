package com.series.model;

public class Serie {

//atributos das séries

    private String titulo;
    private String genero;
    private int anoLancamento;
    private int temporadas;
    private int episodios;
    private String diretor;

//construtoror vazio
public Serie() {
}

//construtoror com valores
public Serie(String titulo, String genero, int anoLancamento, int temporadas, int episodios, String diretor) {

        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.diretor = diretor;
}

//métodos geral da séries
public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódios: " + episodios);
        System.out.println("Diretor: " + diretor);
 } 


// Método específico vendo se a série é longa
public void serieLonga() {

    if (temporadas > 10) {
        System.out.println("Série ENORME ");
     }

    else {
        System.out.println("Série curta , Pode maratonar !!");
     }

 }

//método especifico para ver se é bom ou não maratonar a série
public void serieMaratonavel() {
    if (episodios <= 30) {
        System.out.println("Pode maratonar, eu deixo !");
    } else {
        System.out.println("Vai demorar um século pra maratonar");
    }
}

 //Gets e sets
 public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public void setGenero(String genero) {
    this.genero = genero;
}

public int getAnoLancamento() {
    return anoLancamento;
}

public void setAnoLancamento(int anoLancamento) {
    this.anoLancamento = anoLancamento;
}

public int getTemporadas() {
    return temporadas;
}

public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
}

public int getEpisodios() {
    return episodios;
}

public void setEpisodios(int episodios) {
    this.episodios = episodios;
}

public String getDiretor() {
    return diretor;
}

public void setDiretor(String diretor) {
    this.diretor = diretor;
}

@Override
public String toString() {
   return "Serie [titulo=" + titulo + ", genero=" + genero + ", ano=" + anoLancamento + ", temporadas=" + temporadas + ", episodios=" + episodios + ", diretor=" + diretor + "]";
}
    
}
