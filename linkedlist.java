// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LL {
    Node head;
    private int size;
    LL()
    {
        this.size = 0;
    }
    class Node{
        String data;
        Node next; 
        
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void addNode(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
             System.out.println("first node created-->"+head.data);
            return;
        }
         System.out.println("added node-->"+ newNode.data+ "  and its next is"+ newNode.next);
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
         
         Node  currentNode = head;
         while(currentNode.next != null)
         {
             currentNode =  currentNode.next;
         }
         currentNode.next = newNode;
    }
    
      public void addToLoc(String data, String nodeV )
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
         Node exNode = new Node(nodeV);
         Node  currentNode = head;
         while(currentNode.data != nodeV)
         {
            if(currentNode.next == null)
            {
                System.out.println("there is nothing like "+nodeV+" in Linkedlist");
                return;
            }
             currentNode =  currentNode.next;
         }

         newNode.next = currentNode.next;
         currentNode.next = newNode;
    }
    
    public void printNode(){
      
        if(head == null)
        {
            System.out.println("there is nothing in linkedList");
            return;
        }
         Node currentNode = head;
        while(currentNode != null)
        {
               System.out.print("-->"+currentNode.data);
                currentNode =  currentNode.next;
        }
        System.out.println();
       
         
    }
    
    public void deleteNode(String data)
    {
        Node currentNode = head;
        if(head == null)
        {
            String newline = System.lineSeparator(); 
                System.out.println(newline+"there is nothing in Linkedlist");
                return;
        }
        if(data == "First")
        {
              if(head.next == null)
            {
                head = null;
                return;
            }
          
            head = currentNode.next; 
              System.out.println("LinkedList first element is removed");
              return;
        }
        else if( data == "Last")
        {
            if(head.next == null)
            {
                head = null;
                return;
            }
            Node first = currentNode;
            Node last = currentNode.next;
            while(last.next != null)
            {
                first = first.next;
                last = last.next;
                 
            }
            first.next = null;
            System.out.println("LinkedList last element is removed ==> "+last.data);
        }
        else {
        System.out.println("Something went wrong!, Please Enter First or Last in delete parameter");
        }
    }
    public static void main(String args[])
    {
        LL list = new LL();
              list.addNode("to");
           list.addNode("time");
           list.addNode("the");
     
        list.addNode("Now");
    
           list.addLast("Change");
        list.printNode();
        list.deleteNode("o");
        list.addToLoc("my", "time" );
        list.printNode();
    }
}
