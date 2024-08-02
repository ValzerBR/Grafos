package lib;

public class Aresta {
    private Vertice destino;
    private float peso;

    // Construtor
    public Aresta(Vertice destino, float peso) {
        this.destino = destino;
        this.peso = peso;
    }

    // Getters
    public Vertice getDestino() {
        return destino;
    }

    public float getPeso() {
        return peso;
    }

    // Setters (se você precisar modificar os valores posteriormente)
    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
