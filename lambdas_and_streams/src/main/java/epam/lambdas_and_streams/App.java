package epam.lambdas_and_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class App 
{
    public static void main( String[] args )
    {
    	new Task1().task1();
    	System.out.println();
    	new Task2().task2();
    	System.out.println();
    	new Task3().task3();
    }
}

class Task1 {
   void task1() {
        IntStream stream = IntStream.of(10, 20, 30, 30, 50, 60, 70, 80, 90);
        OptionalDouble obj = stream.average();
        if (obj.isPresent()) {
            System.out.println(obj.getAsDouble());
        } else {
            System.out.println(-1);
        }
    }
}
class Task2 {
    void task2() {
        List<String> l1 = new ArrayList<String>();
        l1.add("bob");
        l1.add("and");
        l1.add("addddda");
        l1.add("Ana");
        l1.add("abb");
        l1.add("ace");
        l1 = search(l1);
        for (String i : l1)
            System.out.println(i);
    }

    static List<String> search(List<String> l1) {
        return l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
    }
}
 class Task3 {
	 void task3() {
        List<String> list1 = new ArrayList<String>();
        list1.add("anand");
        list1.add("anna");
        list1.add("aba");
        list1.add("radar");
        list1 = pal(list1);
        for (String i : list1)
            System.out.println(i);
    }

    static List<String> pal(List<String> list1) {
        List<String> list2 = new ArrayList<String>();
        for (String i : list1) {
            String t = i.replaceAll("\\s+", "").toLowerCase();
            if (IntStream.range(0, t.length() / 2).noneMatch(j -> t.charAt(j) != t.charAt(t.length() - j - 1)))
                list2.add(i);
        }
        return list2;
    }
}