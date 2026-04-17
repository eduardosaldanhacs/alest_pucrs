package ListaEncadeadaSimples;

public class LinkedListOfInteger {

    // Classe interna Node
    private class Node {
        public Integer element;
        public Node next;

        public Node(Integer element) {
            this.element = element;
            next = null;
        }

        public Node(Integer element, Node next) {
            this.element = element;
            this.next = next;
        }
    }


    // Referência para o primeiro elemento da lista encadeada.
    private Node head;
    // Referência para o último elemento da lista encadeada.
    private Node tail;
    // Contador para a quantidade de elementos que a lista contem.
    private int count;


    /**
     * Construtor da lista.
     */
    public LinkedListOfInteger() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Esvazia a lista
     */
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * Adiciona um elemento ao final da lista.
     *
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element) {
        Node n = new Node(element);
        if (head == null) {
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
        count++;
    }

    /**
     * insere um elemento em determinada posição (index) da lista
     * @param index indice do elemento a ser inserido
     * @param e elemento a ser inserido
     */
    public void add(int index, Integer e) {
        Node current = head;
        Node n = new Node(e);

        if(head == null) {
            head = n;
        } else {
            int cont = 0;
            Node valorAtual;
            while(current != null) { //enquanto nao terminar a lista
                if(cont == index) { // quando for igual colocar o elemento do parametro aqui nesse indice
                    current = n; //colocar o elemento informado no indice
                }
                current = current.next;
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        Node aux = head;

        while (aux != null) {
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }

        return s.toString();
    }

    ///////////////////////////////////////////////////
    //// EXERCICIOS - VEJA SLIDES E ENUNACIADO
    ///////////////////////////////////////////////////

    // 1 - implemente o método isEmpty
    /*
     * Retorna true se a lista nao contem elementos.
     *
     * @return true se a lista nao contem elementos
     */
    //assinatura do metodo
    public boolean isEmpty() {
        return count == 0;
    }

    // 2 - implemente o método size
    /*
     * Retorna o numero de elementos da lista.
     *
     * @return o numero de elementos da lista
     */
    ////assinatura do metodo
    public int size() {
       Node current = head;
       int size = 0;
       for(int i = 0; i < count; i++) {
           if(current.element != null) {
               size++;
           }
           current = current.next;
       }
       return size;
    }


    // 3 - implemente o método get
    /*
     * Retorna o elemento de uma determinada posicao da lista.
     * @param index a posiÃ§Ã£o da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */

    /* Exemplo - veja o main
    Lista:
        2
        4
        8
        lista.get(1)
        Elemento na segunda posicao da lista: 4
     */

    //assinatura do metodo
    public Integer get(int index) {
        Node current = head;
        for(int i = 0; i < count; i++) {
            if(i == index) {
                return current.element;
            }
            current = current.next;
        }
        return null;
    }
}
