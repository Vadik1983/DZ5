import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        phoneBook();
    }
    /*
    Реализуйте структуру телефонной книги с помощью HashMap,
    учитывая, что 1 человек может иметь несколько телефонов.
    Иванов   123456
    Васильев 321456
    Петров   234561
    Иванов   234432
    Петров   654321
    Иванов   345678
     */
    static void phoneBook(){
        PhoneBook phone = new PhoneBook();
        phone.add("123456", "Иванов");
        phone.add("321456", "Васильев");
        phone.add("234561", "Петров");
        phone.add("234432", "Иванов");
        phone.add("654321", "Петров");
        phone.add("345678", "Иванов");
        //System.out.println(phone.getByNumPhone("123456"));
        System.out.println(phone.getByLastname("Иванов"));
        //System.out.println(phone.getAllContact());
    }
}