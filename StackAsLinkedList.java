public class StackAsLinkedList{

     StackNode root;

     static class StackNode{
       
        String Student;
        StackNode next;

        StackNode(String Student){
            this.Student = Student;
        }
    }

    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        else
              return false;
    }

    public void push(String Student){
        StackNode  newNode = new StackNode(Student);
        if(root==null){
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(Student + "Pushed to Stack");
    }

    public Student pop(){
       int popped = Integer.MIN_VALUE;
       if(root == null){
        System.out.println("Stack is Empty");
       }
       else{
        popped = root.Student;
        root = root.next;
       }
       return popped;
    }

    public int peek(){
        if(root == null){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        else{
            return root.Student;
        }
    }
       
}