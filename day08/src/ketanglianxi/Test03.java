package ketanglianxi;
/*equals:比较字符串的内容；
        equalsIgnoreCase:比较字符串内容，忽略大小写。*/
public class Test03 {
    public static void main(String[] args) {
        String s1="abc";
        String s2=new String("abc");
        String s3="AbC";
        boolean result=s1.equals(s3);
        System.out.println(result);
        boolean result1=s2.equalsIgnoreCase(s3);
        System.out.println(result1);
    }
}
