package ketanglianxi;
/**
 * char[] toCharArray():将字符串转换为新的字符数组；
 * byte[] getByte():转为新的字节数组
 * replace(char,char):将前面的字符换成后面的字符
 * */
public class Test05 {
    public static void main(String[] args) {
        String s1=new String("abcdef");
        //转换为字节，打印出来
        byte[] s2=s1.getBytes();
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
        String s3= s1.replace("b", "B");
        System.out.println(s3);
        for(int j=0;j<s1.length();j++){
            System.out.println(s1.charAt(j));
        }
    }
}
