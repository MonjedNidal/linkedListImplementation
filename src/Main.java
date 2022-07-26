public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtTail("Monjed" );
        list.insertAtTail("Nidal");
        list.insertAtTail("Maswadeh");
//
        list.print();
//        System.out.println(list.isFound("data"));
        
        list.delete("Monjed");

        list.print();

    }
}
