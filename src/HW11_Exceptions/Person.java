package HW11_Exceptions;
import java.util.Objects;
import java.util.Scanner;
public class Person {
    Scanner scanner = new Scanner(System.in);
    private final String userName = "IvanIvanov";
    private final String eMail = "ivanov999@gmail.com";
    private final String login = "ivan007";
    private final String password = "Ivan123456789";

    public String getUserName() {
        return userName;
    }
    public String geteMail() {
        return eMail;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public Person() {
    }

    void getMyUserName() throws Exception {
        System.out.println("Введите Ваш UserName");
        String userName = scanner.nextLine();
        try {
            if (Objects.equals(userName, getUserName())) {
                System.out.println("Спасибо! Теперь введите ваш e-Mail: ");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            while (!Objects.equals(userName, getUserName())) {
                System.out.println("Неверный UserName, повторите ввод: ");
                userName = scanner.nextLine();
            }
            System.out.println("Спасибо! Теперь введите ваш e-Mail: ");
        }
    }

    void getMyEmail() throws Exception {
        String eMail = scanner.nextLine();
        try {
            if (Objects.equals(eMail, geteMail())) {
                System.out.println("Спасибо! Теперь введите ваш логин: ");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            while (!Objects.equals(eMail, geteMail())) {
                System.out.println("Неверный eMail, повторите ввод: ");
                eMail = scanner.nextLine();
            }
            System.out.println("Спасибо! Теперь введите ваш логин: ");
        } catch (Error e) {
            System.out.println("Ошибка в системе:(");
        }
    }

    void getMyLogin() throws Exception {
        String login = scanner.nextLine();
        try {
            if (Objects.equals(login, getLogin())) {
                System.out.println("Спасибо! Теперь введите ваш пароль: ");
            } else {
                throw new Exception();
            }
        } catch (Exception | Error e) {
            while (!Objects.equals(login, getLogin())) {
                System.out.println("Неверный логин, повторите ввод: ");
                login = scanner.nextLine();
            }
            System.out.println("Спасибо! Теперь введите ваш пароль: ");
        }
    }

    void getMyPassword() throws Exception {
        String password = scanner.nextLine();
        try {
            if (Objects.equals(password, getPassword())) {
                System.out.println("Отлично! Вы вошли в свой аккаунт");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            while (!Objects.equals(password, getPassword())) {
                System.out.println("Неверный пароль, повторите ввод: ");
                password = scanner.nextLine();
            }
            System.out.println("Отлично! Вы вошли в свой аккаунт");
        } finally {
            System.out.println("Здравствуйте " + getUserName() + "! Чек об оплате будет выслан на Ваш e-Mail: " + geteMail());
        }
    }

}

