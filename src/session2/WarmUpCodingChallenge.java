package session2;

public class WarmUpCodingChallenge {

    public static void main(String[] args) {


        String s = combinationOfBoth("hi", "there");
        System.out.println(s);
    }


    //Given this method accepts 2 String arguments,
    //return a String where a and b have been combined
    //e.g hello world -> hweolrld
    // hi abcd  -> haibcd
    // hello ab  -> halblo
    public static String combinationOfBoth(String a, String b){

        StringBuilder result = new StringBuilder();
        int i = 0, y = 0;

        while ( i < a.length() || y < b.length() ){

            if (i < a.length()){
                result.append(a.charAt(i));
                i++;
            }

            if (y < b.length()){
                result.append(b.charAt(y));
                y++;
            }
        }
        return result.toString();
    }

}










