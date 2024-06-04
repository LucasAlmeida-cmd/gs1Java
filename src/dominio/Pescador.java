package dominio;

public class Pescador {
    private String nome;
    private String registro;

    public Pescador(String nome, String registro) {
        this.nome = nome;
        this.registro = registro;
    }

    public String obterInformacoes() {
        return "Nome: " + nome + ", Registro: " + registro;
    }

    public boolean validarRegistro(String registro) {
        return this.registro.equals(registro);
    }

    public String getNome() {
        return nome;
    }

}
