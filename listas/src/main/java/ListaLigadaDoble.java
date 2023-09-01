/*
Autor: Aksel Villela
        UNAM
    FES ARAGON
ESTRUCTURAS DE DATOS
    Agosto 2023
 */
public class ListaLigadaDoble {
    NodoDoble inicio;
    NodoDoble fin;

    public ListaLigadaDoble() {
        this.inicio = null;
        this.fin = null;
    }
    public void insercionInicio(Object valor){
        NodoDoble nuevoNodo = new NodoDoble(valor);
        if(inicio == null){
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }else {
            nuevoNodo.enlaceNext = inicio;
            inicio.enlaceLast = nuevoNodo;
            inicio = nuevoNodo;
        }
    }
    public void insercionFinal(Object valor){
        NodoDoble nuevoNodo = new NodoDoble(valor);
        if (fin == null){
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }else {
            nuevoNodo.enlaceLast = fin;
            fin.enlaceNext = nuevoNodo;
            fin = nuevoNodo;
        }
    }
    public void eliminar(Object valor){
        NodoDoble actual = inicio;
        while (actual != null){
            if (actual.valor.equals(valor)){
                if (actual.equals(inicio)){
                    inicio = actual.enlaceNext;
                    if (inicio != null){
                        inicio.enlaceLast = null;
                    }
                } else if (actual == fin) {
                    fin = actual.enlaceLast;
                    if (fin != null){
                        fin.enlaceNext = null;
                    }
                }else {
                    actual.enlaceLast.enlaceNext = actual.enlaceNext;
                    actual.enlaceNext.enlaceLast = actual.enlaceLast;
                }
                return;
            }
            actual = actual.enlaceNext;
        }
    }

    public void acceso(){
        NodoDoble actual = inicio;
        while (actual!= null){
            System.out.println(actual.valor + " ");
            actual = actual.enlaceNext;
        }
    }
    public NodoDoble buscarPorValor(Object valor) {
        NodoDoble actual = inicio;
        while (actual != null) {
            if (actual.valor.equals(valor)) {
                return actual;
            }
            actual = actual.enlaceNext;
        }
        return null;
    }
    public void invertir(){
        NodoDoble temp = null;
        NodoDoble actual = inicio;
        while (actual != null){
            temp = actual.enlaceLast;
            actual.enlaceLast = actual.enlaceNext;
            actual.enlaceNext = temp;
            actual = actual.enlaceLast;
        }
        temp = inicio;
        inicio = fin;
        fin = temp;
    }
}

