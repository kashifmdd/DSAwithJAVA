import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        // List or Collection -> interface
        // ArrayList -> concrete class
        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        Collection<Integer> collection = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        // addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(20);
        // addAll
        list.addAll(list2);
        System.out.println(list);

        // removeAll
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        // clear
        System.out.println(list2);
        list2.clear();
        System.out.println(list2.size());

        // i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println("Element : " + iterator.next());
        }

        // get/set methods
        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(22);
        list3.add(33);
        System.out.println(list3.get(1));
        System.out.println("Before set: " + list3);
        list3.set(0, 99);
        System.out.println("After set: " + list3);

        // toArray
        Object[] arr = list3.toArray();
        for(Object obj: arr){
            System.out.println("obj: "+obj);
        }

        // Contains
        System.out.println("Contains: "+list3.contains(999));

        // sort an arrayList
        System.out.println(list);
        list.add(22);
        list.add(33);
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Collections.sort: "+list);
        Collections.sort(list.reversed());
        System.out.println("Reversed: "+list);

        // Clone
        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
        System.out.println("newList : "+newList);

        // ensureCapacity
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100); // array capacity lock to 100
        System.out.println(marks.isEmpty());

        // indexOf()
        System.out.println("newList Index: "+newList.indexOf(22));
    }
}
