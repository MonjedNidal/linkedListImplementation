import javax.imageio.event.IIOReadProgressListener;

public class LinkedList {
    private Item root;

    public LinkedList(){
        root=null;
    }
    public void setRoot(Item root){
        this.root=root;
    }

    public Item root(){
        return root;
    }
    public boolean isEmpty(){
        return root==null;
    }

    public void insertAtHead(String name){
        Item item = new Item(name);
        item.setNext(root);
        root=item;
    }

    // InsertAtTail function takes the name and make an item object for it,
// then insert the object after the last item in the list.
    public void insertAtTail(String name) {
        Item new_item = new Item(name);// create the new item object with the passed name.
        // initialize the object current to be equals root to start from it in the loop.
        Item current = root;

        // here if the list is empty then insert the item in the head of the list.
        // else use the while loop to go to the last item in the list and save it in current object.
        if (isEmpty()) {
            insertAtHead(name);
        }
        else{
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new_item); // pass the new item to the next of the last item of the list.
        }
    }

    public void insertInOrder (String name){
        Item prev = null;
        Item curr = root;

        while (curr != null && curr.getName().compareTo(name) < 0) {
            prev = curr;
            curr = curr.getNext();
        }
            if (prev == null){
                insertAtHead(name);

            }else if (curr == null){
                prev.setNext(new Item(name));
            }else{
                Item item = new Item(name);
                prev.setNext(item);
                item.setNext(curr);

            }
    }

    public void delete(String name) {
        Item prev = null;
        Item curr = root;

        while (curr != null && !curr.getName().equals(name)) {
            prev = curr;
            curr = curr.getNext();
        }
        if (curr != null) {
            if (prev == null) {
                root = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
        } else {
            System.out.println("Item not found!");
        }
    }
    public boolean isFound(String name){
        Item current; // current object used to see all list items if their data equals the data we're searching for
        for (current = root; current != null; current = current.getNext()) {
            if(current.getName().equals(name)){
                return true;
            }
        }return false;
    }

    public void print() {
        Item current;
        for (current = root; current != null; current = current.getNext()) {
            System.out.println(current.getName());
        }
    }

}