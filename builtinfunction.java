
import java.util.*;
public class builtinfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(s.indexOf('d'));
        String s1 = "hello world";
        String s2 = "siddhant";


        System.out.println(s1.compareTo(s2));
        System.out.println(s1.startsWith("hel"));
        System.out.println(s2.startsWith("si"));
        // use of concat function
        String s3 = s1.concat(s2);
        System.out.println(s3+" ");
        // string + int/str/char
        String str = "abc";
        str = str+"def"+(20+10);

        System.out.println(str);

    }
}
