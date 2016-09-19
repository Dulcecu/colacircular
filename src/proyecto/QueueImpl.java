package proyecto;

/**
 * Created by Turpitude on 19/09/2016.
 */
public class QueueImpl<E> implements Queue<E>{

    int i=0;
    int size=0;
    E[] elements;

    public QueueImpl(int len) {
        this.elements= (E[])new Object[len];
    }

    public int size() {
        return this.size;
    }

    public void enqueue (E e){

        while(elements[this.i]!=null) {
            i++;
        }
        elements[this.i] = e;
        this.size++;


    }
    public E dequeue(int j) {

        this.size--;
        return elements[j];

    }

}
