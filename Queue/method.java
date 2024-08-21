package Queue;
import java.util.LinkedList;
import java.util.Queue;
class method {
    public static void main(String[]args){
        Queue <String> q=new LinkedList<>();
    System.out.println(q.add("Apple"));
    System.out.println(q.add("Orange"));
    System.out.println(q.add("Graphs"));
    System.out.println(q.add("Bannana"));
    System.out.println(q.remove("Apple"));
    System.out.println(q);
    System.out.println(q.remove());
    System.out.println(q);
    
    System.out.println(q.poll());
    System.out.println(q);}
}
