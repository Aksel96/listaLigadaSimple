import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcion;
        String opcionList;
        do{
            menu();
            Scanner scannerOpcionLista = new Scanner(System.in);
            opcionList = scannerOpcionLista.nextLine();
            switch (opcionList){
                case "1":
                    ListaLigada lista = new ListaLigada();
                    do{
                        menuLista();
                        Scanner scannerMenuLista = new Scanner(System.in);
                        int opcionMenuList = scannerMenuLista.nextInt();
                        if (!(opcionMenuList == 6)){
                            listaSimple(opcionMenuList,lista);
                        }else {
                            opcionList = "S";
                        }
                    }while (!opcionList.equals("S"));
                    break;
                case "2":
                    ListaLigadaDoble listaDoble = new ListaLigadaDoble();
                    do {
                        menuListaDoble();
                        Scanner scannerMenuLista = new Scanner(System.in);
                        int opcionMenuList = scannerMenuLista.nextInt();
                        if (!(opcionMenuList == 7)) {
                            listaDoble(opcionMenuList, listaDoble);
                        } else {
                            opcionList = "S";
                        }
                    }while (!opcionList.equals("S"));
                    break;
                case "3":
                    ListaCircular listaCircular = new ListaCircular();
                    do {
                        menuListaCircular();
                        Scanner scannerMenuLista = new Scanner(System.in);
                        int opcionMenuList = scannerMenuLista.nextInt();
                        if (!(opcionMenuList == 5)){
                            listaCircular(opcionMenuList,listaCircular);
                        }else {
                            opcionList = "S";
                        }
                    }while (!opcionList.equals("S"));
                    break;
                case "4":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println(" QUIERES SALIR DEL PROGRAMA? ");
            System.out.println("\t SI = [s]\tNO = [n] : ");
            System.out.print("-> ");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextLine();
            opcion.toUpperCase();
        }while (!opcion.toUpperCase().equals("S"));

    }
    public static void menu(){
        System.out.println("\n------------------------------------------------------");
        System.out.println("\tCREACION DE LISTAS");
        System.out.println("\tELIJE QUE TIPO DE LISTA CREAR");
        System.out.println("\t1) Lista Ligada Simple ");
        System.out.println("\t2) Lista Ligada Doble");
        System.out.println("\t3) Lista Circular");
        System.out.println("\t4) Salir");
        System.out.println("------------------------------------------------------");
        System.out.print("-> ");
    }
    public static void menuLista(){
        System.out.println("\n------------------------------------------------------");
        System.out.println("\tLISTA LIGADA SIMPLE");
        System.out.println("\tMetodos de la lista:");
        System.out.println(" 1) Acceso");
        System.out.println(" 2) Busqueda");
        System.out.println(" 3) Insercion");
        System.out.println(" 4) Eliminacion");
        System.out.println(" 5) Invertir");
        System.out.println(" 6) Salir");
        System.out.println("------------------------------------------------------");
        System.out.print("-> ");
    }
    public static void menuListaDoble(){
        System.out.println("\n------------------------------------------------------");
        System.out.println("\tLISTA LIGADA DOBLE");
        System.out.println("\tMetodos de la lista:");
        System.out.println(" 1) Acceso");
        System.out.println(" 2) Busqueda");
        System.out.println(" 3) Insercion al Inicio");
        System.out.println(" 4) Insercion al Final");
        System.out.println(" 5) Eliminacion");
        System.out.println(" 6) Invertir");
        System.out.println(" 7) Salir");
        System.out.println("------------------------------------------------------");
        System.out.print("-> ");
    }
    public static void menuListaCircular(){
        System.out.println("\n------------------------------------------------------");
        System.out.println("\tLISTA CIRCULAR");
        System.out.println("\tMetodos de la lista:");
        System.out.println(" 1) Acceso");
        System.out.println(" 2) Busqueda");
        System.out.println(" 3) Insercion");
        System.out.println(" 4) Eliminacion");
        System.out.println(" 5) Salir");
        System.out.println("------------------------------------------------------");
        System.out.print("-> ");
    }
    public static void listaSimple(int opcion, ListaLigada lista ){
        switch (opcion){
            case 1:
                System.out.println("##########################");
                lista.acceso();
                System.out.println("##########################");
                break;
            case 2:
                System.out.print("Introduzca el valor a buscar en el lista: ");
                Scanner scanBusqueda = new Scanner(System.in);
                Object valor = scanBusqueda.nextLine();
                Nodo nodo = lista.busquedaPorValor(valor);
                System.out.println("##########################");
                if (nodo != null){
                    System.out.println(nodo);
                }else {
                    System.out.println("NODO NO ENCONTRADO");
                }
                System.out.println("##########################");
                break;
            case 3:
                System.out.print("Introduzca el valor del nuevo nodo: ");
                Scanner scanInsercion = new Scanner(System.in);
                Object valorNodo = scanInsercion.nextLine();
                lista.insercion(valorNodo);
                break;
            case 4:
                System.out.print("Introduzca el valor del nodo a eliminar: ");
                Scanner scanEliminar = new Scanner(System.in);
                Object valorNodoEliminar = scanEliminar.nextLine();
                lista.eliminar(valorNodoEliminar);
                break;
            case 5:
                System.out.println("##########################");
                System.out.println("Se invirtio la lista:");
                lista.invertir();
                lista.acceso();
                System.out.println("##########################");
            case 6:
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public static void listaDoble(int opcion, ListaLigadaDoble lista){
        switch (opcion){
            case 1:
                System.out.println("##########################");
                lista.acceso();
                System.out.println("##########################");
                break;
            case 2:
                System.out.print("Introduzca el valor a buscar en el lista: ");
                Scanner scanBusqueda = new Scanner(System.in);
                Object valor = scanBusqueda.nextLine();
                NodoDoble nodo = lista.buscarPorValor(valor);
                System.out.println("##########################");
                if (nodo != null){
                    System.out.println(nodo);
                }else {
                    System.out.println("NODO NO ENCONTRADO");
                }
                System.out.println("##########################");
                break;
            case 3:
                System.out.print("Introduzca el valor del nuevo nodo al inicio: ");
                Scanner scanInsercion = new Scanner(System.in);
                Object valorNodo = scanInsercion.nextLine();
                lista.insercionInicio(valorNodo);
                break;
            case 4:
                System.out.print("Introduzca el valor del nuevo nodo al final: ");
                Scanner scanInsercionFinal = new Scanner(System.in);
                Object valorNodoF = scanInsercionFinal.nextLine();
                lista.insercionFinal(valorNodoF);
                break;
            case 5:
                System.out.print("Introduzca el valor del nodo a eliminar: ");
                Scanner scanEliminar = new Scanner(System.in);
                Object valorNodoEliminar = scanEliminar.nextLine();
                lista.eliminar(valorNodoEliminar);
                break;
            case 6:
                System.out.println("##########################");
                System.out.println("Se invirtio la lista:");
                lista.invertir();
                lista.acceso();
                System.out.println("##########################");
                break;
            case 7:
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public static void listaCircular(int opcion,ListaCircular lista){
        switch (opcion){
            case 1:
                System.out.println("##########################");
                lista.acceso();
                System.out.println("##########################");
                break;
            case 2:
                System.out.print("Introduzca el valor a buscar en el lista: ");
                Scanner scanBusqueda = new Scanner(System.in);
                Object valor = scanBusqueda.nextLine();
                Nodo nodo = lista.buscar(valor);
                System.out.println("##########################");
                if (nodo != null){
                    System.out.println(nodo);
                }else {
                    System.out.println("NODO NO ENCONTRADO");
                }
                System.out.println("##########################");
                break;
            case 3:
                System.out.print("Introduzca el valor del nuevo nodo: ");
                Scanner scanInsercion = new Scanner(System.in);
                Object valorNodo = scanInsercion.nextLine();
                lista.insercion(valorNodo);
                break;
            case 4:
                System.out.print("Introduzca el valor del nodo a eliminar: ");
                Scanner scanEliminar = new Scanner(System.in);
                Object valorNodoEliminar = scanEliminar.nextLine();
                lista.eliminar(valorNodoEliminar);
                break;
            case 5:
                break;
            default:
                System.out.println("Opcion no valida");

        }
    }

}
