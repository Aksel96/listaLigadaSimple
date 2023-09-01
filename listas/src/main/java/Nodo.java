public class Nodo {
    Object valor;
    Nodo enlace;

    public Nodo(Object valor) {
        this.valor = valor;
        this.enlace = null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "valor=" + valor.toString() +
                '}';
    }
}
