import LinkedList.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.inserirNoInicio("augusto");
        myList.imprimir();
        myList.inserirNoFim("prof.yago.s2");
        myList.imprimir();
        myList.remover("augusto");
        myList.imprimir();
    }
}
