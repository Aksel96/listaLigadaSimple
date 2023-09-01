/*
Autor: Aksel Villela
        UNAM
    FES ARAGON
ESTRUCTURAS DE DATOS
    Agosto 2023
 */
public class ListaCircular {
    Nodo cabeza;
    public ListaCircular(){
        cabeza = null;
    }
    public void insercion(Object valor){
        Nodo nuevoNodo = new Nodo(valor);
        if (cabezaEstaVacia()){
            nuevoNodo.enlace = nuevoNodo;
            cabeza = nuevoNodo;
        }else {
         nuevoNodo.enlace = cabeza.enlace;
         cabeza.enlace = nuevoNodo;
        }
    }
    public void eliminar(Object valor){
        if (!cabezaEstaVacia()){
            if(cabeza.valor.equals(valor)){
                if (cabeza.enlace == cabeza){
                    cabeza = null;
                }else{
                    Nodo ultimo = cabeza;
                    while (ultimo.enlace != cabeza){
                        ultimo = ultimo.enlace;
                    }
                    ultimo.enlace = cabeza.enlace;
                    cabeza = cabeza.enlace;
                }
            }else {
                Nodo actual = cabeza;
                Nodo anterior = null;
                do {
                    anterior = actual;
                    actual = actual.enlace;
                }while (actual != cabeza && !actual.valor.equals(valor));
                if (actual != cabeza){
                    anterior.enlace = actual.enlace;
                }
            }
        }
    }
    public void acceso(){
        if (!cabezaEstaVacia()){
            Nodo actual = cabeza;
            do {
                System.out.println(actual.valor.toString() + " ");
                actual = actual.enlace;
            }while (actual != cabeza);
        }
    }

    public Nodo buscar(Object valor){
        if (!cabezaEstaVacia()){
            Nodo actual = cabeza;
            do {
                if (actual.valor.equals(valor)){
                    return actual;
                }
                actual = actual.enlace;
            }while (actual!= cabeza);
        }
        return null;
    }

    public boolean cabezaEstaVacia(){
        return cabeza == null;
    }

}
