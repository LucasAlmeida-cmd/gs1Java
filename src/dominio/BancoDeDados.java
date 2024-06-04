package dominio;

import java.util.ArrayList;

public class BancoDeDados {
    private ArrayList<Especie> especies;
    private ArrayList<CadastroPescador> pescadores;

    public BancoDeDados() {
        this.especies = new ArrayList<>();
        this.pescadores = new ArrayList<>();
    }

    public void adicionarEspecie(Especie especie) {
        especies.add(especie);
    }

    public Especie obterEspecie(String nome) {
        for (Especie especie : especies) {
            if (especie.getNome().equals(nome)) {
                return especie;
            }
        }
        return null;
    }

    public void adicionarPescador(CadastroPescador pescador) {
        pescadores.add(pescador);
    }

    public CadastroPescador obterPescador(String nome) {
        for (CadastroPescador pescador : pescadores) {
            if (pescador.getNome().equals(nome)) {
                return pescador;
            }
        }
        return null;
    }

    public void listarEspecies() {
        for (Especie especie : especies) {
            System.out.println(especie.obterInformacoes());
        }
    }

    public void listarPescadores() {
        for (CadastroPescador pescador : pescadores) {
            System.out.println(pescador.obterInformacoes());
        }
    }
}
