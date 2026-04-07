package com.series.utils;

public class Validacoes {

    private Validacoes() {
    
    }

     // validando o título
    public static boolean tituloValido(String titulo) {
        return !(titulo == null || titulo.trim().isEmpty());
    }

    public static String mensagemErroTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            return "Erro: O título não pode estar vazio!";
        }
        return "";
    }

    // validando o gênero
    public static boolean generoValido(String genero) {
        return !(genero == null || genero.trim().isEmpty() || genero.matches(".*\\d+.*"));
    }

    public static String mensagemErroGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            return "Erro: O gênero não pode estar vazio!";
        } else if (genero.matches(".*\\d+.*")) {
            return "Erro: O gênero não pode conter números!";
        }
        return "";
    }

    // validando o ano
     public static boolean anoValido(int ano) {
        return ano >= 1900 && ano <= 2100;
    }

    public static String mensagemErroAno(int ano) {
        if (ano < 1900) {  
            return "Erro: Ano muito antigo!";
        } else if (ano > 2100) {
            return "Erro: Ano muito alto!";
        }
        return "";
    }

    //validando temporada
    public static boolean temporadaValida(int temporadas) {
        return temporadas > 0 && temporadas <= 100;
    }

    public static String mensagemErroTemporada(int temporadas) {
        if (temporadas <= 0) {
            return "Erro: Deve ter pelo menos 1 temporada!";
        } else if (temporadas > 100) {
            return "Erro: Número de temporadas muito alto!";
        }
        return "";
    }

    // validando ep
    public static boolean episodioValido(int episodios) {
        return episodios > 0 && episodios <= 1000;
    }

    public static String mensagemErroEpisodio(int episodios) {
        if (episodios <= 0) {
            return "Erro: Deve ter pelo menos 1 episódio!";
        } else if (episodios > 1000) {
            return "Erro: Número de episódios muito alto!";
        }
        return "";
    }

    // validando diretor
    public static boolean diretorValido(String diretor) {
        return !(diretor == null || diretor.trim().isEmpty() || diretor.matches(".*\\d+.*"));
    }

    public static String mensagemErroDiretor(String diretor) {
        if (diretor == null || diretor.trim().isEmpty()) {
            return "Erro: O diretor não pode estar vazio!";
        } else if (diretor.matches(".*\\d+.*")){
            return "Erro: O nome do diretor não pode ter números";
        }
        return "";
    }
    
}
