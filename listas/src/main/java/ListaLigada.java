import java.lang.ref.Reference;

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
    public void acceso(ListaLigada lista){
        Nodo temporal = cabeza;
        if (lista != null){
            while (temporal != null){
                System.out.println(temporal.valor + " \n");
                temporal = temporal.enlace;
            }
        }else {
            System.out.println("La lista esta vacia");
        }
    }
    public Nodo busquedaPorValor(Object valor){
        Nodo temporal = cabeza;
        if (temporal.getValor() == valor){
            return temporal;
        }
        while (true){
            if (temporal.enlace != null){
                if (temporal.getValor() != valor){
                    temporal = temporal.enlace;
                }else {
                    return temporal;
                }
            }else {
                break;
            }
            }
        return null;
    }
    public void eliminar(Object valor){
        if (cabeza == null){
            return;
        }
        if (cabeza.valor == valor){
            cabeza = cabeza.enlace;
        }

        Nodo temporal = cabeza;
        while (temporal.enlace != null && temporal.enlace.getValor() != valor){
            temporal = temporal.enlace;
        }
        if (temporal.enlace != null){
            temporal.enlace = temporal.enlace.enlace;
        }
    }
}
