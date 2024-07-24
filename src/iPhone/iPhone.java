package iPhone;

public class iPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    private String modelo;
    private String cor;
    private int armazenamento;

    public iPhone (String modelo, String cor, int armazenamento) {
        this.modelo = modelo;
        this.cor = cor;
        this.armazenamento = armazenamento;
    }

    // Métodos do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Nova página adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }


    // Métodos adicionais
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getArmazenamento() {
        return armazenamento;
    }
}
