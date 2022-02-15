public class CustomLinkedList{
    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList(){
        this.size=0;
    }

    public class Node{
        private int value;  
        private Node next;  
        
        public Node(int value){                 
            this.value=value;
        }
        public Node(int value,Node next){       
            this.value=value;
            this.next=next;
        }
    }

    //-----display methods-----//

    //display1
    public void display1(){  //using size variable
        Node temp=head;
        for(int i=0;i<size;i++){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        if(size>0){
            System.out.println("END");
        }
    }

    //display2
    public void display2(){  //without using size variable
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        if(size>0){
            System.out.println("END");
        }
    }

    //-----insertion methods-----//

    //insertFirst1
    public void insertFirst1(int value){ //original
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    //insertFirst2
    public void insertFirst2(int value){ //step reduced 
        Node node=new Node(value,head);
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    
    //insertLast1
    public void insertLast1(int value){  //insertFirst used
        if(tail==null){
            insertFirst1(value);
            //insertFirst2(value);  
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size+=1;
    }

    //insertLast2
    public void insertLast2(int value){  //insertFirst not used
        if(tail==null){
            Node node=new Node(value);
            node.next=head;
            head=node;
            if(tail==null){
                tail=head;
            }
            size+=1;
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size+=1;
    }

    //insert1
    public void insert1(int value,int index){ //insertFirst & insertLast used
        if(index<0){
            System.out.println("Index cannot be negative");
            return;
        }
        if(index>size){
            System.out.println("Index out of bound");
            return;
        }
        if(index==0){
            insertFirst1(value);
            //insertFirst2(value);
            return;
        }
        if(index==size){
            insertLast1(value);
            //insertLast2(value);
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size+=1;
    }

    //insert2
    public void insert2(int value,int index){ //insertFirst & insertLast not used
        if(index<0){
            System.out.println("Index cannot be negative");
            return;
        }
        if(index>size){
            System.out.println("Index out of bound");
            return;
        }
        if(index==0){
            Node node=new Node(value);
            node.next=head;
            head=node;
            if(tail==null){
                tail=head;
            }
            size+=1;
            return;
        }
        if(index==size){
            if(tail==null){
                Node node=new Node(value);
                node.next=head;
                head=node;
                if(tail==null){
                    tail=head;
                }
                size+=1;
                return;
            }
            Node node=new Node(value);
            tail.next=node;
            tail=node;
            size+=1;
            return;
        }
        Node temp=head;
        for(int i=0;i<index-2;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size+=1;
    }

    //-----deletion methods-----//

    //deleteFirst1
    public void deleteFirst1(){  
        head=head.next;
        if(head==null){
            tail=null;
        }
        size-=1;
    }

    //deleteLast1
    public void deleteLast1(){  //deleteFirst used
        if(size<=1){
            deleteFirst1();
            return;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size-=1;
    }

    //deleteLast2
    public void deleteLast2(){  //deleteFirst not used
        if(size<=1){
            head=head.next;
            if(head==null){
                tail=null;
            }
            size-=1;
            return;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size-=1;
    }

    //delete1
    public void delete1(int index){ //deleteFirst & deleteLast used
        if(index<0){
            System.out.println("Index cannot be negative");
            return;
        }
        if(index>size-1){
            System.out.println("Index out of bound");
            return;
        }
        if(index==0){
            deleteFirst1();
            return;
        }
        if(index==size-1){
            deleteLast1();
            //deleteLast2();
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size-=1;
    }

    //delete2
    public void delete2(int index){ //deleteFirst & deleteLast not used
        if(index<0){
            System.out.println("Index cannot be negative");
            return;
        }
        if(index>size-1){
            System.out.println("Index out of bound");
            return;
        }
        if(index==0){
            head=head.next;
            if(head==null){
                tail=null;
            }
            size-=1;
            return;
        }
        if(index==size-1){
            if(size<=1){
                head=head.next;
                if(head==null){
                    tail=null;
                }
                size-=1;
                return;
            }
            Node temp=head;
            for(int i=0;i<size-2;i++){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size-=1;
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size-=1;
    }
}