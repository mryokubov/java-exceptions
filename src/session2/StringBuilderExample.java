package session2;

import java.util.List;

public class StringBuilderExample {
    public static void main(String[] args) {


        System.out.println(reverse("hello world!"));


        List<Integer> integers = List.of(1, 2, 3, 4, 5);

    }

    public static String reverse(String str){
//        String temp = "";
//        for (int i = str.length()-1; i >= 0 ; i--) {
//            temp += str.charAt(i);
//        }
//        return temp;

        return new StringBuilder(str).reverse().toString();
    }
}
