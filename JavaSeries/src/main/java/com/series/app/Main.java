package com.series.app;

import java.util.Scanner;
import com.series.model.Serie;
import com.series.utils.Validacoes;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Serie serie = new Serie("Dragões: Corrida até o Limite", "Animação", 2015, 6, 78, "T.J. Sullivan");

        int opcao;

        do {

            imprimirMenu();
            opcao = recebeOp(scanner);
            System.out.println(); // deixa mais bonito, perfeccionismo

            switch (opcao) {

                case 1:
                    serie.exibirDetalhes();
                    break;

                case 2:
                    alterarTitulo(serie, scanner);
                    break;

                case 3:
                    alterarGenero(serie, scanner);
                    break;

                case 4:
                    alterarAno(serie, scanner);
                    break;

                case 5:
                    alterarTemporadas(serie, scanner);
                    break;

                case 6:
                    alterarEpisodios(serie, scanner);
                    break;

                case 7:
                    alterarDiretor(serie, scanner);
                    break;

                case 8:
                    serie.serieMaratonavel();
                    break;

                case 9:
                    serie.serieLonga();
                    break;

                case 0:
                    System.out.println("Programa finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0); // Enquanto a opção que o usuário der não for 0, continua rodando

        scanner.close();
    }

    public static void imprimirMenu() {

        System.out.println("\n=== Séries ===");
        System.out.println("1. Mostrar detalhes ");
        System.out.println("2. Alterar título");
        System.out.println("3. Alterar gênero");
        System.out.println("4. Alterar ano ");
        System.out.println("5. Alterar temporadas");
        System.out.println("6. Alterar episódios");
        System.out.println("7. Alterar diretor");
        System.out.println("8. verificar se a Série é maratonavel");
        System.out.println("9. Verificar se a série é longa");
        System.out.println("0. Sair");
        System.out.print("\nEscolha uma opção: ");

    }

    public static int recebeOp(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }

    public static void alterarTitulo(Serie serie, Scanner scanner) {

        System.out.print("Digite o novo título: ");
        String novoTitulo = scanner.nextLine();

        if (Validacoes.tituloValido(novoTitulo)) {
            serie.setTitulo(novoTitulo);
            System.out.println("Título alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroTitulo(novoTitulo));
        }
    }

    public static void alterarDiretor(Serie serie, Scanner scanner) {

        System.out.print("Digite o novo Diretor: ");
        String novoDiretor = scanner.nextLine();

        if (Validacoes.diretorValido(novoDiretor)) {
            serie.setDiretor(novoDiretor);
            System.out.println("Diretor alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroDiretor(novoDiretor));
        }
    }

    public static void alterarGenero(Serie serie, Scanner scanner) {

        System.out.print("Digite o novo Gênero: ");
        String novoGenero = scanner.nextLine();

        if (Validacoes.generoValido(novoGenero)) {
            serie.setGenero(novoGenero);
            System.out.println("Gênero alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroGenero(novoGenero));
        }
    }

    public static void alterarAno(Serie serie, Scanner scanner) {
        System.out.print("Digite o novo ano de lançamento: ");

        try {

            int novoAno = Integer.parseInt(scanner.nextLine());

            if (Validacoes.anoValido(novoAno)) {
                serie.setAnoLancamento(novoAno);
                System.out.println("Ano alterado com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroAno(novoAno));
            }

        }

        catch (NumberFormatException e) { // Dá print caso alguma letra ou float seja digitado em um int

            System.out.println("Digite um número válido!");
        }
    }

    public static void alterarTemporadas(Serie serie, Scanner scanner) {
        System.out.print("Número de temporadas: ");

        try {

            int novaTemporada = Integer.parseInt(scanner.nextLine());

            if (Validacoes.temporadaValida(novaTemporada)) {
                serie.setTemporadas(novaTemporada);
                System.out.println("Temporada atualizada!");
            } else {
                System.out.println(Validacoes.mensagemErroTemporada(novaTemporada));
            }

        }

        catch (NumberFormatException e) { // Dá print caso alguma letra ou float seja digitado em um int

            System.out.println("Erro: Digite um número válido!");
        }
    }

    public static void alterarEpisodios(Serie serie, Scanner scanner) {
        System.out.print("Número de episódios: ");

        try {

            int novoEpisodio = Integer.parseInt(scanner.nextLine());

            if (Validacoes.episodioValido(novoEpisodio)) {
                serie.setEpisodios(novoEpisodio);
                System.out.println("Episódio atualizada!");
            } else {
                System.out.println(Validacoes.mensagemErroEpisodio(novoEpisodio));
            }

        }

        catch (NumberFormatException e) { // Dá print caso alguma letra ou float seja digitado em um int

            System.out.println("Erro: Digite um número válido!");
        }
    }

}