package LinkedList;

public class LinkedList<T> {
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        head = null;
    }

    public void inserirNoInicio(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void inserirNoFim(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean remover(T data) {
        if (head == null) return false;

        if (head.data.equals(data)) {
            head = head.next;
            return true;
        }

        Node<T> current = head;
        Node<T> prev = null;

        while (current != null && !current.data.equals(data)) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
            return true;
        }

        return false;
    }

    public boolean buscar(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void imprimir() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
