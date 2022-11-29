package HW33_Object;

import java.util.Objects;

public class User implements Cloneable{
    //Создать класс для описания пользователя системы.
    // Переопределить в классе методы toString, hashcode и equals.
    private final String name;
    private final int age;
    private final String eMail;

    public User(String name, int age, String eMail) {
        this.name = name;
        this.age = age;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return  "name: " + name +
                ", age: " + age +
                ", eMail: " + eMail +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(eMail, user.eMail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, eMail);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
