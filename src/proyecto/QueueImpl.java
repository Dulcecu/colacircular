package proyecto;

/**
 * Created by Turpitude on 19/09/2016.
 */
public class QueueImpl<E> implements Queue<E>{

    int i=-1;
    int j =0;
    int size=0;
    int len;
    int vuelta=0;
    E[] elements;

    public QueueImpl(int len) {
        this.elements= (E[])new Object[len];
        this.len=len;
    }

    public int size() {
        return this.size;
    }

    public void enqueue (E e){







        if(this.j==this.len)
        {
            this.j=0;
        }
        this.i++;

        if(this.i==this.len)
        {
            this.i=0;
            vuelta++;
        }
        if(this.i==this.j)
        {
            if(vuelta>0) {
                this.j++;

            }

        }
        elements[this.i] = e;


        if(this.size!=len) {
            this.size++;
        }



    }
    public E dequeue() {

        E copia;
        copia=elements[this.j];

        for(int x=this.j;x<len;x++) {


            if (x == len-1) {
                if(this.i!=x) {

                    elements[x] = elements[0];
                    x = -1;
                    this.j--;
                    this.i--;
                    if(this.i==-1)
                    {
                        this.i=len-1;
                    }
                }
                else
                {
                    x=len;
                }
            }
            else {
                elements[x] = elements[x + 1];
            }
        }

        this.size--;
        return copia;

    }

}
