package dominio;


public class CadastroPescador extends Pescador {
    private boolean verificado;

    public CadastroPescador(String nome, String registro, boolean verificado) {
        super(nome, registro);
        this.verificado = verificado;
    }

    @Override
    public String obterInformacoes() {
        String infoBasica = super.obterInformacoes();
        return infoBasica + ", Verificado: " + (verificado ? "Sim" : "Não");
    }

    public boolean verificarPescador() {
        this.verificado = true;
        return verificado;
    }

    public boolean verificarPescador(String codigoVerificacao) {
        if (codigoVerificacao.equals("12345")) {
            this.verificado = true;
        }
        return verificado;
    }

}

