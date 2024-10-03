package Collections;
//Create a LinkedList of 4 countries, add one country to the beginning and one at the end, 
//then print the list in reverse order.
import java.util.LinkedList;
import java.util.ListIterator;
class ArrayEx3{
    public static void main(String[] args) {
        LinkedList <String> l = new LinkedList<>();
        l.add("India");
        l.add("Australia");
        l.add("South korea");
        l.add("Europe");

        l.addFirst("America");
        l.addLast("Japan");

System.out.println("Countries in reverse order: ");

ListIterator<String> i = l.listIterator(l.size());

while(i.hasPrevious()){
    System.out.println(i.previous());
}

    }
}
