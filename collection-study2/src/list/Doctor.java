package list;

/**
 * created by 国庆
 * 2019.03.20
 */

public class Doctor implements Comparable<Doctor>{
    private String name ;
    private Integer age ;


    public Doctor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Doctor doctor) {
        return this.getAge() - doctor.getAge();
    }
}
