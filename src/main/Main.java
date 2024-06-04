package main;

import dominio.BancoDeDados;
import dominio.CadastroPescador;
import dominio.Especie;

public class Main {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();

        Especie especie1 = new Especie("Atum", "Oceano Atlântico", "Janeiro-Março");
        Especie especie2 = new Especie("Salmão", "Rio Amazonas", "Abril-Junho");

        bancoDeDados.adicionarEspecie(especie1);
        bancoDeDados.adicionarEspecie(especie2);

        CadastroPescador pescador1 = new CadastroPescador("João", "12345", false);
        CadastroPescador pescador2 = new CadastroPescador("Maria", "67890", true);

        bancoDeDados.adicionarPescador(pescador1);
        bancoDeDados.adicionarPescador(pescador2);

        bancoDeDados.listarEspecies();
        bancoDeDados.listarPescadores();

        pescador1.verificarPescador("12345");
        
        System.out.println("Aqui");
        System.out.println(pescador2.verificarPescador("678901"));
        System.out.println(pescador1.obterInformacoes());

        System.out.println(especie1.verificarDisponibilidade("Janeiro"));
    }
}
