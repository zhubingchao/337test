package ketanglianxi;

import java.util.Arrays;

//将一个随机字符串，升序排列，倒序打印
public class Test11 {
    public static void main(String[] args) {
        String s="ahbvab";
        char[] s1=s.toCharArray();
        System.out.println(s1);
        Arrays.sort(s1);
        System.out.println(s1);
        for (int i = s1.length-1; i>=0; i--) {
            System.out.print(s1[i]+" ");
        }
    }

}
