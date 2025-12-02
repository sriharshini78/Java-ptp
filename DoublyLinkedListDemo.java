import java.util.LinkedList;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("--- i. Create (Insertion using add/addLast) ---");

        list.add(10);
        list.addLast(20);
        list.addFirst(5);
        list.add(2, 15);
        System.out.println(list);

        System.out.println("\n--- ii. Delete a given element (Removal) ---");

        int d = 20;
        boolean r = list.remove(Integer.valueOf(d));

        if (r) {
            System.out.println("Deleted element: " + d);
        } else {
            System.out.println("Element " + d + " not found.");
        }

        System.out.println(list);

        list.removeFirst();
        System.out.println("Deleted head element.");
        System.out.println(list);

        
    }
}