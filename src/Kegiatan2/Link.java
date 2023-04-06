package Kegiatan2;

public class Link {
    Node head;

    public Link(){
        this.head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null){
                currentNode= currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    // sorting data
    public void sort(){
        Node current = head;
        Node nextNode;
        int temp;

        if (head == null){
        } else {
            while (current != null){
                nextNode = current.next;
                while (nextNode != null){
                    if (current.data > nextNode.data){
                        temp = current.data;
                        current.data = nextNode.data;
                        nextNode.data = temp;
                    }
                    nextNode = nextNode.next;
                }
                current = current.next;
            }
        }
    }
    public void printList(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}