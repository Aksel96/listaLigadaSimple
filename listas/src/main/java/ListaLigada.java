/*
Autor: Aksel Villela
        UNAM
    FES ARAGON
ESTRUCTURAS DE DATOS
    Agosto 2023
 */
public class ListaLigada {
    Nodo cabeza;

    public ListaLigada() {
        cabeza = null;
    }
    public void insercion(Object valor){
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null){
            cabeza = nuevoNodo;
        }else {
            Nodo temporal = cabeza;
            while (temporal.enlace != null){
                temporal = temporal.enlace;
            }
            temporal.enlace = nuevoNodo;
        }
    }
    public void acceso(){
        Nodo temporal = cabeza;
        while (temporal != null){
            System.out.println(temporal.valor + " ");
            temporal = temporal.enlace;
        }
    }
    public Nodo busquedaPorValor(Object valor){
        Nodo temporal = cabeza;
        if (temporal.getValor().equals(valor)){
            return temporal;
        }
        while (true){
            if (temporal.enlace != null){
                if (!temporal.getValor().equals(valor)){
                    temporal = temporal.enlace;
                }else {
                    return temporal;
                }
            }else {
                if (temporal.enlace==null){
                    if (temporal.getValor().equals(valor)){
                        return temporal;
                    }
                }
                break;
            }
            }
        return null;
    }
    public void eliminar(Object valor){
        if (cabeza == null){
            return;
        }
        if (cabeza.valor.equals(valor)){
            cabeza = cabeza.enlace;
        }

        Nodo temporal = cabeza;
        while (temporal.enlace != null && !temporal.enlace.valor.equals(valor)){
            temporal = temporal.enlace;
        }
        if (temporal.enlace != null){
            temporal.enlace = temporal.enlace.enlace;
        }
    }
    public void invertir(){
        Nodo previo = null;
        Nodo actual = cabeza;
        Nodo siguiente = null;
        while (actual != null){
            siguiente = actual.enlace;
            actual.enlace = previo;
            previo = actual;
            actual = siguiente;
        }
        cabeza = previo;
    }

}
