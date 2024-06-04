package dominio;

public class Especie {
    private String nome;
    private String habitat;
    private String periodoDefeso;

    public Especie(String nome, String habitat, String periodoDefeso) {
        this.nome = nome;
        this.habitat = habitat;
        this.periodoDefeso = periodoDefeso;
    }

    public boolean verificarDisponibilidade(String periodo) {
        return !this.periodoDefeso.equals(periodo);
    }

    public String obterInformacoes() {
        return "Espécie: " + nome + ", Habitat: " + habitat + ", Período de Defeso: " + periodoDefeso;
    }

    public boolean estaEmPeriodoDefeso(String periodo) {
        return this.periodoDefeso.equals(periodo);
    }

    public String getNome() {
        return nome;
    }

}

