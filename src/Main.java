import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        System.out.println("hashset vuoto: " + numbers);
        System.out.println("hashset popolato: " + fill(numbers));
        System.out.println("ogni elemento è uguale all'oggetto creato? " + verify(numbers));
        System.out.println("hashset svuotato: " + clear(numbers));
    }

    public static Set<Integer> fill(Set<Integer> list) {
        list = new HashSet<>();
        list.add(22);
        list.add(6);
        list.add(3);
        list.add(7);
        return list;
    }

    public static boolean verify(Set<Integer> list) {
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {
            Integer e = i.next();
            if (e.equals(i)) {
                i.remove();
            }
        }
        return true;
    }

    public static Set<Integer> clear(Set<Integer> list) {
        list = new HashSet<>();
        list.clear();
        return list;
    }
}
