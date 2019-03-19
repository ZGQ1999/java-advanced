package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * set 接口
 *
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);
      //用FOR循环
        System.out.println("用for循环输出");
        Object[]array = set.toArray();
        for (int t = 0, len = array.length; t<len; t++) {
            System.out.println();
        }
        //迭代器
        System.out.println("用迭代器输出");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "  ");
        }
        //Lambda表达式
        System.out.println("用Lambda表达式输出");
        set.forEach(s -> System.out.println(s +"  "));
    }

}
