package session2;

public class ThrowExample {

    public static void main(String[] args) {

        int age = calculateAgeFromBirthYear(-1945);

        System.out.println(age);

    }


    public static int calculateAgeFromBirthYear(int yearOfBirth){

        if (yearOfBirth < 0){
            throw new RuntimeException("BirthYear cannot be negative");
        }

        return 2022 - yearOfBirth;
    }
}
