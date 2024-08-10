public class Usuario {
    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Paz", "Estado de calmaria");
        dicionario.adicionarPalavra("Pai", "Aquele que tem");
        dicionario.adicionarPalavra("Empatia", "Capacidade de se colocar no lugar de outra pessoa");
        dicionario.adicionarPalavra("Refutar", "Derrubar as afirmações alheias usando alegações");
        dicionario.adicionarPalavra("Peculiar", "Caracteristica de algo ou alguém");
        dicionario.adicionarPalavra("Vicissitude", "Sequência de mudanças ou transformações");
        dicionario.removerPalavra("Empatia");
        dicionario.exibirPalavras();
    }
}
