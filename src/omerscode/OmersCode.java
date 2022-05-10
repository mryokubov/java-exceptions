package omerscode;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OmersCode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> mapDB = new HashMap<>();

        System.out.print("Enter your PHONE number : ");
        boolean flagPhone = true;
        String phone = null;
        while (flagPhone) {
            try {
                phone = scanner.nextLine();
                if (phone.length() == 10) {
                    String phone10Digits = phone.replaceAll("\\D", "");
                    flagPhone = phone10Digits.length() != 10;
                    System.out.println("Your phone number is " + phone10Digits);
                } else {
                    System.out.print("Please enter only 10 digit numbers! (e.g. --> 1234567890) : ");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }//while Phone Number

        System.out.print("Please enter your FIRST name (e.g. --> abc) : ");
        boolean flagFirstName = true;
        String firstNameCapital = null;
        while (flagFirstName) {
            try {
                String firstName = scanner.nextLine();
                if (firstName.length() < 3) {
                    System.out.print("Enter minimum 3 alphabetical input! : ");
                } else {
                    firstNameCapital = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
                    flagFirstName = firstNameCapital.length() < 3;
                }
            } catch (Exception e) {
                e.printStackTrace();
                flagFirstName = false;
            }
        }//while First Name

        System.out.print("Please enter your LAST name (e.g. --> abc) : ");
        boolean flagLastName = true;
        String lastName = null;
        while (flagLastName) {
            try {
                lastName = scanner.nextLine().toUpperCase();
                if (lastName.length() < 3) {
                    System.out.print("Enter minimum 3 alphabetical input! : ");
                } else {
                    flagLastName = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }//while Last Name


        System.out.print("Please enter your BIRTH YEAR (e.g. --> 1990) : ");
        boolean flagAge = true;
        int birthYear = 0;
        while (flagAge) {
            try {
                birthYear = scanner.nextInt();
                if (birthYear > 1922 && birthYear < 2004) {
                    System.out.println("You are " + (2022 - birthYear) + " years old.");
                    System.out.print("If your age is right --> (y), if Not (n) : ");
                    String yesOrNo = scanner.next().toLowerCase();
                    switch (yesOrNo) {
                        case "y":
                            System.out.println("Thank you for confirm.");
                            flagAge = false;
                            break;
                        case "n":
                            System.out.print("Enter your Age : ");
                            int age = scanner.nextInt();
                            flagAge = false;
                            break;
                        default:
                            System.out.println("Only enter, y or n");
                    }//yesOrNo
                } else {
                    System.out.print("Enter a valid year between (1922-2004) --> : ");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }//while

        System.out.print("Please enter your ZIPCODE (e.g. --> 12345) : ");
        boolean flagZipcode = true;
        int zipcode = 0;
        while (flagZipcode) {
            zipcode = scanner.nextInt();
            if (zipcode < 10000 || zipcode > 99999) {
                System.out.print("Please make sure your zipcode, Try again : ");

            } else {
                flagZipcode = false;
            }
        }


        System.out.println("Thanks for sharing your information.");

        String data = firstNameCapital + " " + lastName + " , Age : " + (2022 - birthYear) + " , ZipCode : " + (zipcode);

// adding data to map
        mapDB.put(phone, data);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("TechCenture.txt", true));
            writer.write("Batch 6's students data : ");
            for (Map.Entry<String, String> entry : mapDB.entrySet())
                writer.write( "\n" + entry.getKey() + " " + entry.getValue() );

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("TechCenture.txt"));
            String readLines;
            while ((readLines = reader.readLine()) != null) {
                System.out.println(readLines);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
