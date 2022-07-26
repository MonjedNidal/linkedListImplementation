
public class Item {
    String name;
    Item next;

    public static int index = 0;

    public Item(String name){
        this.name=name;
        index++;
    }

    public int getIndex() {
        return index;
    }

    public void setname(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public void setNext(Item next){
        this.next=next;
    }

    public Item getNext(){
        return next;
    }
}