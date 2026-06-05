package ListaEncadeadaDupla;

public class DoubleLinkedListOfInteger {
    // Referencia para o sentinela de inicio da lista encadeada.
    private Node header;
    // Referencia para o sentinela de fim da lista encadeada.
    private Node trailer;
    // Referencia para a posicao corrente.
    private Node current;
    // Contador do numero de elementos da lista.
    private int count;

    private class Node {
        public Integer element;
        public Node next;
        public Node prev;
        public Node(Integer e) {
            element = e;
            next = null;
            prev = null;
        }
    }

    public DoubleLinkedListOfInteger() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    }

    /**
     * Esvazia a lista
     */
    public void clear() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    }

    /**
     * Retorna true se a lista não contem elementos
     * @return true se a lista não contem elementos
     */
    public boolean isEmpty() {
        return (count == 0);
    }


    /**
     * Retorna o numero de elementos da lista
     * @return o numero de elementos da lista
     */
    public int size() {
        return count;
    }



    public void add(int e){
        //pego o elemento
        Node node = new Node(e);

        Node lastNode = trailer.prev;

        //traailer aponta pra esse nodo(ele vai ser o ultimo)
        node.prev = lastNode;
        node.next = trailer;

        lastNode.next = node;
        trailer.prev = node;
        count++;
    }

    //: insere um elemento em determinada posição (index) da lista
    public void add(int index, int e) {
        //criar o novo nodo;
        Node node = new Node(e);
        Node aux = header.next;
        int i = 0;
        if(index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }
        while(i <= index) {
            if(i == index) {
                //adicionar o nodo aqui
                node.prev = aux.prev;
                node.next = aux;
                aux.prev.next = node;
                aux.prev = node;
                count++;
            }
            //avançar na lista
            aux = aux.next;
            i++;
        }
    }
    //*: get/set o elemento na posição index
    public int get(int index) {
        if(index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }
        Node aux;
        aux = header.next;
        int i = 0;

        while(i < index) {
            aux = aux.next;
            i++;
        }
        return aux.element;
    }

    //adicionar um elemento no indice solicitado
    public int set(int index, int e) {
        if(index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }
        Node aux;
        aux = header.next;
        int i = 0;
        while(i < index) {
            aux = aux.next;
            i++;
        }
        int oldElement = aux.element;
        aux.element = e;

        return oldElement;
    }
    //remove a primeira ocorrência do elemento e da lista
    public boolean remove(int e) {
        int i = 0;
        Node aux;
        aux = header.next;
        while(i < count) {
            if(aux.element.equals(e)) {
                aux.prev.next = aux.next;
                aux.next.prev = aux.prev;
                aux = null;
                count--;
                return true;
            }
            aux = aux.next;
            i++;
        }
        return false;
    }
    //• removeByIndex (index)*: remove o elemento da posição index
    public boolean removeByIndex(int index) {
        int i = 0;
        Node aux;
        aux = header.next;
        while(i < count) {
            if(i == index) {
                aux.prev.next = aux.next;
                aux.next.prev = aux.prev;
                count--;
                return true;
            }
            aux = aux.next;
            i++;
        }
        return false;
    }

    public boolean contains(int e) {
        int i = 0;
        Node aux;
        aux = header.next;
        while(i <= count) {
            if(aux.element.equals(e)){
                return true;
            }
            i++;
            aux = aux.next;
        }
        return false;
    }

    public int indexOf(int e) {
        int i = 0;
        Node aux;
        aux = header.next;
        while(i <= count) {
            if(aux.element.equals(e)){
                return i;
            }
            aux = aux.next;
            i++;
        }
        return -1;
    }
    //que retorna um arranjo com os elementos da lista original entre fromIndex (inclusivo) e toIndex (exclusivo).
    public int subList(int fromIndex, int toIndex) {

    }
    //que inverte o conteúdo da lista.
    public void reverse() {

    }
    //que conta o número de ocorrências do elemento passado como parâmetro na lista, retornando este valor.
    public int contaOcorrencias(int element) {

    }




    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        Node aux = header.next;
        for (int i = 0; i < count; i++) {
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }
        return s.toString();
    }

}


