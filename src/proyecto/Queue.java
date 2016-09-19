package proyecto;

/**
 * Created by Turpitude on 19/09/2016.
 */
public interface Queue<E> {
   int size();
   void enqueue(E e);
   E dequeue (int j);

}
