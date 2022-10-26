public class Person {
    public int age;


    public Person(int age) throws PersonException {
        this.age = age;
        if (age < 18) {
            throw new PersonException();
        }

    }
}
