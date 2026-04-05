import java.util.Arrays;
public class strrotate {
    public static char[] leftrotate(String s1,int lr){
        char[] s2=new char[s1.length()];
        for(int i=0;i<s1.length();i++){
            s2[(s1.length()-lr+i)%s1.length()]=s1.charAt(i);
        } return s2;
    }
    public static char[] rightrotate(String s1,int rr){
        char s2[]=new char[s1.length()];
        for(int i=0;)
    }
}
