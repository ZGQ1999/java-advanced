package list;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "田震"));
        list.add(new Student(2, "徐鹏"));
        list.add(new Student(3, "许源"));
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(4, "孟妮"));
        list1.add(new Student(5, "姚思佳"));
        list1.add(new Student(6, "王欢乐"));

        Map<String, List<Student>> map = new HashMap<>();
        map.put("男生", list);
        map.put("女生", list1);
        System.out.println("********按性别区分学生***********");

        Iterator<Map.Entry<String, List<Student>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Student>> entry = iterator.next();
            System.out.println(entry.getKey());
            List<Student> list2 = entry.getValue();
            for (Student s : list2) {
                System.out.println("名字：" + s.getName() + "       " + "学号：" + s.getId());
                System.out.println();
            }

        }
    }
}
