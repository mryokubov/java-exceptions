package session1;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {

        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter birth year");
                int birthYear = scanner.nextInt();

                int currentYear = 2022;

                int age = currentYear - birthYear;

                System.out.println("YOUR AGE: " + age);

                String str = null;
                System.out.println(str.length());

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
