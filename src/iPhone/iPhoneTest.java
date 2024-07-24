package iPhone;

public class iPhoneTest {
    public static void main(String[] args) {
        // Criação de um objeto iPhone
        iPhone meuIPhone = new iPhone("iPhone 13", "Preto", 128);

        // Testando ReprodutorMusical
        System.out.println("Testando ReprodutorMusical:");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        // Testando AparelhoTelefonico
        System.out.println("\nTestando AparelhoTelefonico:");
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        System.out.println("\nTestando NavegadorInternet:");
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaPagina();
        meuIPhone.atualizarPagina();
    }
}
