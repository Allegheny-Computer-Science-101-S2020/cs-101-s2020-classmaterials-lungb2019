public class Links extends Node {
    private Node head;
    private int size;
	public Links() {
		head = null;
		size = 0;
    } //constructor
    public void insertNode(int index, int data){
        if (index < 0)
            System.out.println("node cannot be inserted");
        else{
            int currentIndex = 1;
            Node current = head;
            while(current != null && index > currentIndex){
                current = current.getNext();
                currentIndex++;
            }
            Node temp = new Node(data);
            if (index == 0){
                /* insert at the front.*/
                temp.setNext(head);
                head = temp;
            }
            else{
                /* insert in the middle or at the end? */

            }


        }

    }
    public void displayNodes() {
        if(size < 1) {
            //index not valid
            System.out.println("list is empty");
        }
        else{
            Node current = head;
            while(current != null){

                System.out.print(current.getData() + "->");
                current = current.getNext();
            }
            System.out.print("\n");
        }

        Public static void printlinks(Links List, int ListNo){
          System.out.println("list" + ListNo + ":[");
          for (int i = 0; i< list.size(); i++){
            system.out.print(" " + list.get(i));         }
        }
    }
        Public void reverseList(){

          Node next = null;
          Node prev = null;
          Node current = head;
          while(current! = null){
            next = cuttrny.getNext();
            current.setNext(prev);
            prev = current;
            current = next;

          }
          head = prev;
        }
}
