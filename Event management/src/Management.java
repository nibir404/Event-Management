import java.util.Random;
import java.util.Scanner;

public class Management {
    public static void Person(){
        String name;
        String address;
        int age;
        String contact;
        int token = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = sc.next();

        System.out.println("Enter your address : ");
        address = sc.next();


        System.out.println("Enter your contact : ");
        contact = sc.next();
        contact.length();
            if (contact.length() == 0 || contact.length() >11){
                System.out.println("Please enter a valid number sir");
                Person();
            }

        System.out.println("Enter age : ");
        age = sc.nextInt();
            if (age == 0 || age<18 ){
                System.out.println("You are illegible , please try again ");
            Person();
            }
        Random random = new Random();
            token = random.nextInt(9999);

            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Contact : "+contact);
            System.out.println("Address : "+address);
            System.out.println("Token no : "+token);

    }

    public static void show (){
        Person();
    }
}
