package ketanglianxi;
//拓展：1.去空格：trim(),去掉前后两端的空格
public class Test07 {
    public static void main(String[] args) {
        String s="  abc ";
        System.out.println(s);
        String s1=s.trim();
        System.out.println(s1);
        String s2=s.toUpperCase();
        System.out.println(s2);
        String s3=s2.toLowerCase();
        System.out.println(s3);
    }
}
