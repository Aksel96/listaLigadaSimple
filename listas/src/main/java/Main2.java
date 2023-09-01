public class Main2 {
    public static void main(String[] args) {
        ListaLigadaDoble listaDoble = new ListaLigadaDoble();
        listaDoble.insercionFinal(1);
        listaDoble.insercionFinal(2);
        listaDoble.insercionFinal(3);
        listaDoble.insercionFinal("asd");
        listaDoble.acceso();
        System.out.println("------------");

        listaDoble.insercionInicio(56);
        listaDoble.insercionFinal(2);
        listaDoble.acceso();
        System.out.println("------------");

        listaDoble.eliminar("asd");
        listaDoble.acceso();
        System.out.println("---------");
        NodoDoble nododos = listaDoble.buscarPorValor(1 );
        System.out.println(nododos);

    }
}
