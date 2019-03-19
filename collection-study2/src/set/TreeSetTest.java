package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        //添加元素
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(3);
        //创建迭代器
        Iterator<Integer> it = set.iterator();
        System.out.println("Set集合中的元素");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
