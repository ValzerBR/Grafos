package lib;

import java.util.ArrayList;

public class Vertice<T> {
    private T valor;
    private ArrayList<Aresta> destinos;

    // Construtor
    public Vertice(T valor) {
        this.valor = valor;
        this.destinos = new ArrayList<>();
    }

    // Getters
    public T getValor() {
        return valor;
    }

    public ArrayList<Aresta> getDestinos() {
        return destinos;
    }

    // Adicionar Aresta
    public void adicionarDestino(Aresta aresta) {
        this.destinos.add(aresta);
    }

    // Outros métodos (opcional)
    // ...
}
