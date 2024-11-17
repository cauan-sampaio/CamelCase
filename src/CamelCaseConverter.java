import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class CamelCaseConverter {
    public static List<String> converterCamelCase(String original) {
        List<String> palavras = new ArrayList<>();
        StringBuilder palavraAtual = new StringBuilder();

        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);

            // Se a letra for maiúscula e já tivermos uma palavra atual, adicionamos a palavra anterior
            if (Character.isUpperCase(c) && palavraAtual.length() > 0) {
                palavras.add(palavraAtual.toString()); // Adiciona a palavra atual
                palavraAtual = new StringBuilder();
            }

            // Adiciona o caracter atual na palavra atual
            palavraAtual.append(c);
        }

        // Adiciona a última palavra
        if (palavraAtual.length() > 0) {
            palavras.add(palavraAtual.toString()); // Adiciona a palavra final
        }

        // Garantir que a primeira palavra seja minúscula, caso queira esse comportamento
        if (!palavras.isEmpty()) {
            palavras.set(0, palavras.get(0).toLowerCase()); // Force the first word to lowercase
        }

        return palavras;
    }
}
