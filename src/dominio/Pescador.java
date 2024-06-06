package dominio;


public class Pescador extends Usuario{
	private String registro;
	private boolean verificado;
	
	public Pescador(String nome, String login, String senha, String registro, boolean verificado) {
		super(nome, login, senha);
		this.registro = registro;
		this.verificado = verificado;
	}
}
