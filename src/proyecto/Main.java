package proyecto;

public class Main {

    public static void main(String[] args) {


	Queue<Integer> cola = new QueueImpl<Integer>(7);
        cola.enqueue(0);
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        cola.enqueue(4);
        cola.enqueue(5);
        cola.enqueue(6);
        cola.enqueue(7);

        for(int i=0;i<8;i++){
            System.out.print(cola.dequeue());
        }
    }
}
