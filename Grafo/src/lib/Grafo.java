package lib;

import java.util.ArrayList;

public class Grafo<T> {
    private ArrayList<Vertice<T>> vertices;

    public Grafo() {
        vertices = new ArrayList<>();
    }

    public Vertice<T> adicionarVertice(T valor) {
        Vertice<T> novo = new Vertice<>(valor);
        this.vertices.add(novo);
        return novo;
    }

    private Vertice<T> obterVertice(T valor) {
        for (Vertice<T> v : this.vertices) {
            if (v.getValor().equals(valor)) {
                return v;
            }
        }
        return null;
    }

    public void adicionarAresta(T origem, T destino, float peso) {
        Vertice<T> verticeOrigem = obterVertice(origem);
        Vertice<T> verticeDestino = obterVertice(destino);

        if (verticeOrigem == null) {
            verticeOrigem = adicionarVertice(origem);
        }
        if (verticeDestino == null) {
            verticeDestino = adicionarVertice(destino);
        }

        // Verificar se a aresta já existe (opcional)
        for (Aresta aresta : verticeOrigem.getDestinos()) {
            if (aresta.getDestino() == verticeDestino) {
                return; // Aresta já existe, não adiciona novamente
            }
        }

        verticeOrigem.adicionarDestino(new Aresta(verticeDestino, peso));
    }

    public ArrayList<Vertice<T>> getVertices() {
        return vertices;
    }
}
