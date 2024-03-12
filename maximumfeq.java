import java.util.*;

public class maximumfeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        int[] feq= new int[26];
        for(int i= 0;i < s.length();i++){
            char ch = s.charAt(i);
            int idex = (int)ch-97;
            feq[idex]++;
        }
        int maxfeq=-1;
        for(int i =0; i< s.length(); i++){
            maxfeq = Math.max(maxfeq,feq[i]);

        }
        for(int i =0; i< s.length(); i++){
            if(feq[i]==maxfeq){
                char ch = (char)(i+97);
                System.out.print(ch+" ");
            }

        }

    }
}
