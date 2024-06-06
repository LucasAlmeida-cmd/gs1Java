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

    public String exibirEspecie() {
    	String especie = ("Nome da Espécie: " + nome + 
    			"\nHabitat da Espécie: " + habitat + 
    			"\nPeríodo de Defeso: " + periodoDefeso);
    	
    	return especie;
    }

}

