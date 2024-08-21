
class Stack{
    int max=10;
    int top;
    int arr[]=new int[max];
    Stack(){
         top=-1;
    }
    void push(int x){
   if(top>=max-1){
    System.out.println("Stack Overflowed");}
    else{
        System.out.println("pushed into Stack");
        arr[++top]=x;
    }
   }
   void peek(){
    System.out.println(arr[top]);
   }
   void pop(){
    if(top<0){
        System.out.println("Stack Underflow");
    }
    else{
        System.out.println(arr[top--]);
    }
   }
   void is_empty(){
    if(top<0){
   System.out.println("Stack is Empty");
    }
    else{
        System.out.println("Stack is Not Empty");
    }
   }
   void print(){
    for(int i=top;i>=0;i--){
        System.out.print(" "+arr[i]);
    }
   }
    }
class Main{

    public static void main(String[]args){
        Stack s=new Stack();
    s.push(20);
    s.push(30);
    s.push(10);
    s.push(90);
    s.push(20);
    s.push(30);
    s.push(10);
    s.push(90);
    s.push(20);
    s.push(30);
    s.push(10);
    s.push(90);
    s.peek();
   s.is_empty();
s.print();
System.out.println();
s.pop();
s.print();}
       
}