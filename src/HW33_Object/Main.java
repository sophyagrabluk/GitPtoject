package HW33_Object;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        // Создать экземпляр класса.
        User user1 = new User("Alex", 34, "alex999@gmail.com");
        // Затем склонировать полученный обьект и сравнить между собой оригинал и копию через equals.
        User cloneOfUser = (User) user1.clone();
        System.out.println(user1.equals(cloneOfUser));
        // Вывести значения методов hashCode, toString.
        System.out.println("The hashCode of User1 is " + user1.hashCode() + "\n" + user1);
        System.out.println("The hashCode of CloneOfUser is " + cloneOfUser.hashCode()+ "\n" + cloneOfUser);
    }
}
