/*
Autor: Aksel Villela
        UNAM
    FES ARAGON
ESTRUCTURAS DE DATOS
    Agosto 2023
 */
public class NodoDoble {
    Object valor;
    NodoDoble enlaceLast;
    NodoDoble enlaceNext;

    public NodoDoble(Object valor) {
        this.valor = valor;
        this.enlaceLast = null;
        this.enlaceNext = null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public NodoDoble getEnlaceLast() {
        return enlaceLast;
    }

    public void setEnlaceLast(NodoDoble enlaceLast) {
        this.enlaceLast = enlaceLast;
    }

    public NodoDoble getEnlaceNext() {
        return enlaceNext;
    }

    public void setEnlaceNext(NodoDoble enlaceNext) {
        this.enlaceNext = enlaceNext;
    }

    @Override
    public String toString() {
        return "NodoDoble{" +
                "valor=" + valor.toString() +
                '}';
    }
}
