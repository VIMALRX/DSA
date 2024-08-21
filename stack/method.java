import java.util.Stack;
public class method {
    public static void main(String[]args){
     Stack<String> s=new Stack<>();
    System.out.println( s.push("raj"));
    System.out.println(s.push("ganesh"));
    System.out.println(s.pop());
    System.out.println(  s.peek());
    System.out.println(s.search("raj"));
    System.out.println(s.empty());
    System.out.println(s);
    s.clear();
    // System.out.println(s.push("ganesh"));
    // System.out.println();
    // System.out.println(s.search("ganesh"));
    System.out.println(s.empty());

    }
}
