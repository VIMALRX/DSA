package Queue;
class queue{
    int arr[];
    int rear,front;

    queue(int size){
   rear=-1;
   front=0;
   arr= new int[size];
    }
    void enqueue(int n){
        if(rear>arr.length-2){
            System.out.println("Queue Overflowed");
        }
        else{
            arr[++rear]=n;
            System.out.println(arr[rear]);
        } 
    }
    void dequeue(){
        if(rear<0){
            System.out.println("Queue UnderFlow");
        }
        else{
            System.out.println(arr[front++]);
        }
    }
    void print(){
        for(int i=front;i<=rear;i++){
            System.out.print(" "+arr[i]);
        }
    }
}

 class Main {
public static void main(String[]args){
       queue q=new queue(5);
       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(3);
       q.enqueue(4);
       q.enqueue(5);
       q.enqueue(3); q.enqueue(3);
       q.dequeue();
       q.dequeue();
       q.dequeue();
    //    q.enqueue(3); q.enqueue(3);
       q.print();
       System.out.println();
    //    q.dequeue();
    // //    q.enqueue(3);
    //    q.print();
}}
