package session1;


import java.util.Scanner;

public class ExceptionsIntro {

    public static void main(String[] args) {



        //try catch block - which is used to handle/catch exceptions

        try{
            Scanner scanner = null;

            scanner.nextLine();

        }catch (Exception e ){

        }












    }
}


class Animal{
    public void run(){
        System.out.println("Animal running");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal{
    public void drinkMilk(){
        System.out.println("Cat is drinking Milk");
    }
}

