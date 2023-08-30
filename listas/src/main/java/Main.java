public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.insercion(1);
        lista.insercion(2);
        lista.insercion(3);
        lista.acceso(lista);
        Nodo nodo = lista.busquedaPorValor(2);
        System.out.println(nodo);
        lista.eliminar(1);
        lista.acceso(lista);
    }
}
