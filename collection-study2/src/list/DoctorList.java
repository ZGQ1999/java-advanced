package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoctorList {
    public static void main(String[] args) {
        List<Doctor> list = new ArrayList<>();
        list.add(new Doctor("徐鹏",20));
        list.add(new Doctor("田震",21));
        list.add(new Doctor("小白",19));
        list.add(new Doctor("龙傲",20));
        Collections.sort(list);
        for (Doctor doctor : list) {
            System.out.println("姓名："  + doctor.getName() +   "  "  +  "年龄:" +   doctor.getAge());
        }
    }
}
