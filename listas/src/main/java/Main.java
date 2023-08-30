import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcion;
        String opcionList;
        do{
            menu();
            Scanner scannerOpcionLista = new Scanner(System.in);
            opcionList = scannerOpcionLista.nextLine();
            if (opcionList.equals("s")){
                ListaLigada lista = new ListaLigada();
                do{
                menuLista();
                Scanner scannerMenuLista = new Scanner(System.in);
                int opcionMenuList = scannerMenuLista.nextInt();
                switch (opcionMenuList){
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
                        System.out.println(nodo);
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
                        opcionList = "S";
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }while (!opcionList.equals("S"));}
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
        System.out.println("\tQUIERES CREAR UNA NUEVA LISTA LIGADA SIMPLE?");
        System.out.println("\t SI = [s]\tNO = [n]");
        System.out.println("------------------------------------------------------");
        System.out.print("-> ");
    }
    public static void menuLista(){
        System.out.println("\n------------------------------------------------------");
        System.out.println("\tMetodos de la lista, Escoja una Opcion");
        System.out.println(" 1) Acceso");
        System.out.println(" 2) Busqueda");
        System.out.println(" 3) Insercion");
        System.out.println(" 4) Eliminacion");
        System.out.println(" 5) Salir");
        System.out.println("------------------------------------------------------");
        System.out.print("-> ");

    }
}
