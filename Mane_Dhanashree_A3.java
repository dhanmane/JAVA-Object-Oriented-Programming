import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mane_Dhanashree_A3 {
    private static void Capitalize(String S){
        StringBuilder sb =new StringBuilder(S.length());
        String[] S1 =S.split(" "); //created string array
        for (int i=0; i<S1.length; i++) {
            sb.append(Character.toUpperCase(S1[i].charAt(0))).append(S1[i].substring(1)).append(" "); //first letter of each word is capitalized
            // and appended with remaining letters in lowercase with space
        }
        System.out.println("Capital paragraph: " + sb);
    }
    private static void Reverse(String Str) {
        String st = "";
        String a[] = Str.split(" ");

        for (int i = a.length - 1; i >= 0; i--) {
            st = st + a[i] + " ";
        }
        System.out.println("Reverse of last line: " + st +".");
    }

    private static void CountWords(String s1)
    {
        String[] strArray = s1.split(" ");//Created array of the given string
        int count =0;
        for (String s: strArray)
        { if (!s.equals(""))//when string is not equal to spaces
        {count++; } //count the words and not the spaces.
        }
    System.out.println("Total number of words in the quotes are: "+ count);}
    public static void main(String[] args)
    {
        String Str1= "My brother has his sword; King Robert has his Warhammer and I have my mind and a mind needs books " +
                "as a sword needs a whetstone if it is to keep its edge. " +
                "That's why I read so much Jon Snow. Every sword has its name.";
        int i = 0;
        Pattern p = Pattern.compile("sword");
        Matcher m = p.matcher( Str1 );
        while (m.find()) {
            i++;
        }
        System.out.println("Occurrences of "+ "\"" + "sword" +"\": " + i);
        Capitalize(Str1);
        CountWords(Str1);
        String Lastline = "Every sword has its name";
        Reverse(Lastline);

    }

    }
