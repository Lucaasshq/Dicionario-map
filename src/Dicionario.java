import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
            dicionario.put(palavra, definicao);

    }

    public void removerPalavra(String palavra) {
        if (dicionario.isEmpty()) {
            System.out.println("Insira uma palavra valida");
        } else {
            dicionario.remove(palavra);
        }
    }

    public void exibirPalavras() {
        if (!dicionario.isEmpty()) {
            System.out.println(dicionario);
        } else {
            System.out.println("O Dicionário esta vazio");
        }
    }

    public void pesquisarPorPalavra(String palavra) {
        if (dicionario.isEmpty()) {
            System.out.println(dicionario.get(palavra));
        } else {
            System.out.println("Essa palavra não esta no dicionário!");
        }
    }


}
