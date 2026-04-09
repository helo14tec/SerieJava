package com.series.utils;

public class Validacoes {

    // substitui o tanto de "regex: ".*\\d+.*"" que ficaria atrapalhando
    // só deixa mais fácil de botar esse tipo de validação msm
    private static final String ERRO_NUMEROS = ".*\\d+.*";

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
        return !(genero == null || genero.trim().isEmpty() || genero.matches(ERRO_NUMEROS)
                || !genero.matches(".*[a-zA-Z].*"));
    }

    public static String mensagemErroGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            return "Erro: O gênero não pode estar vazio!";
        } else if (genero.matches(ERRO_NUMEROS)) {
            return "Erro: O gênero não pode conter números!";
        } else if (!genero.matches(".*[a-zA-Z].*")) {
            return "Erro: O gênero deve conter pelo menos uma letra!";
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

    // validando temporada
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
        return !(diretor == null || diretor.trim().isEmpty() || diretor.matches(ERRO_NUMEROS)
                || diretor.matches(".*[^a-zA-Z0-9 ].*"));
    }

    public static String mensagemErroDiretor(String diretor) {
        if (diretor == null || diretor.trim().isEmpty()) {
            return "Erro: O diretor não pode estar vazio!";
        } else if (diretor.matches(ERRO_NUMEROS) || diretor.matches(".*[^a-zA-Z0-9 ].*")) {
            return "Erro: O nome do diretor não pode ter números ou caracteres especiais!";
        }
        return "";

    }

}
